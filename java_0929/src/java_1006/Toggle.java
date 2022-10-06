package java_1006;

public class Toggle {

	public static void main(String[] args) {
		// 짝수와 홀수를 10번 번갈아 가면서 출력
		for(int i =0; i<10 ; i=i+1) {
			int mod = i%2;
			if(mod<1) {
				System.out.println("짝수");
			}else
				System.out.println("홀수");
		}
	}

}

