package MPP_Labs.Lab3.task3b;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(3, 5);
        System.out.println(circle.computeArea());
        System.out.println(cylinder.computeVolume());
    }
}
