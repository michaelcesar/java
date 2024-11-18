package ordering_system;

public class Pix implements Payment {
    @Override
    public boolean processPayment(double value) {
        System.out.println("Processando pagamento de R$ " + value + " usando pix...");
        return true;
    }
}
