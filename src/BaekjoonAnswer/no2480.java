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
		
		//������ ��� �ٸ����
		if (a != b && b != c && a != c) {
			int max; //�ִ밪
		// a > b�� ���
			if(a > b) {
				// c > a > b���
				if(c > a) {
					max = c;
				}
				// a > b or c
				else {
					max = a;
				}
		// b > a �� ���
			} else {
				// c > b > a���
				if(c > b) {
					max = c;
				} 
				// b > a or c���
				else {
					max = b;
				}
			}
			System.out.println(max*100);
		} 
		
		//������ �ϳ� �̻� ���� ���
		else {
			//������ ��� ���� ���
			if(a == b && a == c) {
				System.out.println(10000 + a * 1000);
			} else {
			//������ �ϳ� ���� ���
			//a�� b Ȥ�� c�� �������
			if(a == b || a == c) {
				System.out.println(1000 + a * 100);
			}
			//b�� c�� �������
			else {
				System.out.println(1000 + b * 100);
				}
			}
		}		
	}
}


