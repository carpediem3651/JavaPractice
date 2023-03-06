package BaekjoonAnswer;

import java.util.Scanner;

public class no10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // test케이스 갯수
		int arr[] = new int[t]; // 더하기 결과값을 담을 배열 
		
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[t] = a+b;
		}
		
		sc.close();
		
		for(int k : arr) { // 변수 k에 배열 값을 하나씩 담는다.
			System.out.println(k);
		}
	}

}
