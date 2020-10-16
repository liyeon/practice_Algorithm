package easy;

import java.util.Scanner;

public class Day1016_1 {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int i=1; i<=10; i++) {
        	int result=N*i;
        	System.out.println(N+" x "+i+" = "+result);
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}