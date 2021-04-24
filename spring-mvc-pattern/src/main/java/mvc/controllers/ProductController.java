package mvc.controllers;

import mvc.model.Product;
import mvc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public String productInfo(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product_info";
    }

    @PostMapping("/add_product")
    public String addProduct(@RequestParam String title, @RequestParam float cost) {
        Long id = 6L;
        Product product = new Product(id, title, cost);
        productService.addProduct(product);
        id++;
        return "redirect:/product_info";
    }
}
