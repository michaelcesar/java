package bank;

public class BankSystem {

    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount("001", "Michael", 5000.00);
        Savings savings = new Savings("002", "César", 1500.00);
        Transaction transaction = new Transaction();

        try {
            transaction.withdraw(currentAccount, 300.00);
            transaction.deposit(savings, 500.00);
            transaction.withdraw(savings, 1500.00);
        } catch (InsufficientBalance | InvalidValue e) {
            System.out.println("Falha: " + e.getMessage());
        }

        System.out.println("Balanço da conta corrente: R$ " + currentAccount.getbalance());
        System.out.println("Balanço da conta poupança: R$ " + savings.getbalance());
    }
}
