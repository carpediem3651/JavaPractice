package Baekjoon;

import java.util.Scanner;

public class no1330 {

	public static void main(String[] args) {
//		ù ��° ���� if��
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
//		���ǹ�
		
//		if(a>b) {
//			System.out.println(">");
//		} else if (a<b) {
//			System.out.println("<");
//		} else {
//			System.out.println("==");
//		}
		
//		�� ��° ���� ���׿�����
		String str = (a>b) ? ">" : (a<b) ? "<":"==";
		System.out.println(str);
	}

}
