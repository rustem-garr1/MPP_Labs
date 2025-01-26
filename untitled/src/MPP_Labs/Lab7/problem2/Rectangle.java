package MPP_Labs.Lab7.problem2;

public final class Rectangle implements ClosedCurve, Polygon {
	final private double width;
	final private double length;
	
	@Override
	public double computePerimeter() {
		return Polygon.super.computePerimeter();
	}

	@Override
	public double[] getSides(){
		double[] sides = {width, length, width, length};
		return sides;
	}

	public Rectangle(double width, double length) {	
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
}
