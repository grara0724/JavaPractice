
public class UsePoint {

	public static void main(String[] args) {
		Point2[] points = { new Point2(3, 9),
				new ColorPoint(12, -3, "RED"),
				new Point2(56, 2),
				new ColorPoint(7, -28, "BLUE") };

		for (Point2 p : points) {
			p.showPoint();
			System.out.println("");
		}
	}

}
