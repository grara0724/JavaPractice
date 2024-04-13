
public class ColorPoint extends Point2 {

	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void showPoint() {
		super.showPoint();
		System.out.println("color:" + color);

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
