package Baekjoon;

import java.util.Scanner;

public class no1330 {

	public static void main(String[] args) {
//		첫 번째 버전 if문
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
//		조건문
		
//		if(a>b) {
//			System.out.println(">");
//		} else if (a<b) {
//			System.out.println("<");
//		} else {
//			System.out.println("==");
//		}
		
//		두 번째 버전 삼항연산자
		String str = (a>b) ? ">" : (a<b) ? "<":"==";
		System.out.println(str);
	}

}
