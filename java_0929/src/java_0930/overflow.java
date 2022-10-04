package java_0930;

public class overflow {

	public static void main(String[] args) {
		// 나이 저장
		int age = 53;
		
		//int는 약 21억 까지만 저장
		//age = 2200000000;
		
		//22억은 long
		
		//char는 문자에 해당하는 코드를 저장
		//출력할 때 코드에 해당하는 문자를 출력

		char ch ='A';              //---------> 'A'라는 문자는 'ch'라는 네임텍붙임
		System.out.println(ch);    //---------> 'ch'네임텍에 해당하는 문자 출력 :A
		
		
		
		ch=97;                     //----------> char는 문자예약어 이므로 'ch'라는 네임텍을 문자'A'에서
		                           //            97코드번호에 해당하는 문자로 정의 (97=a)
		System.out.println(ch);    //----------> 'ch'네임텍에 변경된 문자 a출력
		
		System.out.println(ch+1);  //----------> 산식"+"가 들어갔기 때문에 앞에서 ch=a 문자를 무시, 숫자로해석
		System.out.println((char)(ch+1));  //----------> "char"를 붙이면 문자ch=a로 인지하기에 
		                                   //             +1인 다음순번 알파벳 b가 나옴
		                                 
		System.out.println('A'+1); //----------> 산식"+"가 들어갔기 때문에 앞에서 'A'는 숫자 65로 인식,
		                           //            +1이 적용되어 다음 숫자 66이 출력됨
		
		
		float f =10.7f;
		System.out.println(f);
		
	}
}
