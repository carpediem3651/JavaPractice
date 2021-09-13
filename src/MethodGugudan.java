
public class MethodGugudan {
	public static int[] caculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] result = caculate(2);
		
		print(result);
		
		int[] times3 = caculate(3);
		
		print(times3);
		
		int[] times4 = caculate(4);
		
		print(times4);
	}
}
