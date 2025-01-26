package MPP_Labs.Lab3.task3;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double computeVolume(){
        return super.computeArea() * height;
    }
}
