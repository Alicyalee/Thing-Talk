package java_1004;

public class Bit {

	public static void main(String[] args) {
		int a= 11;
		//이진수로 변환한 결과 확인
		System.out.println(
				Integer.toBinaryString(a));
		
		int b= 14;
		//이진수로 변환한 결과 확인
		System.out.println(a&b);  //-------------->10진수 : 10
		System.out.println(
				Integer.toBinaryString(a&b));//--->2진수로 변환 : 1010
	
		System.out.println(a|b);  //-------------->10진수 : 15
		System.out.println(
				Integer.toBinaryString(a|b));//--->2진수로 변환 : 1111
		
		System.out.println(a^b);  //-------------->10진수 : 5
		System.out.println(
				Integer.toBinaryString(a^b));//--->2진수로 변환 :101
		
		int max = a > b?a:b;
		System.out.println(max);
		
		int x =20;
		int y =30;
		
		//x와 y의 내용물 교체
		x = x!=y ? 30 :20;
		y = y!=x ? 20 :30;
		
		System.out.println(x);
		
		// System.out.println("x:"+y);
		
		
		//99980초가 몇 시간 몇 분 몇 초인지 계산
		//1day = 86400초, 1시간 3600초,
		//1분은 60초
		
		int time = 99980 ;
		int hour = time/3600;
		int min = (time-(hour*3600))/60;
		int sec = time%60;
		System.out.println(hour+"시간"+ min+"분"+sec+"초");
		
		//double hour = 99980 / 3600;
		//double min = hour%60;
		//System.out.println(hour);
	}
	}
