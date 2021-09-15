package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		//사용자로부터 2개의 숫자 값을 입력 받은 후 2개의 숫자 값을 활용해 사칙연산을 계산하라.
//		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("첫 번쨰 입력 값: ");
//		int first = scanner.nextInt();
//		System.out.println(first);
//		
//		System.out.println("두 번쨰 입력 값: ");
//		int second = scanner.nextInt();
//		System.out.println(second);
//		
//		System.out.println("덧셈 : " + (first + second));
//		System.out.println("뺄셈 : " + (first - second));
//		System.out.println("곱셈 : " + (first * second));
//		System.out.println("나눗셈 : " + (first / second));
		
		//사칙연산 기호가 무엇인지에 따라 사칙연산을 실행하고 결과를 출력한다. 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번쨰 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		System.out.println("두 번쨰 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		System.out.println("기호 입력 값:");
		String symbol = scanner.next();
		System.out.println(symbol);
		
		if("+".equals(symbol)) {
			System.out.println(first + second);
		} else if("-".equals(symbol)) {
			System.out.println(first - second);
		} else if("*".equals(symbol)) {
			System.out.println(first * second);
		} else if("/".equals(symbol)) {
			System.out.println(first / second);
		} else {
			System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
		}
		
	}
}
