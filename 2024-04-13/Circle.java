
public class Circle extends Figure {
	static double PAI = 3.14;
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		double result = radius * radius * PAI;
		return result;
	}

	public double getR() {
		return radius;
	}

	public void setR(double radius) {
		this.radius = radius;
	}
}
