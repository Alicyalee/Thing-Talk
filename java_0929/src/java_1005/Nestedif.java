package java_1005;

public class Nestedif {

	public static void main(String[] args) {
		// ID : itstudy, PW :1234 로그인 확인하기
		
		String id ="itstudy";
		String pw ="1234";
		
		if(id == "itstudy") {
			if(pw=="1234") {
				System.out.println("로그인 성공");
			}else
				System.out.println("로그인 실패");
		}
	}

}
