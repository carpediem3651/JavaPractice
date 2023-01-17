package Chapter4;

public class exam4_14 {

	public static void main(String[] args) {
//		1~100 사이 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100)+1;
		int input = 0; // 사용자 입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		
//		화면으로부터 사용자입력을 받기 위해 Scaaner클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt(); //입력받은 값을 변수 input에 저장한다.
			/*
			 * 
			 */
		} while(true);
	}

}
