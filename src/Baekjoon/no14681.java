package Baekjoon;

import java.util.Scanner;

public class no14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println("2사분면");
			} else if(y < 0) {
				System.out.println("4사분면");
			}
		} else if(y > 0) {
			if(x > 0) {
				System.out.println("1사분면");
			} else if(x < 0) {
				System.out.println("3사분면");
			}
		} else {
			System.out.println("어느 구역에도 해당되지 않습니다.");
		}
	}
}
