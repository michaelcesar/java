package ordering_system;

public class OrderSystem {
    public static void main(String[] args) {

        Product phone = new Eletronic(1, "Iphone 11", 1500.00);
        Product shirt = new Clothing(2, "Camisa de algodão", 100.00);


        Payment card = new Card();
        Payment pix = new Pix();

        System.out.println("Detalhes do produto: " + phone);
        double discountPhone = phone.calcDiscount();
        System.out.println("Preço com desconto: R$ " + discountPhone);
        card.processPayment(discountPhone);

        System.out.println();

        System.out.println("Detalhes do produto: " + shirt);
        double discountShirt = shirt.calcDiscount();
        System.out.println("Preço com desconto: R$ " + discountShirt);
        pix.processPayment(discountShirt);
    }
}
