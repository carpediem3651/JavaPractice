package BaekjoonAnswer;

import java.util.Scanner;

public class no11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 테스트 케이스 개수
		
		for(int i = 1; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #"+i+":"+(a+b));
		}
		
		sc.close();
	}

}
