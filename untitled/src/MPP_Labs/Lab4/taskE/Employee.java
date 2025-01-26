package MPP_Labs.Lab4.taskE;
import java.util.*;

class Employee {
    private String name;
    private List<Account> accounts;

    public Employee(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public double computeUpdatedBalanceSum() {
        double sum = 0;
        for (Account account : accounts) {
            sum += account.computeUpdatedBalance();
        }
        return sum;
    }
}
