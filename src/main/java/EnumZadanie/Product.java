package EnumZadanie;

public class Product {

    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight, ProductType productType) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public ProductType getProductType() {
        return productType;
    }

    private ProductType productType;
}
