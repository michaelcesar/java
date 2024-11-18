package bank;

public class Savings extends Account {
    private static final double limit_withdrawal = 1000.0;

    public Savings(String numberAccount, String holder, double balance) {
        super(numberAccount, holder, balance);
    }

    @Override
    public void withdraw(double value) throws InsufficientBalance, InvalidValue {
        if (value < 0) {
            throw new InvalidValue("O valor do saque não pode ser negativo.");
        }
        if (value > limit_withdrawal) {
            throw new InsufficientBalance("Limite de saque excedido para a conta poupança.");
        }
        if (value > getbalance()) {
            throw new InsufficientBalance("Balanço insuficiente para realizar o saque.");
        }
        setbalance(getbalance() - value);
    }

    @Override
    public void deposit(double value) throws InvalidValue {
        if (value < 0) {
            throw new InvalidValue("O valor do depósito não pode ser negativo.");
        }
        setbalance(getbalance() + value);
    }
}
