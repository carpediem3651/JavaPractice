package Baekjoon;

import java.util.Scanner;

public class no2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		// 분이 45분 보다 작다면
		if(M<45) {
			// 시간은 -1
			H--;
			// 분은 +15
			M = M+15;
			
			// 시간이 0시라면
			// 45분 전 시간에는 23시이다.
			if(H<0) {
				H = 23;
			}
			System.out.println(H+" "+M);
		} else {
			System.out.println(H+ " " + (M - 45));
		}
	}

}
