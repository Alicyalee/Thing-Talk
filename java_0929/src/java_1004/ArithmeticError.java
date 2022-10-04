package java_1004;

public class ArithmeticError {

	public static void main(String[] args) {
		int year =2022;
		//year가 윤년인지 판별하기
		//① 4의 배수이고 ②100의 배수가 아니면 윤년
		//③ 400의 배수는 윤년
	
		if(year /4==0 &&  year%100 !=0 || year /400==0) {
		//         ①         ②               ③
	              System.out.println("윤년");
			}else {
				System.out.println("윤년아님");
				
				int n1 =5;
				System.out.println(+n1);
				System.out.println(-n1);
				short n2 =7;
				int n3 =+n2;
				int n4 =-n2;
				System.out.println(n3);
				System.out.println(n4);
				System.out.println(7.0f/3.0f);
				System.out.println((float)7/3);
			}
              

	}

}
