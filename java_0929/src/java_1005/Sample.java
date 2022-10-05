package java_1005;

public class Sample {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) { //---------------------> 반복문을 수행하는 산식 (요소들의 설명)
			System.out.println("jjj");
			if(i % 3 == 1) {  //------------------------> 반복문을 break 하는 "조건 (true/false)
				break;        //------------------------> 반복문인데 중도 break를 시킨 거니까 if조건이 필요
			}
		}

	}

}
