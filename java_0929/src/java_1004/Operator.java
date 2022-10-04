package java_1004;

public class Operator {

	public static void main(String[] args) {
	
		 int a = 10;
         a++; //----------------------------------->11 (a값에 1증가)
         System.out.println(++a); //--------------->12 (prefix : 먼저 +1증가)앞의 값에 +1 
         System.out.println(a++); //--------------->12 (postfix : 명령에 사용 후 +1증가)앞의 값 출력
         System.out.println(a);   //--------------->13  "a--> 앞의 값에 +1된 값 출력
	}
}
