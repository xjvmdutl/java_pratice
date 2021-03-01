package java_project;

import java.util.Scanner;

public class ch12 {

	public static void main(String[] args) {
		//조건문 switch : switch(변수) { case 입력 값:~~ break; default : .... break;}
		//ex01)입력변수 값에 따라 코드를 실행
		/*
			int value = 2;
			switch(value) {
			case 1: 
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("그 외 숫자");
			}
		*/
		//ex02) break는 가장 가까운 하나의 조건문을 빠져 나온다. break가 없을시 break를 만날때까지 밑 코드를 계속 실행
		/*
			int value = 1;
			switch(value) {
			case 1: 
				System.out.println("1");			
			case 2:
				System.out.println("2");
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("그 외 숫자");
			}
		 */
		//pb01) if-else 를 switch문으로 변경
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = sc.nextInt();
//		
//			if(num % 3 == 0) {
//				System.out.println(num+3);
//			}else {
//				System.out.println(num%3);
//			}
//	
		switch(num%3) {
		case 0:
			System.out.println(num+3);
			break;
		default:
			System.out.println(num%3);
		}
		*/
		//pb02) 출력결과 적기
		/*
			char value = 'A';
			switch(value) {
			case 'a':System.out.println("1");
			case 'A':System.out.println("2");
			case 'B':System.out.println("3");
			default:System.out.println("4");
			}
		*/
		//234출력
	}

}
