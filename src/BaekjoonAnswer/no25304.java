package BaekjoonAnswer;

import java.util.Scanner;

public class no25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 영수증에 적힌 총 금액
		int Y = sc.nextInt(); // 영수증에 적힌 물건 종류 갯수
		int total = 0; // 구매한 물건 총 금액
		
		for(int i = 0; i < Y; i++) {
			int a = sc.nextInt(); // 각 물건의 가격
			int b = sc.nextInt(); // 각 물건의 갯수
			total += a * b; // 구매한 물건 총 금액
		}
		
		if(total == X) { // 구매한 물건 총 금액과 영수증에 적힌 금액의 합이 같다면
			System.out.println("Yes");
		} else {  // 구매한 물건 총 금액과 영수증에 적힌 금액의 합이 다르다면
			System.out.println("No");
		}
	}

}
