package Baekjoon;

import java.util.Scanner;

public class no2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
//		방법1. if문
		if(year % 4 == 0) {
			if(year % 400 == 0) {
				System.out.println("1");
			} else if(year % 100 == 0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		}
		else {
			System.out.println("0");
		}
//		방법2. 삼항연산자
		String str = (year%4==0)?((year%400==0)?"1":(year%100==0)?"0":"1"):"0";
		System.out.println(str);
	}
}
