package MPP_Labs.Lab4.taskC;

public class Salaried extends Employee{
    private final double salary;

    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }
}
