package Chapter4;

public class exam4_13 {

	public static void main(String[] args) {
		
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0; i<value.length(); i++) {
			// value에 있는 값을 하나씩 가져와서 ch에 넣는다.
			
			//ch에 넣은 값이 숫자(0보다 크거나 같고 9보다 작거나 같다)인지 판단한다. 숫자가 아니면
			//isNumber 같에 false를 넣는다.
			//반복문에서 빠져나간다.
			}
		}
		
		if (isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
	}

}
