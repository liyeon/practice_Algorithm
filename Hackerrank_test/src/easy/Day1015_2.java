package easy;

import java.util.Scanner;

public class Day1015_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		int i= Integer.parseInt(num);
		String doub =scan.nextLine();
		Double d= Double.parseDouble(doub);
		String s =scan.nextLine();
		/*
		 * 첫 번째 줄에는 정수 가 포함 됩니다.
		 * 두 번째 줄에는 double이 포함 됩니다.
		 * 세 번째 줄에는 String이 포함 됩니다
		 */
		
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}