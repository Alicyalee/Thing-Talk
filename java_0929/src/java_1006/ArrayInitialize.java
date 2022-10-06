package java_1006;

public class ArrayInitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar;

		//배열에 3개의 공간을 할당
		ar=new int [3];                // ar이란 별칭으로 3개의 공간(= 공간의 갯수, 공간의 길이)을 만들어라 : 0, 1, 2
		System.out.println(ar[0]);     // 3개의 공간 중 0번째의 공간을 출력 : 매 공간마다 들어있는 초기 데이터 0이나옴
		System.out.println(ar[1]);     // 3개의 공간 중 1번째의 공간을 출력 : 매 공간마다 들어있는 초기 데이터 0이나옴
		System.out.println(ar.length); // ar로 만들어진 공간의 갯수(길이)를 출력하라 : 3개의 공간이 만들어졌으므로 3출력

		ar[1]=100;                    // ar의 1번째 공간에 데이터 100으로 교체해라 (초기값 0 --> 변경값 100)
		System.out.println(ar[1]);    // ar의 1번째 공간에 데이터를 출력해라 (변경값이 적용된 100으로 출력)
		System.out.println(ar.length);// ar로 만들어진 공간의 갯수(길이)를 출력하라 : 공간 갯수(길이)는 여전희 3  


		//배열의 크기가 3이므로 0-2까지만 가능
		//System.out.println(ar[3]);   // 4번째의 공간을 출력하라는 의미이므로 에러

		//배열의 선언과 메모리 하당을 동시에
		//실수 3개를 저장할 수 있는 배열을 생성
		double [] br = new double[3];  // br이란 별칭으로 3개의 공간(= 공간의 갯수, 공간의 길이)을 만들어라 : 0, 1, 2

		//배열 선언과 동시에 초기화 (데이터 설정)
		String [] aspa = {"카리나", "지젤", "윈터", "닝닝"}; //aspa란 그룹의 문자 4개 데이터를 배열해라

		//배열의 데이터 개수 확인
		System.out.println(aspa.length);// br로 만들어진 공간의 갯수(길이)를 출력하라 : 공간 갯수(길이)는 4 	

		//aspa 배열이 가진 모든 데이터를 출력
		//데이터 갯수의 리터럴 사용
		for(int i=0; i<4; i=i+1) {
			System.out.println(aspa[i]);
		}
		
		//리터럴 대신, aspa.length 속성을 이용한 모든 데이터 출력
	    //배열의 데이터 개수가 변경 되어도 코드 수정이 필요 없음
		for(int i=0; i<aspa.length; i=i+1) {
			System.out.println(aspa[i]);
			}
		
		// 데이터의 개수를 LEN에 넣고 순회
		// . 이나 [ ] 인덱스를 이용해 데이터에 접근하면 메모리 접근 횟수가 늘어나므로 횟수를 줄이는 별칭 선언이 필요
		final int LEN = aspa.length;
		for(int i=0; i<LEN; i=i+1) {
			System.out.println(aspa[i]);
			}
		
		//자바에서는 배열이나 List의 경우 빠른 열거라는 분법을 허용
		//빠른열거 문법 : for (임시변수 : 컬렉션)
		//빠른열거를 이용하면 컬렉션의 모든 데이터를 순차적으로 임시 변수에 대입함
		for (String singer : aspa) {
			System.out.println(singer);
		}
		}

	}
