package java_1004;

public class logintest {

	public static void main(String[] args) {
		
		String id ="itstudy";
		String pw ="1234";
		
		
		if(id=="itstudy" && pw == "12345") {
			System.out.println("로그인 성공");
		}else if(id=="itstudy" && pw!="1234") {
			System.out.println("비밀번호가 틀림");
		}else if(id!="itstudy"){
			System.out.println("없는 ID");
		}
	}

}
