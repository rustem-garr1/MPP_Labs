package MPP_Labs.Lab4.taskE;

abstract class Account {
    protected String accountId;
    protected double balance;

    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public abstract double computeUpdatedBalance();
}
