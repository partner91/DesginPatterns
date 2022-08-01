package hr.hrsak;

public class BankAccountCommand implements Command{

    private BankAccount account;
    private boolean succeed;

    @Override
    public void call() {
        switch (action) {
            case DEPOSIT -> {
                succeed = true;
                account.deposit(amount);
            }
            case WITHDRAW -> {
                succeed = account.withdraw(amount);
            }
        }
    }

    @Override
    public void undo() {
        if (!succeed) return;
        switch (action) {
            case DEPOSIT -> {
                account.withdraw(amount);
            }
            case WITHDRAW -> {
                account.deposit(amount);
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
