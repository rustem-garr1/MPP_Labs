package MPP_Labs.Lab7.problem2;

public class Ellipse implements ClosedCurve {
    // Fields for the semi-major axis (a) and semi-minor axis (b)
    final private double semiMajorAxis;
    final private double semiMinorAxis;

    // Constructor
    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    // Getters and setters
    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    @Override
    public double computePerimeter() {
        double a = semiMajorAxis;
        double b = semiMinorAxis;
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}

