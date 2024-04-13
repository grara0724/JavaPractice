
public class UseFigure {

	public static void main(String[] args) {
		Figure[] figures = { new Triangle(12, 2), new Circle(4), new Square2(4, 6) };

		for (int i = 0; i < figures.length; i++) {

			System.out.println("図形" + (i + 1) + "の面積:" + figures[i].getArea());
		}

	}

}
