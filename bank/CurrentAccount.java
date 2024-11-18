package bank;

public class CurrentAccount extends Account {
    private static final double rate = 2.0;

    public CurrentAccount(String numberAccount, String holder, double balance) {
        super(numberAccount, holder, balance);
    }

    @Override
    public void withdraw(double value) throws InsufficientBalance, InvalidValue {
        if (value < 0) {
            throw new InvalidValue("O valor do saque não pode ser negativo.");
        }
        if (value + rate > getbalance()) {
            throw new InsufficientBalance("Balanço da conta é insuficiente para realizar o saque.");
        }
        setbalance(getbalance() - (value + rate));
    }

    @Override
    public void deposit(double value) throws InvalidValue {
        if (value < 0) {
            throw new InvalidValue("O valor do depósito não pode ser negativo.");
        }
        setbalance(getbalance() + value);
    }
}
