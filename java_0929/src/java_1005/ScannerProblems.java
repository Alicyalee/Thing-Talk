package java_1005;

import java.util.Scanner;

public class ScannerProblems {

	public static void main(String[] args) {
		Scanner sc =
				new Scanner(System.in);
		
		//나이 입력-정수
		System.out.println("나이:");
		int age = sc.nextInt();

		//기존 버퍼 내용지우기
		sc.nextLine();
		
		//이름 입력-문자열
		System.out.println("이름:");
		String name = sc.nextLine();
		
		System.out.println("이름:" + name + "\n나이:" +age);

		sc.close();
	}

}
