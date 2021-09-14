package Gugudan;

public class MethodGugudan {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}
	
	//배열에 담은 결과값 출력하는 메서드를 만든다.
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			int[] result = calculate(i);
			print(result);
		}
	}
}
