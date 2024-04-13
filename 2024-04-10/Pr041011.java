
import java.util.Scanner;

public class Pr041011 {
	public static void main(String[] args) {
		System.out.println("数値を入力してください:");
		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i <= 8; i++) {
			for (int m = 1; m <= n; m++) {
				if (i % 2 == 0) {
					System.out.print("□");
				} else {
					System.out.print("■");
				}

			}
			System.out.println(" ");
		}

	}
}