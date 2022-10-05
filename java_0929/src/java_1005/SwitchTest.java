package java_1005;

public class SwitchTest {

	public static void main(String[] args) {
		// 메뉴1 한식, 2번 중식, 3번 기타
		/*
		int menu =1 ;
						if(menu==1) {
			System.out.println("한식");
		}else if(menu==2) {
			System.out.println("중식");
		}else if(menu==3) {
			System.out.println("기타");	
		}else {
			System.out.println("잘못된 메뉴");
		}
		*/
		
		//위의 내용을 Switch로 처리
		int menu =1 ;
		final int KOREA =1 ;  //---------> final을 붙이면 변경할 수 없음
		final int CHINA =2 ;  //---------> final을 붙이면 변경할 수 없음
		final int ETC =3 ;  //---------> final을 붙이면 변경할 수 없음
		
		switch(menu) {
		case KOREA:
			System.out.println("한식");
		break;
		case CHINA:
			System.out.println("중식");
		break;
		case ETC:
			System.out.println("기타");
		break;
		default:
		 System.out.println("잘못된 메뉴");
		break;
	
	}
	}
}

