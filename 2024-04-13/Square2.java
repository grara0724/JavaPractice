
public class Square2 extends Figure {
	private int height;
	private int width;

	public Square2(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public double getArea() {
		double result = height * width;
		return result;

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
