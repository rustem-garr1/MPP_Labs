package MPP_Labs.Lab4.taskE;
import java.util.*;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.computeUpdatedBalanceSum();
        }
        return sum;
    }
}
