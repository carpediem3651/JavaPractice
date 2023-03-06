package Baekjoon;

import java.util.Scanner;

public class no2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		//변수가 모두 다른경우
		if (a != b && b != c && a != c) {
			int max; //최대값
		// a > b인 경우
			if(a > b) {
				// c > a > b라면
				if(c > a) {
					max = c;
				}
				// a > b or c
				else {
					max = a;
				}
		// b > a 인 경우
			} else {
				// c > b > a라면
				if(c > b) {
					max = c;
				} 
				// b > a or c라면
				else {
					max = b;
				}
			}
			System.out.println(max*100);
		} 
		
		//변수가 하나 이상 같은 경우
		else {
			//변수가 모두 같은 경우
			if(a == b && a == c) {
				System.out.println(10000 + a * 1000);
			} else {
			//변수가 하나 같은 경우
			//a가 b 혹은 c와 같은경우
			if(a == b || a == c) {
				System.out.println(1000 + a * 100);
			}
			//b가 c와 같은경우
			else {
				System.out.println(1000 + b * 100);
				}
			}
		}		
	}
}


