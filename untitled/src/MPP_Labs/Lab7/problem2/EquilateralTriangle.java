package MPP_Labs.Lab7.problem2;

public class EquilateralTriangle implements ClosedCurve{
    final private double side;


    @Override
    public double computePerimeter(){
        return side * 3;
    }

    public EquilateralTriangle(double side){
        this.side=side;
    }

    public double getSide(){
        return side;
    }
}
