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
//		�迭�� ��ġ�� ���Ѵ�
		for(int i=0; i<arr.length; i++) { // ��[i] �� 0~3���� ���Ѵ�.
			for(int j=0; j<arr[i].length; j++) { //		��[j] �� 0~4���� ���Ѵ�.
				total += arr[i][j];
			}
		}
		
		average = total/(float)(arr.length * arr[0].length);
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	}

}
