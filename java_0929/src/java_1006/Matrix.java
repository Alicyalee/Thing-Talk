package java_1006;

public class Matrix {

	public static void main(String[] args) {
		//선언과 동시에 초기화
		String [][] Alpa =
			{{"A","B"},  //Alpa의 큰 집항의 [0]번행 소그룹 2개
			 {"C","D"},  //Alpa의 큰 집항의 [1]번행 소그룹 2개
			 {"E","F"},  //Alpa의 큰 집항의 [2]번행 소그룹 2개
			 {"G","H"}   //Alpa의 큰 집항의 [3]번행 소그룹 2개
			};
		
		//length, 행의 개수
		System.out.println(Alpa.length);
		
		//0번 행의 열의 개수
		System.out.println(Alpa[0].length);
		
		//전체 데이터 접근
		//2차원 배열을 일차원 배열로 접근
		for(String [] imsi : Alpa) {
			//일차원 배열의 데이터를 String으로 접근
			for(String temt : imsi) {
				System.out.println(temt + "\t");
			}
			System.out.println();
		}
		

	}

}
