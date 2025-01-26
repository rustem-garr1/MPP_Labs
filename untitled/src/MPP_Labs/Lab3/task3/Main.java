package MPP_Labs.Lab3.task3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(3,5);

        System.out.printf("%.2f\n",circle.computeArea());
        System.out.printf("%.2f",cylinder.computeVolume());

    }
}
