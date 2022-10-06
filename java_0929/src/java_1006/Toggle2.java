package java_1006;

public class Toggle2 {

	public static void main(String[] args) {
		// 짝수와 홀수를 10번 번갈아 가면서 출력
		boolean flag = false;
		for(int i=0; i<10; i=i+1) {
			flag = !flag;
			
			if(flag) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}

	}

}
