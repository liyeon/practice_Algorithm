package easy;

import java.util.Scanner;

public class Day1016_2 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		// 쿼리 수를 나타냄
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			//???? 모르겠음..
			for (int j = 0; j < n; j++) {
				a = a + b * (int) Math.pow(2, j);
				//c+=Math.pow(2, b);
				System.out.print(a + " ");
			}

			System.out.print("\n");
		}
		in.close();
	}
}