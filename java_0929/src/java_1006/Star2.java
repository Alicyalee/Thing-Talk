package java_1006;

public class Star2 {

	public static void main(String[] args) {
		// *이 1개씩 늘어서 5행 만들기
		for(int i=0; i<5; i=i+1) {
				for(int j=0; j<i+1 ; j=j+1)
				System.out.print("*");
		}
		System.out.println();
	}
}
