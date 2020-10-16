package easy;

import java.util.Scanner;

public class Day1016_4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=1;
		//입력된 토큰이 있으면 true, 없으면 false 를 리턴한다.
		while(scan.hasNext()) {
			String s=scan.nextLine();
			System.out.println(i+" "+s);
			i++;
		}
		
	}
}