package BaekjoonAnswer;

import java.util.Scanner;

public class no10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // test���̽� ����
		int arr[] = new int[t]; // ���ϱ� ������� ���� �迭 
		
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[t] = a+b;
		}
		
		sc.close();
		
		for(int k : arr) { // ���� k�� �迭 ���� �ϳ��� ��´�.
			System.out.println(k);
		}
	}

}
