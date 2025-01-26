package MPP_Labs.Lab8.task2.A;

import java.util.Comparator;

public class ComparatorBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b){
        return (a.getSalary()>b.getSalary()) ? 1 : -1;
    }
}
