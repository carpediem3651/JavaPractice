package Baekjoon;

import java.util.Scanner;

public class no2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		// ���� 45�� ���� �۴ٸ�
		if(M<45) {
			// �ð��� -1
			H--;
			// ���� +15
			M = M+15;
			
			// �ð��� 0�ö��
			// 45�� �� �ð����� 23���̴�.
			if(H<0) {
				H = 23;
			}
			System.out.println(H+" "+M);
		} else {
			System.out.println(H+ " " + (M - 45));
		}
	}

}
