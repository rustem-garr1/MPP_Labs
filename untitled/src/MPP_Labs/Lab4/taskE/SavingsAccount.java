package MPP_Labs.Lab4.taskE;

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountId, double interestRate, double balance) {
        super(accountId, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }
}
