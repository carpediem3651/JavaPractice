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
				System.out.println("2��и�");
			} else if(y < 0) {
				System.out.println("4��и�");
			}
		} else if(y > 0) {
			if(x > 0) {
				System.out.println("1��и�");
			} else if(x < 0) {
				System.out.println("3��и�");
			}
		} else {
			System.out.println("��� �������� �ش���� �ʽ��ϴ�.");
		}
	}
}
