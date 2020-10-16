package easy;

import java.util.Scanner;
//데이터 타입
public class Day1016_3 {
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			/*
			 * byte, short, int, log 크기 구하기
			 */
			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)System.out.println("* byte");
				if (x >= -32768 && x <= 32767)System.out.println("* short");
				Double intLeng =Math.pow(2, 31);
				Double longLeng=Math.pow(2,63);
				if (x >= -intLeng && x <= intLeng-1)System.out.println("* int");
				if (x >= -longLeng && x <= longLeng-1)System.out.println("* long");
				// Complete the code
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
				
			}

		}
	}
}
