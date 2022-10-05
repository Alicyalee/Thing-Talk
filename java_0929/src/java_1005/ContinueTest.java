package java_1005;

public class ContinueTest {

	public static void main(String[] args) {
		//1~10 숫자를 나열하되 3의 배수는 제외하기
		for (int i=1; i<10 ; i=i+1) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
