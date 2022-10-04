package java_0930;

public class Booleantest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPan =true;
		System.out.println(isPan);
		
		System.out.println("123".isBlank());
		System.out.println("123".isEmpty());
		
		String name = "ali";
		System.out.println(name);
		
		int a =10;
		int b =10;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		//Q> 이름, 나이, 키를 저장하는 변수를 만들고 값을 저장한 후 출력
		String name2 = "Alicya는\t";
		double age = (double)39.9;
		String age2 = "세\t";
		double high = (double)163.5;
		String high2 = "cm입니다";
		System.out.println(name2 +age + age2+ high+high2);

		
		}
	}


