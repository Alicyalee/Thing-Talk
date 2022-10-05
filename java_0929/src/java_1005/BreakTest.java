package java_1005;

public class BreakTest {

	public static void main(String[] args) {
		// irk 3의 배수라면 반복문 중단
		for (int i=1; i<10 ; i=i+1) {
			System.out.println(i);
			if(i%3==0) {
				break;
			}
		}

	}

}
