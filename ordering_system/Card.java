package ordering_system;

public class Card implements Payment {
    @Override
    public boolean processPayment(double value) {
        System.out.println("Processando pagamento de R$ " + value + " usando cartão de crédito...");
        return true;
    }
}
