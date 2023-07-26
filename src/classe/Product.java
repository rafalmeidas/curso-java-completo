package classe;

public class Product {
    private String name;
    private double price;
    private double discount;

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }

    public double getDiscount() {
        return discount;
    }

    public Product setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    double priceWithDiscount() {
        return price * (1 - discount);
    }

    double priceWithDiscount(double managerDiscount) {
        return price * (1 - discount + managerDiscount);
    }
}
