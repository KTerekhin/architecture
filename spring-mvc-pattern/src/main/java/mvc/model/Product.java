package mvc.model;

public class Product {
    private Long id;
    private String title;
    private float cost;

    public Product(Long id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Продукт: [id: %d, name: %s, cost: %f]", id, title, cost);
    }
}
