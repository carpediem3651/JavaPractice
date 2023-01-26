package Chapter5;

public class exam5_4 {

	public static void main(String[] args) {
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{39, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
//		배열의 위치를 구한다
		for(int i=0; i<arr.length; i++) { // 행[i] 를 0~3까지 구한다.
			for(int j=0; j<arr[i].length; j++) { //		열[j] 를 0~4까지 구한다.
				total += arr[i][j];
			}
		}
		
		average = total/(float)(arr.length * arr[0].length);
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	}

}
