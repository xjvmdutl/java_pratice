package java_project;

import java.util.Scanner;

public class ch11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc =new Scanner(System.in); System.out.print("정수 입력: "); int number =
		 * sc.nextInt(); for(int i=number;i>0;--i) { for(int j=1;j<i;++j) {
		 * System.out.print(" "); } for(int k=0;k<((number-i)*2)+1;++k) {
		 * System.out.print("*"); } System.out.println();
		 }*/
		
		// 조건문 : if(){}else if(){..}else{...}
		// 삼항 연산자 : (조건) ? 참경우 : 거짓경우 ;
		//pb01) : 숫자 하나를 입력 받아 홀수이면 oddNumber,짝수이면 evennumber를 출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int number = sc.nextInt();
			if(number %2 != 0) {
				System.out.println("odd number");
			}else {
				System.out.println("even number");
			}
		*/
		//pb02) : 주민번호 앞자리를 입력받아 65 이상이면 old를 출력하는 프로그램 작성
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			String number = sc.nextLine();
			int age = Integer.parseInt(number.substring(0,2));
			//2018년 기준
			if(2018-(age-1+1900) > 65) {
				System.out.println("old");
			}else {
				System.out.println("age");
			}
		*/
		//pb03) : if문 프로그램으로 변경
		/*
			int num =13;
			//num저장된 값이 2,3의 배수인가?
			//boolean ans = (num%2 == 0)|(num%3 == 0);
			if(num%2==0 | num%3==0) {
				System.out.println("2또는 3의 배수인가? "+ true);
			}
		*/
		//pb04) : 출력결과 적기
		/*
			int num = 73;
			if(num<=30) {
				num += ++num;
			}
			if(num<=100) {
				num -= num/2;//37
			}
			System.out.println(num);
		*/
		//pb05) : 출력결과 적기
		/*
			int num = 53;
			if(num <= 60) {
				if(num<=30) {
					num+= --num/2 -30;
				}else {
					num -= --num/2 + 30;//-3
				}
				num+= ++num;//-5
			}
			System.out.println(num);
		*/
		//pb06) 학생의 학점을 입력받아 학점이 A,b = 참 잘했습니다, C,D = 좀 더 노력하세요. , F = 다음학기에 다시 수강하세요를 출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("학점 입력 : ");
			String num = sc.next();
			if("A".equals(num) || "B".equals(num)) {
				System.out.println("참 잘했습니다");
			}else if("C".equals(num) || "D".equals(num)) {
				System.out.println("좀 더 노력하세요");
			}else {
				System.out.println("다음학기에 다시 수강하세요");
			}
		*/
		//pb07) 년도를 입력받아 운년인지 판정//년수가 4로 나눠 떨어지는 해
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("년도 입력 : ");
			int year = sc.nextInt();
			if(year%4 ==0) {
				if(year %100 == 0) {
					if(year % 400 == 0) {
						System.out.println("윤년");
					}else {
						System.out.println("평년");	
					}
				}else {
					System.out.println("윤년");
				}
			}
		*/
		//pb08) 숫자들 암호화 1000이하의 수들은 2진법으로 변환후 다시 8진법으로 해석한 수
		//		1000넘는 수들은 8진법 변환후 다시 16진법으로 해석
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("비밀번호 입력 : ");
			int password = sc.nextInt();
			if(password > 0) {
				if(password <= 1000) {
					String newPassword = Integer.toBinaryString(password);
					password= Integer.parseInt(newPassword,8);
					
				}else{
					String newPassword = Integer.toOctalString(password);
					password = Integer.parseInt(newPassword,16);
				}
			}
			System.out.println(password);
		*/
		//pb09) 영어 문장 하나입력받아 처음 시작하는 알파벳이 모음이면 goog sentence 를 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 문장 입력 : ");
		String sentence = sc.nextLine();
		if(sentence.indexOf(sentence) != -1) {
			
		}
	}
}
