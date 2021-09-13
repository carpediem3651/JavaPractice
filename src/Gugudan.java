import java.util.Scanner;


public class Gugudan {
	public static void main(String[] args) {
		//2단(기초)
//		System.out.println("2단");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
		
		//3단(기초)
//		System.out.println("3단");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
		
		//변수와 값 활용.
//		System.out.println("4단");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
		//Scanner를 이용해서 5단을 구해봐라.
//		System.out.println("구구단 중 출력할 단은?: ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
		//반복문 활용
		//while 문을 활용하여 6단을 구하여라.
//		int i = 1;
//		while ( i < 10) {
//		  System.out.println(6*i);
//		  i++;
//		}
		
		//for문을 활용하여 7단을 구하여라.
//		for(int i = 1; i < 10; i++) {
//			System.out.println(7*i);
//		}
		
		//사용자가 입력한 숫자의 값에 해당하는 구구단(9단)을 출력하라 단, 사용자가 2이상, 9이하가 아닌 값을 입력하는 경우 
		//"2이상, 9이하의 값만 입력할 수 있습니다"라는 메세지를 출력하라.
//		System.out.println("구구단 중 출력할 단은?:");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//
//		if (number < 2) {
//			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//		} else if (number > 9) {
//			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//		} else {
//		  for(int i = 1; i < 10; i++ ) {
//		  System.out.println(number * i);
//		}
//	  }
		
		//구구단 결과를 배열에 저장한 후 배열의 결과를 출력하라.
		int[] result = new int[9];
		for(int i = 0; i <= result.length; i++) {
			result[i] = 2 * (i + 1);                  //1~9를 어떻게 표현할꺼야?? 
		}
		
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
    }
  }



