package java_1004;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// 정수 데이터를 저장하는 변수
		int x= 10;
		int y =4;
		System.out.println(x+y);
		
		System.out.println(x/y);    //소수점 실수로 출력X, 몫 부분인 정수만 출력하여 2.5가 아닌 2출력
	
	byte b1 =10;
	byte b2 =4;
	//byte를 가지고 연산을 수행하면 int로 변경해서 수행하므로 그냥은 에러
	int result = (b1 / b2);
	System.out.println(result);
	
	//X나누기 y 시, 소수까지 출력
	double d =x/y;
	System.out.println(d);

	 // 위의 결과를 소수 첫째 자리에서 반올림
	 int t = (int)((double)x/y+0.5);
	  System.out.println(t);
	  int g = (int)(2.1+0.5);
	  System.out.println(g);
	  
	  //정수 32760을 두번째(십의)자리 반올림 -32800 만들기
	  int money =32760;
	  System.out.println(
			  (int)(money / 100.0  +  0.5)*100);
	 //             정수   / 실수 = 실수 ====> (int)(327.6 +0.5)*100 = 32800 출력
	  System.out.println(
			  (int)(money / 100  +  0.5)*100);
     //              정수  / 정수 = 정수 ====> (int)(327 +0.5)*100 = 32700 출력
}
}