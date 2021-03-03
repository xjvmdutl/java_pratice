package java_project;

import java.util.Scanner;

public class ch13 {

	public static void main(String[] args) {
		//반복 while문  while(조건문) {  수행할 문장 }
		//do while문 do { 수행할 문장 } while(조건문) = 반드시 한번은 실행한다.
		//ex01) 반복문은 무한루프에 빠지지 않도록 종료조건을 명확히 설계하는것이 중요.
		/*
			int num=5;
			System.out.println("Count Down Starts");
			while(num>=0) {
				System.out.print(num + " ");
				num--;
			}
			System.out.println("Boom!");
		*/
		//ex02) break  = 조건에 관계없이 반복문 구문을 빠져나오고 countinue는 뒤에 코드를 실행하지 않고 조건문으로 돌아간다.
		/*
			int i = 1;
			while(true) {
				i++;
				if(i>=3 && i<=5) {
					 continue;
				}
				System.out.printf("%d 번쨰 ....\n",i);
				if(i==7) {
					break;
				}
			}
		*/
		//ex03) dowhile은 처음 시작은 조건문 관계없이 반드시 한번 실행
		/*
			int i = 1;
			while(i <=0) {
				System.out.println(i);
			}
			do {
				System.out.println(i);
			}while(i <= 0);
		*/
		//pb01) 빈칸 채우기
		/*
			int i = 2;
			while(i<=20) {//2 4 8 16
				System.out.printf("%d ",i);
				//빈칸
				i*=2;
			}
		*/
		//pb02) 빈칸 채우기
		/*
			int i =1;
			while(i<=5){//빈칸
				System.out.printf("%d ",i*3 );//빈칸
				i++;
			}
			//3 6 9 12 15
		*/
		//pb03)출력 결과 적기
		/*
			int num = 1;
			do {
				if(num >= 100) {
					System.out.println(100);
					break;
				}
				num*=2;
				System.out.print(num++ + " ");
			}while(num>=2);
			//2 6 14 30 62 126 100
		*/
		//pb04) while문 활용 영문자 q가 입력될때까지 반복
		/*
			Scanner sc = new Scanner(System.in);
			String str = "";
			while(!str.equals("q")) {
				System.out.print("Enter the alphabet : ");
				str = sc.next();
			}
			System.out.println("Finish");
		*/
		//pb05) while문을 활용하여 두수를 입력받아 작은수에서 크수까지 5의 배수 순서대로 출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("first Num : ");
			int num1 = sc.nextInt();
			System.out.print("second Num : ");
			int num2 = sc.nextInt();
			if(num1 > num2) {
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
			num1 = (5*(num1/5+1));
			while(num1 < num2) {
				System.out.println(num1);
				num1+=5;
			}
		*/
		
	}

}
