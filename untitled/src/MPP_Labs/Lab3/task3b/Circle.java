package MPP_Labs.Lab3.task3b;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double computeArea(){
        return Math.PI * radius * radius;
    }
}
