import java.util.Scanner;

public class Keybord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("文字列を入力してください:");
		String a = scan.nextLine();
		System.out.println("入力された文字数は:" + a.length() + "です");

		if (a.indexOf("today") != -1) {
			System.out.println("todayが含まれています。");
		} else {
			System.out.println("todayが含まれていません。");

		}

	}

}
