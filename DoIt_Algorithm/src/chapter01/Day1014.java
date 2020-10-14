package chapter01;

import java.util.Scanner;

public class Day1014 {
		public static void main(String[] args) {
		//3개의 정수값을 입력하고 최대값을 구한다.
		Scanner scan = new Scanner(System.in);
		System.out.println("세개의 정수값 중 최대값을 구합니다.");
		
		System.out.println("a의 값 :");int a=scan.nextInt();
		System.out.println("b의 값 : ");int b=scan.nextInt();
		System.out.println("C의 값 : ");int c=scan.nextInt();
		//1. max 에 a 값을 넣는다.
		int max = a;
		//2. b값이 max보다 크면 max에 b 값을 넣는다.
		if(b>max) max =b;
		//3. c값이 max 보다 크면 max 에 c 값을 넣는다.
		if(c>max) max=c;
		
		System.out.println("최대값은 " + max + "입니다.");
		/*
		-- 순차적 ( Concatenation) 구조
		3문장이 아래로 나란히 있다면 순서대로 실행된다.
		여러문장(프로세스)가 순차적으로 실행되는 구조를 순차적 구조라고 한다.
		
		-- 선택( selection) 구조
		1이 단순한 대입이라면 
		2,3은 if 문이다.
		() 안에 있는 식의 평가 결과에 따라 프로그램의 실행 흐름을 변경하는 if 문을 선택(selection)구조라고 한다.
		*/
		
	}
}