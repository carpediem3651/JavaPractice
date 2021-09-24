package calculator;

import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫 번쨰 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}
	
	static String getSymbol(Scanner scanner) {
		System.out.println("사칙연산 기호 : ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}
	
	static int getSecondValue(Scanner scanner) {
		System.out.println("두 번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}
	
	static int calculate(int first, String symbol, int second) {
		int result = 0;
		if(symbol.equals("+")) {
			result = first + second;
		System.out.println("덧셈 :" + result);
		} else if("-".equals(symbol)) {
			result = first - second;
		System.out.println("뺄셈 : " + result);
		} else if("*".equals(symbol)) {
			result = first * second;
		System.out.println("곱셈 : " + result);
		} else if("/".equals(symbol)) {
			result = first / second;
		System.out.println("나눗셈 : " + result);
		} else {
		System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
		}
		return result;
	}
	
	static void print(int result) {
		System.out.println("최종 결과 값 : " + result);
	}
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
		
		
		//사칙연산 기호가 무엇인지에 따라 사칙연산을 실행하고 결과를 출력한다. (조건문사용)
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("첫 번쨰 입력 값: ");
//		int first = scanner.nextInt();
//		System.out.println(first);
//		
//		System.out.println("두 번쨰 입력 값: ");
//		int second = scanner.nextInt();
//		System.out.println(second);
//		
//		System.out.println("기호 입력 값:");
//		String symbol = scanner.next();
//		System.out.println(symbol);
//		
//		if("+".equals(symbol)) {
//			System.out.println(first + second);
//		} else if("-".equals(symbol)) {
//			System.out.println(first - second);
//		} else if("*".equals(symbol)) {
//			System.out.println(first * second);
//		} else if("/".equals(symbol)) {
//			System.out.println(first / second);
//		} else {
//			System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
//		}
	
		
		//while 반복문을 사용하여 첫 번쨰 값, 사칙 연산 기호, 두 번째 값의 결과를 나타내시오. 
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("첫 번쨰 입력 값 : ");
//		int first = scanner.nextInt();
//		System.out.println(first);
//		
//		int result = first;
//		
//		while(true) {
//			System.out.println("사칙연산 기호 : ");
//			String symbol = scanner.next();
//			System.out.println(symbol);
//			
//			if (symbol.equals("quit")) {
//				System.out.println("최종 결과 값 : " + result);
//				break;
//			}
//			
//			System.out.println("두 번째 입력 값 : ");
//			int second = scanner.nextInt();
//			System.out.println(second);
//			
//			if(symbol.equals("+")) {
//				result = result + second;
//			System.out.println("덧셈 :" + result);
//			} else if("-".equals(symbol)) {
//				result = result - second;
//			System.out.println("뺄셈 : " + result);
//			} else if("*".equals(symbol)) {
//				result = result * second;
//			System.out.println("곱셈 : " + result);
//			} else if("/".equals(symbol)) {
//				result = result / second;
//			System.out.println("나눗셈 : " + result);
//			} else {
//			System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
//			}
//		}		
		
		//메서드 사용
		Scanner scanner = new Scanner(System.in);
		
		int first = getFirstValue(scanner);
		
		int result = first;
		
		while(true) {
			String symbol = getSymbol(scanner);
			
			if (symbol.equals("quit")) {
				print(result);
				break;
			}
			
		int second = getSecondValue(scanner);			
		
		result = calculate(result, symbol, second);
		}
	}
}
