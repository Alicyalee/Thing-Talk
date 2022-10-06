package java_1006;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		// 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디:");
		String id = sc.nextLine();
		//
		boolean result =
				id =="아담";
		System.out.println(result);
		
		//난 프리미티브 타입은 이퀄스 메서드로 내용비교
		result =id.equals("아담");
		System.out.println(result);
		
		sc.close();
	}

}
