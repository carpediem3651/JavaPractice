package Gugudan;

public class GugudanMainPractice {
	public static void main(String[] args) {
		for(int i =2; i < 10; i++) {
			int[] result = MethodGugudan.calculate(i);
			MethodGugudan.print(result);
		}
	}
}
