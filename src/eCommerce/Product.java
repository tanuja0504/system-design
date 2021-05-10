package eCommerce;

public class Product {
    String name;
    Category category;
    int availabilityCount;
    float price;
    String description;

    int getAvailableCount() {
        return availabilityCount;
    }
}
