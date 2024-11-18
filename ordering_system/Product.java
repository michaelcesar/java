package ordering_system;

public abstract class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public double getprice() {
        return price;
    }

    public abstract double calcDiscount();

    @Override
    public String toString() {
        return "Produto | ID: " + id + ", Nome: " + name + ", Preço: R$ " + price;
    }
}
