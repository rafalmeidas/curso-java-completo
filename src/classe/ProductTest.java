package classe;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Notebook")
                .setPrice(4356.89)
                .setDiscount(0.25);

        var p2 = new Product();
        p2.setName("Caneca Preta")
                .setPrice(12.56)
                .setDiscount(0.29);

        double finalPrice1 = p1.priceWithDiscount();
        double finalPrice2 = p2.priceWithDiscount(0.1);
        double mediaCart = (finalPrice1 + finalPrice2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCart);
    }
}
