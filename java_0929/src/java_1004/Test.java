package java_1004;

public class Test {

	public static void main(String[] args) {
		//99980초가 몇 시간 몇 분 몇 초인지 계산
		//1day = 86400초, 1시간 3600초,
		//1분은 60초
		//A :27시간46분20초
		
				
		int hour = 99980 / 3600;
		int min = (99980 % 3600)/60;
		int sec = 99980 % 60;
		System.out.println(hour+"시간"+ min+"분"+sec+"초");

	}

}
