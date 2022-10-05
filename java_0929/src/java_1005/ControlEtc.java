package java_1005;

public class ControlEtc {

	public static void main(String[] args) {
		// 제어문의 실행 내용이 한 문장일 때, { } 생략 가능
		int score =90;
		if(score>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		outer: for(int i=0; i<3 ; i++) {
			System.out.println("외부 반복문 시작");
			for(int j=0; j<3 ; j++) {
				System.out.println("내부 반복문");
				if(j > 1) {
					break outer;
				}
			}
		}
	}
}
