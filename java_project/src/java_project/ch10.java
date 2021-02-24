package java_project;

import java.util.Scanner;

public class ch10 {

	public static void main(String[] args) {
		//pb01)ABCD 변수를 선언. 각각 출력문이 출력하는 화면 출력
		/*
			int A = 1;
			int B = 3;
			int C = 5;
			int D = 7;
			System.out.println(A - 2 *A);//-1
			System.out.println(A +B %C);//4
			System.out.println(++A * A  -D);//-3
			System.out.println((B++) - ++B);//-2
			//System.out.println(++(B + C) -B);//error
			System.out.println(--B - B + (++B));//5
			System.out.println((A++) + ++A * ++A);//22
		*/
		//pb02) 다음 조건을 만족(프로그램수 10미만,if문 사용x)하면서 변수 num을 입력받아 3의 배수이면서 4의 배수가 아니면 true, 맞으면 false출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			boolean isCheck = num%3 != 0 || num%4 != 0;
			System.out.println(isCheck);
		*/
		//pb03) 출력 결과 적기
		/*
			System.out.println("3 + 5 = "+2 + 5);//25
			System.out.println("4 + 7 = "+(4+7));//11
			System.out.println("false "+ true);//false true
			System.out.println(3.7+"2.2"+1.6);//3.72.21.6
		*/
		//pb04) 수를 입력 받아서 2진수의 표현을 출력
		/*
			System.out.print("Enter the Number : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			String Hex_num = Integer.toHexString(num);
			System.out.println(num + "의 16진법 표현 : "+Hex_num);
		*/
		
		//pb05) 각각의 출력문이 출력하는 화면 적기
		//System.out.println(2<3 && 3 == 2 != 2);//error 뒷부분이 뭘 기준으로 비교한느지 모른다.
		/*
			System.out.println(true | 3 - 5 < -2 | false);//true
			System.out.println(2 == 2 && true ^ false != false);//true
			System.out.println(false | 2 < 3 == (3!=2));//true
		*/
		//pb06) 자연수 하나ㅇ를 입ㄹ력받아 num의 4배를 2진수로 표현
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("하나의 수 입력 : ");
			int num=sc.nextInt();
			num*=4;
			System.out.println(Integer.toBinaryString(num));
		*/
		//pb07) print문 하나로 이루어진 화면 출력
		//System.out.printf("C:\\User\\dataset");
		//pb08)빈값 채우기
		/*
			String str ="ABCDEFGH";
			System.out.println(str.charAt(5));//F
			System.out.println(str.substring(5,7));
			System.out.println(str.substring(0,4).replace('B', ' '));
			System.out.println(str.substring(0,str.length()-2));
			System.out.println(str.charAt(7));
			System.out.println(str.charAt(6));
			System.out.println(str.charAt(5));
		*/
		//pb09) 자연수 N 을 입력받아 N번째 알파벳을 대 소 문자 출력
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("정수 입력: ");
			int n = sc.nextInt();
			System.out.printf("%c %c",n+64,n+96);
		*/
		//pb10 ) 5자리 정수를 입력 받아 만의 자리와 십의 자리의 곱을 출ㄹ력
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("정수 입력: ");
			int n = sc.nextInt();
			System.out.println((n/10000) * (n%100/10));
		*/
		//pb11) 3자리 정수를 입렭 받아 2진수로 변환한뒤 오른쪽 2번째 비트와 5번째 비트 출력
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("정수 입력: ");
			int n = sc.nextInt();
			String binary = Integer.toBinaryString(n);
			System.out.println("두번째 비트 : " + (n%(4)>>1));
			System.out.println("다섯번째 비트 : " + ((n%(32))>>4));
		*/
		//pb12) 6개 정수를 입렭받아 모두 붙혀서 문자열로ㅓ 저장 후 세자리씩 나워 합을 구한다
		Scanner sc =new Scanner(System.in);
		System.out.print("정수 입력: ");
		String numbers = sc.nextLine();
		numbers=numbers.replace(" ","");
		boolean ischk = true;
		int sum = 0;
		while(numbers.length()>3) {
			sum += Integer.parseInt(numbers.substring(0,3));
			numbers = numbers.substring(3);
		}
		sum += Integer.parseInt(numbers);
		System.out.println(sum);
		
	}

}
