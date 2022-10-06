package java_1006;

public class Star3 {

	public static void main(String[] args) {
		// *이 1개씩 늘어서 3행 만든 후, 1개씩 다시 줄어듬들		
				for(int i=0; i<5; i=i+1) {
					if(i<3) {
						for(int j=0; j<i+1 ; j=j+1)
						System.out.print("*");
					}else {
						for(int j=0; j<5-i ; j=j+1)
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
