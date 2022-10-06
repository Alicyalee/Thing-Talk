package java_1006;

public class StarTest {

	public static void main(String[] args) {
		// *이 1개씩 늘어서 5행 만들기
		for(int i=0; i<5; i=i+1) {         //(1) 외부 반복문 조건 : 행이 +1개씩 늘어나기
			for(int j=0; j<i+1 ; j=j+1) {  //(2) 내부 반복문 조건 : 행내 *이 +1개씩 늘어나기
			System.out.print("*");         //                   행내 +1되는 *은 줄바꿈 없이 출력하기
			}System.out.println();         //(1) 외부 반복문 조건 : (2)수행하면 줄바꿈해서 출력하기 (줄바꿈 +1행)
		}
	}
}
