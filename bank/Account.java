package bank;

public abstract class Account {
    private String numberAccount;
    private String holder;
    private double balance;

    public Account(String numberAccount, String holder, double balance) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        this.balance = balance;
    }

    public String getnumberAccount() {
        return numberAccount;
    }

    public String getholder() {
        return holder;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double value) throws InsufficientBalance, InvalidValue;
    public abstract void deposit(double value) throws InvalidValue;
}
