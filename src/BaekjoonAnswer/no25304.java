package BaekjoonAnswer;

import java.util.Scanner;

public class no25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // �������� ���� �� �ݾ�
		int Y = sc.nextInt(); // �������� ���� ���� ���� ����
		int total = 0; // ������ ���� �� �ݾ�
		
		for(int i = 0; i < Y; i++) {
			int a = sc.nextInt(); // �� ������ ����
			int b = sc.nextInt(); // �� ������ ����
			total += a * b; // ������ ���� �� �ݾ�
		}
		
		if(total == X) { // ������ ���� �� �ݾװ� �������� ���� �ݾ��� ���� ���ٸ�
			System.out.println("Yes");
		} else {  // ������ ���� �� �ݾװ� �������� ���� �ݾ��� ���� �ٸ��ٸ�
			System.out.println("No");
		}
	}

}
