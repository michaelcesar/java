package ordering_system;

public class Eletronic extends Product {
    public Eletronic(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calcDiscount() {
        return getprice() * 0.9;
    }
}
