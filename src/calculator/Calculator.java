package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		//사용자로부터 2개의 숫자 값을 입력 받은 후 2개의 숫자 값을 활용해 사칙연산을 계산하라.
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번쨰 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		System.out.println("두 번쨰 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		System.out.println("덧셈 : " + (first + second));
		System.out.println("뺄셈 : " + (first - second));
		System.out.println("곱셈 : " + (first * second));
		System.out.println("나눗셈 : " + (first / second));
		
	}
}
