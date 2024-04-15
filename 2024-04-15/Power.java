import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("値を入力して下さい。:");
		int n = scan.nextInt();
		int p = 1;
		for (int i = n; i > 0; i--) {
			p *= i;

		}
		System.out.println(p);

	}

}
