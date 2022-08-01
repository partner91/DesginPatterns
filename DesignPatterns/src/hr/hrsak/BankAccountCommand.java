package hr.hrsak;

public class BankAccountCommand implements Command{

    private BankAccount account;

    @Override
    public void call() {
        switch (action) {
            case DEPOSIT -> {
                account.deposit(amount);
            }
            case WITHDRAW -> {
                account.withdraw(amount);
            }
        }
    }

    public enum Action
    {
        DEPOSIT,
        WITHDRAW
    }

    private Action action;
    private int amount;

    public BankAccountCommand(BankAccount account, Action action, int amount) {
        this.account = account;
        this.action = action;
        this.amount = amount;
    }
}
