package Chapter4;

public class exam4_14 {

	public static void main(String[] args) {
//		1~100 ���� ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random()*100)+1;
		int input = 0; // ����� �Է��� ������ ����
		int count = 0; // �õ�Ƚ���� �������� ����
		
//		ȭ�����κ��� ������Է��� �ޱ� ���� ScaanerŬ���� ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ��� :");
			input = s.nextInt(); //�Է¹��� ���� ���� input�� �����Ѵ�.
			/*
			 * 
			 */
		} while(true);
	}

}
