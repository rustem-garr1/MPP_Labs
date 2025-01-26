package MPP_Labs.Lab4.taskC;

public class Hourly extends Employee {
    private final double hourlyWage;
    private final int hoursPerWeek;

    public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4; // Assume 4 weeks in a month
    }
}
