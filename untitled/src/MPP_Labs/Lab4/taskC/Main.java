package MPP_Labs.Lab4.taskC;

public class Main {
    public static void main(String[] args) {
        Employee hourly = new Hourly("H001", 20, 40);
        Employee salaried = new Salaried("S001", 5000);

        Commisioned commissioned = new Commisioned("C001", 3000, 0.1);
        // Add orders
        commissioned.addOrder(new Order(1, 1, 2025, 10000));
        commissioned.addOrder(new Order(2, 1, 2025, 5000));

        // Calculate, print paychecks
        hourly.calcCompensation(1, 2025).print();
        salaried.calcCompensation(1, 2025).print();
        commissioned.calcCompensation(1, 2025).print();
    }
}
