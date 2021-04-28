package ru.gb.identity_map;


import ru.gb.model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductIdentityMap {
    private Map<Long, Product> productMap = new HashMap<>();

    public void addProduct(Product Product) {
        productMap.put(Product.getId(), Product);
    }

    public void getProduct(Long id) {
        productMap.get(id);
    }
}
