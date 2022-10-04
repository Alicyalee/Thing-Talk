package java_0930;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문자 사용 : \n
				System.out.println("안녕하세요\n반갑습니다."); //----> 모든 프로그램 언어 통일
				
				
				double d =10.7;
				System.out.println(d);
				
				//float f =10.7;  ----------------> float은 숫자 뒤에 f를 붙여야하기에 에러뜸
				//System.out.println(f);
				
				
				//실수를 정수로 강제 형 변환 대입 (실수 --> 정수 변환 시, 소수 없어짐)
				int k =(int)10.456;
				System.out.println(k);              //-----------> 10이 출력됨

				//실수 예약어 (double)로 정수(10, 4)를 나누기 할 때, 소수가 없어짐
				double result2 = 10/4;   
				System.out.println(result2);        //-----------> 2가 출력됨
				
				//실수 예약어 (double)로 정수(10, 4)를 나누기 할 때, 소수점 부분까지 노출 시키려면 
				//정수 숫자 앞에 실수예약어로 형 변환하는 (double)을 넣어줘야함
				double result = (double)10/4;
				System.out.println(result);        //-----------> 2.5가 출력됨
				
				byte b = 127;
				b=(byte)(127+1);
				System.out.println(b);


				

	}

}
