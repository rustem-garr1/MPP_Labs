package MPP_Labs.Lab7.problem2;

public interface Polygon {
    public double[] getSides();
    default double computePerimeter(){
        double result = 0;
        double sides[] = getSides();
        for(double perem:sides){
            result+=perem;
        }
        return result;
    }
}
