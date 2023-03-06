package BaekjoonAnswer;

import java.util.Scanner;

public class no2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a= sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}
