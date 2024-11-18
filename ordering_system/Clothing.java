package ordering_system;

public class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calcDiscount() {
        return getprice() * 0.8;
    }
}
