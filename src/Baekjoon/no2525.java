package Baekjoon;

import java.util.Scanner;

public class no2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int min = 60 * A + B;
		min += C;
		
		int hour = (min/60) % 24; // 시 (24시 이상이 될 경우 0시부터 시작하도록 한다)
		int minute = min % 60; // 분
		
		System.out.println(hour + " " + minute);
	}

}
