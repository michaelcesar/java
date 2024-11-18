package bank;

public class Transaction {

    public void withdraw(Account Account, double value) throws InsufficientBalance, InvalidValue {
        Account.withdraw(value);
        System.out.println("Saque de R$ " + value + " realizado com sucesso.");
    }

    public void deposit(Account Account, double value) throws InvalidValue {
        Account.deposit(value);
        System.out.println("Depósito de R$ " + value + " realizado com sucesso.");
    }
}
