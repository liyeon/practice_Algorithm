
package easy;

import java.util.Scanner;

public class Day1015 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		//1이상  100이하인 정수 에서
		if(N>=1 || N<=100){
			// 홀수이면 Weird 출력
            if(N%2 != 0){
                System.out.println("Weird");
            }else if(N>=6 && N<=20) { 
                System.out.println("Weird");
            }else if(N>=2 && N<=5) {
                System.out.println("Not Weird");
            }else if(N%2 == 0){
                System.out.println("Not Weird");
            }
        };

		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();
		/* 테스트 케이스
		 * 24 -> Not Weird
		 * 4 -> Not Weird
		 * 18 -> Weird
		 * 29 -> Weird
		 * 5 -> Weird
		 * 100 -> Not Weird
		 * 20 ->  Weird
		 */
	}
}
