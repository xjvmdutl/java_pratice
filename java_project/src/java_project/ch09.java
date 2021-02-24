package java_project;

import java.util.Scanner;
import java.io.IOException;

public class ch09 {

	public static void main(String[] args) throws IOException{
		// 입력문 : Scanner 클래스 사용(import)
		//		  nextLine(),nextDouble(),nextInt()함수사용해서 입력받는다
		//		  System.in.read()함수를 통해서도 입력받은수 있지만 하나의 변수만 입력받을수 있어 주로 문자열 입력받을떄 사용
		//ex01) import java.util.Scanner 임포트후 Scanner 객체를 생성한뒤 입력받는다.
		/*
			Scanner sc = new Scanner(System.in);//Scanner 객체 생성
			System.out.print("이름은?");
			String name = sc.next();
			System.out.println(name);
		*/
		//ex02) new Scanner의 파라미터는 프로그램 시스템에 입력을 받겠다고 선언 한것
		//		next() : 공백 단위로 문자열을 읽기
		//		nextLine() : 엔터 단위 , nextDouble,nextInt :실수, 정수 입력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("이름은? ");
			String name = sc.next();
			System.out.print("나이는? ");
			int age = sc.nextInt();
			System.out.print("학점은? ");
			float score = sc.nextFloat();
			System.out.println(name + " " + age + "살, 학점은 "+score);
		*/
		//ex03) scanner 클래스를 이용하지 않고 System.in.read() 메소드를 이용
		/*
			int a = System.in.read();
			System.out.print(a);
		*/
		//pb01) 입력문을 활용하여 사용자의 기본자 기본정보 입력받기
		/*
			System.out.println("<사용자 기본정보>");
			Scanner sc =new Scanner(System.in);
			System.out.print("이름을 입력하세요 ");
			String name = sc.next();
			System.out.print("나이를 입력하세요 ");
			int age = sc.nextInt();
			System.out.println("당신의 이름은 "+name + ", 나이는 "+age);
		*/
		//pb02) 이름과 키 몸무게를 입력받는다, print문은 하나만 사용
		
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("이름을 입력하세요. ");
			String name = sc.next();
			System.out.print("키를 입력하세요. ");
			double key = sc.nextDouble();
			System.out.print("몸무게를 입력하세요. ");
			int height = sc.nextInt();
			System.out.println(name+"의 키는 "+key+"cm, 몸무게는 "+height + "kg");
		*/
		//pb03) 두수를 입력받아 두수의 합을 출력
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("두수를 입력하세요 : ");
			String num1Plusnum2 = sc.nextLine();
			int num1 = Integer.parseInt(num1Plusnum2.substring(0,num1Plusnum2.indexOf(' ')));
			int num2 = Integer.parseInt(num1Plusnum2.substring(num1Plusnum2.indexOf(' ')+1));
			System.out.println("입력한 두 수의 합은 : "+(num1+num2));
		*/
		//pb04) 이름을 입력받아 이름의 글자수를 출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("이름은 ? ");
			String name = sc.next();
			System.out.println(name.length());
		*/
		//ex04) 두개의 수를 하나의 줄에서 입력 받고싶은경우 => 공백으로 두수를 구분
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("두 수를 입력: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("%d %d ",a,b);
		*/
		//pb05) 두 수를 입력 받아 처음 일력 받은 수가 두번쨰 입력받은 수보다 클때  true, 아니면 false
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("first Number : ");
			int num1 = sc.nextInt();
			System.out.print("second Number : ");
			int num2 = sc.nextInt();
			boolean isBig = num1 < num2;
			System.out.println(isBig);
		*/
		//pb06) 수를 세개 입ㄹ력받아 처음 두수의 합이 마지막 수와 같은경우 true 아니면 false
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("first Number : ");
			int num1 = sc.nextInt();
			System.out.print("second Number : ");
			int num2 = sc.nextInt();
			System.out.print("third Number : ");
			int num3 = sc.nextInt();
			boolean isEquals = (num1 + num2) == num3;
			System.out.println(isEquals);
		*/
		//pb07) 2017년 나이가 20일떄 년도를 입력하면 해당 년도의 나이를 출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("년도를 입력하세요 : ");
			int year = sc.nextInt();
			int age = 20;
			System.out.println(year +"년 지수의 나이는 "+(age+year-2017) +"세 입니다." );
		*/
		//pb08) 수를 4개 입력받아 평균과 분산을 계산해주는 프로그램(split()함수를 사용하여 공백을 기준으로 문자를 잘라 리스트로 저장)
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("네 수를 입력하세요 : ");
			String numbers = sc.nextLine();
			int num1 = Integer.parseInt(numbers.split(" ")[0]);
			int num2 = Integer.parseInt(numbers.split(" ")[1]);
			int num3 = Integer.parseInt(numbers.split(" ")[2]);
			int num4 = Integer.parseInt(numbers.split(" ")[3]);
			double avg = (num1+num2+num3+num4)/4;
			double bun = ((num1-avg)*(num1-avg) + 
					(num2-avg)*(num2-avg) +
					(num3-avg)*(num3-avg) +
					(num4-avg)*(num4-avg))/4;
			System.out.println("평균 : " + avg);
			System.out.println("분산 : " + bun);
		*/
		//pb09) 문장을 입력받아 단어의 수를 출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("문장을 입력하세요 : ");
			String[] sentences = sc.nextLine().split(" ");
			System.out.println("해당 문장의 단어 수는 "+sentences.length+"개 입니다.");
		*/
		//pb10) 두 묹장을 입력받아 문장의 길이을 합 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("문장1 : ");
		String sentence1 = sc.nextLine();
		System.out.print("문장2 : ");
		String sentence2 = sc.nextLine();
		System.out.println("길이의 합은 "+ (sentence1.length()+ sentence2.length())+" 입니다");
	}

}
