
public class Array3 {

	public static void main(String[] args) {

		int[] ary1 = { 1, 2, 3, 4, 5 };
		int[] ary2 = { 6, 7, 8, 9, 10 };
		int[] ary3 = new int[5];
		for (int a = 0; a < 5; a++) {
			ary3[a] = ary1[a] + ary2[a];
		}
		for (int a3 : ary3) {
			System.out.println(a3);
		}

	}
}