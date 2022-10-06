package java_1006;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//입려받은 항 까지의 피보나치 수열의 합
		//피보나치 수열 : 첫번째, 두번째 항은 1이고 세번째 항 부터는 이전 2개의 항의 합
		//1,1,2,3,5,8,13,21.....
		
		//하나의 정수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int fib = sc.nextInt();
		
		//합을 저장할 변수
		//규칙이 3번째부터 성립하므로 2번째까지의 합을 가지고 출발
		int fiboSum = 2;
		
		//현재의 피보나치 수와 이전 2개 항의 수를 저장하기 위한 변수를 생성
		int f1 =1;  //현재 이전
		int f2 =2;  //현재 이전의 이전
		
		//3번째 부터 fib까지 반복
		int n =3;
		while(n<=fib) {
			//현재 항을 구하기
			int f = f1+f2;
			//현재 항을 합에 추가
			fiboSum = fiboSum +f;
			
			f2 = f1;
			f1 =f;
			
			n=n+1;
			System.out.println(f);
		}
		System.out.println(fib + "번째 입력한 수의 합 :" + fiboSum);
				sc.close();

	}

}
