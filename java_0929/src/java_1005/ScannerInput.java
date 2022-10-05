package java_1005;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// 키보드로 부터 입력받는 스캐너 생성하기
		Scanner sc =
				new Scanner(System.in);
		//이름 입력-문자열
		System.out.println("이름:");
		String name = sc.nextLine();
		System.out.println(name);

		//나이 입력-정수
		System.out.println("나이:");
		int age = sc.nextInt();
		System.out.println(age);	
		sc.close();

	}

}
