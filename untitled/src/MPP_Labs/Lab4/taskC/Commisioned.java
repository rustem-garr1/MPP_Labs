package MPP_Labs.Lab4.taskC;
import java.util.*;

public class Commisioned extends Employee{
    private final double baseSalary;
    private final double commissionRate;
    private final List<Order> orders;

    public Commisioned(String empId, double baseSalary, double commissionRate) {
        super(empId);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalCommission = 0.0;
        for (Order order : orders) {
            if (order.getMonth() == month && order.getYear() == year) {
                totalCommission += order.getOrderAmount() * commissionRate;
            }
        }

        return baseSalary + totalCommission;
    }
}
