package java_1005;

public class ForTest {

	public static void main(String[] args) {
		// 1부터 10까지 합을 while로 구하기
		int idx =1;                     // ① 시작점 정의
		int sum =0;                     // ② 합계 정의 (why 0?)
		while(idx<11) {                 // ① 판별식
			sum=sum+idx;                // ② 합계 산식
			idx=idx+1;                  // ① 반복할 식
		}
		System.out.println("합계" + sum);
		
		
		// 1부터 10까지 합을 for로 구하기
		int i =1;                        // ① 시작점 정의
		int sum2 =0;		             // ② 합계 정의 (why 0?)
		for( i =1; i<11; i=i+1) {        // ① 초기식 ; 판별식 ; 반복할 식
			sum2 =sum2+i;                // ② 합계 산식
			}
		System.out.println("합계" + sum); // 도출 문장
	}

}
