package Baekjoon;

import java.util.Scanner;

public class no9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		
//		버전1 if문
//		if(score >= 90  ) {
//			System.out.println("A");
//		} else if(score >= 80) {
//			System.out.println("B");
//		} else if(score >= 70) {
//			System.out.println("C");
//		} else if(score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
//		버전2 삼항연산자
		String str = ((score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F");
		System.out.println(str);
	}

}
