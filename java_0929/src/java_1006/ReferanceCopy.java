package java_1006;

public class ReferanceCopy {

	public static void main(String[] args) {
		// 베열생성 : subject라는 이름의 문자 배열생성
		String [] subjects = {"A", "B", "C", "D", "E", "F","G","H","I","J","K","L","M","N"};
		
		//베열이 참조하는 곳을 copy도 참조하도록 한 것 = 참조 복사(데이터 복사X)
		String [] copy = subjects;
		System.out.println(subjects[0]);

	//copy를 이용해 0번째 데이터를 수정하면 subjects에도 동일 데이터가 적용됨
	//되도록 참조 복사는 하지 않는 것을 권장
	copy[0] = "자바";
	System.out.println(subjects[0]);
	}

}
