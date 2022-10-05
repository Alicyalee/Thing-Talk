package java_1005;

public class Dowhile {

	public static void main(String[] args) {
		/*
		// 10>8>6>4>2>0
		int idx= 0;                      // Min 값(시작점)
			do {
			System.out.println(10-2*idx);   // Max 값(끝점) + 반복값
			idx=idx+1;                      // 두번째 부터 수행할 내용
		}while(idx<6);                      // 판별식
		*/
		int idx= 0; 
		for(idx=0;idx<5;idx=idx+1) {
			System.out.println("Hello World");
		}
	}

}
