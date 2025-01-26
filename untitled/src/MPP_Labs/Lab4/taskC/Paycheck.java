package MPP_Labs.Lab4.taskC;

public class Paycheck {
    private final double grossPay, fica, state, local, medicare, socialSecurity, netPay;

    public Paycheck(double grossPay, double fica, double state, double local,
                    double medicare, double socialSecurity, double netPay) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        this.netPay = netPay;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getNetPay() {
        return netPay;
    }

    public void print() {
        System.out.printf("Gross Pay: %.2f, Net Pay: %.2f%n", grossPay, netPay);
    }
}
