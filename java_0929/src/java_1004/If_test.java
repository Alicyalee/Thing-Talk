package java_1004;

public class If_test {

	public static void main(String[] args) {
		// 60이상이면 합격, 아니면 불합격
		int score =103;
		
		//if (score>=60) {
		//	System.out.println("합격");
		//}else {
	    //	System.out.println("불합격");
		//}
	
	
		//80 ~ 100 : 우수, 60~79 보통, 0~59 노력
      
		if (score>=80 && score <=100) {
			System.out.println("우수");
		}else if(score>=60 && score <80){
	    	System.out.println("보통");
		}else if(score>=0 && score <60){
			System.out.println("노력");
	    }else
			System.out.println("잘못된 점수");
	    }
	}

