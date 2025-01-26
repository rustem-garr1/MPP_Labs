package MPP_Labs.Lab3.task3b;

public class Cylinder {
    private Circle circle;
    private double height;

    public Cylinder(double radius, double height){
        circle = new Circle(radius);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double computeVolume(){
        return circle.computeArea() * height;
    }
}
