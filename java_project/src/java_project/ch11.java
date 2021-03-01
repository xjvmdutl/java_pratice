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
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("영어 문장 입력 : ");
			String sentence = sc.nextLine();
			if(sentence.indexOf('A',0) != -1
					|| sentence.indexOf('E',0) != -1
					|| sentence.indexOf('I',0) != -1
					|| sentence.indexOf('O',0) != -1
					|| sentence.indexOf('U',0) != -1) {
				System.out.println("Good Sentence");
			}
		*/
		//pb10) 숫자 두개를 입력받아 두수의 차 구하기
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("정수 2개를 입력(공백기준):");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int sum;
			if(num1 > num2) {
				sum = num1 -num2; 
			}else {
				sum = num2 - num1;
			}
			System.out.println(sum);
		*/
		//pb11) if-else문 3항 연산자로 변경
		/*
			Scanner sc =new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			
	//		if(a+b >= 0.5 * a * b) {
	//			System.out.println("Nice");
	//		}else {
	//			System.out.println("Bad");
	//		}
			String s = a+b >= 0.5 * a* b? "Nice"  : "Bad"; 
			System.out.println(s);
		*/
		//pb12) 입력된 세 정수 a,b,c 중 가장 작은 값을 출력
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int min = 0;
			if(a < b && a < c) {
				min = a;
			}else if( b < c && b < a){
				min = b;
			}else{
				min = c;
			}
			System.out.println(min);
		*/
		//pb13) 4개의 3항 연산자를 포함하여 작성한다. 하나의 정수를 입력받아 양수/음수, 홀수/짝수, 3의 배수/아닌지 , 5의배수/아닌지 판별해주는 프로그램
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			boolean result1 = num > 0 ? true : false;
			boolean result2 = num % 2 != 0 ? true : false;
			boolean result3 = num % 3 == 0 ? true : false;
			boolean result4 = num % 5 == 0 ? true : false;
			System.out.println("양수?"+result1);
			System.out.println("홀수?"+result2);
			System.out.println("3의배수?"+result3);
			System.out.println("5의배수?"+result4);
		*/
		//pb14) 숫자 사칙연산 숫자 입력받아 계산하기
		/*
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter : ");
		String input = sc.nextLine();
		int num1 = Integer.parseInt(input.split(" ")[0]);
		String result = input.split(" ")[1];
		int num2 = Integer.parseInt(input.split(" ")[2]);
		if("+".equals(result)) {
			System.out.println(num1+num2);
		}else if("-".equals(result)) {
			System.out.println(num1-num2);
		}else if("*".equals(result)) {
			System.out.println(num1*num2);
		}else if("/".equals(result)) {
			System.out.println(num1/num2);
		}else {
			System.out.println("ERROR");
		}
		*/
		
	}
}
