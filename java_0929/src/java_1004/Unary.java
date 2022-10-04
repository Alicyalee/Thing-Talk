package java_1004;

public class Unary {

	public static void main(String[] args) {
		// 정수를 저장하는 변수를 생성
		int age =53;
		System.out.println(age);
		
		//age가 가리키고 있는 데이터 1증가
		age++;
		System.out.println(age);
				
		//명령에 사용하고 1증가 : 54 출력 후 55
		System.out.println(age++);

		//1증가하고 명령에서 사용 - 56되고 56출력
		System.out.println(++age);		
	}

}
