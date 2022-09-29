
public class new_class {

	public static void main(String[] args) {
		System.out.print("hello"); 
		System.out.print("World");
		System.out.println("hello");
		System.out.println("world");
		System.out.println("hi".toUpperCase());
		//문자열과 +를 하면 문자열 결합을 해서 출력
		System.out.println("2"+3);
		//3+5=8 출력하기
		System.out.println("3+5=8");
		System.out.println("3+5="+3+5);
		System.out.println("3+5="+(3+5));
		
		//출력서식 - 최대 5자리 숫자 포맷으로 수 나열하기
		System.out.printf("%5d\n",20);
		System.out.printf("%5d\n",127);
		
		//출력서식 - 최대 5자리 숫자 포맷으로 수 나열하되 공란에 "0" 표기하기
		System.out.printf("%05d\n",20);
		System.out.printf("%05d\n",127);
		
		//출력서식 - 소수점 표기하기
		System.out.printf("%f\n",14.9876);
		
		//출력서식 - 소수점 2자리까지 반올림 후 출력하기
		System.out.printf("%.2f\n",14.9876);
		
		System.out.println(3+5);
		System.out.println(+3+5);
		System.out.println("3"+3+5);
		System.out.println("3"+"숫자");
		
		
		
		

	}

}
