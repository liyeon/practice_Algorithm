package easy;

import java.util.Scanner;

public class Day1015_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// Complete this line
			//문자열이 15글자 이하면 오른쪽으로 공백 채우기
			System.out.printf("%-15s",s1);
			//공백을 0으로 채우기
            System.out.printf("%03d%n",x);
		}
		System.out.println("================================");

	}
}
