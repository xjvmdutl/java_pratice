package java_project;

import java.util.Scanner;

public class ch14 {

	public static void main(String[] args) {
		//반복문 for문 : for(초기화 ;조건문;반복){...}
		//초기화 -> 조건문 -> 실행문장 -> 반복문
		//ex01) for문은 초기조건, 반복조건, 반복 실행문을 한줄로 정의
		/*
			for(int i=1 ; i<=10; i++) {
				System.out.printf("%d ",i);
			}
		*/
		//ex02) for문에서 초기화, 조건문, 반복실행문을 빈칸으로 두는것은 아무것도 실해하지 않게다는 의미, 조건문이 빈값일시 true넣는거
		/*
			for(int i= 1; ; i++) {
				if(i>=3 && i<=8) {
					continue;
				}else if(i==13) {
					System.out.println("we find 13");
					break;
				}
				System.out.printf("%d ",i);
			}
		*/
		//ex03) for문을 이용하여 1~100까지의 짝수 합 구하기
		/*
			int total = 0;
			for(int i =1; i<=100;++i) {
				if(i%2 != 0) {
					continue;
				}
				total += i;
			}
			System.out.println(total);
		*/
		//pb01) 100 ~ 1000까지 7의 배수의 합 구하기
		/*
			int total = 0;
			for(int i = 100; i<=1000;++i) {
				if(i%7 == 0) {
					total +=i;
				}
			}
			System.out.println(total);
		*/
		//pb02) for문을 활용하여 1부터 입력한 숫자 n까지의 합구하기
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 하나 입력하시오 : ");
			int num = sc.nextInt();
			int sum = 0;
			for(int i = 1;i<=num;++i) {
				sum+=i;
			}
			System.out.println("1부터 "+num+"까지의 합은 "+sum);
		*/
		//pb03) 출력결과 적기
		/*
			int sum = 0;
			for(int num = 2018;num>0;) {
				sum += num & 10;//2 
				num = num & (num-10);
			}
			System.out.println(sum);//2
		*/
		//pb04) 출력 결과적기
		/*
			int sum = 0;
			int i = 1;
			int j = 1;
		
			for(int num = 2018; num>0;) {
				if(num % 10 == 2) {
					sum += (num/10) *i +(j+1);
				}else if(num%10 > 2) {
					sum += (num/10+1)*i;
				}else {
					sum+=(num/10)*i;
				}
				j += i*(num%10);
				i+=2;
				num/=10;
				//1. sum = 202, j=9,i=3,num=201
				//2. sum = 262, j=12,i=5,num=20
				//3. sum = 272, j=12,i=7,num=2
				//4. sum = 285, j=26,i=9,num=0
			}
			System.out.println(sum);//285
		*/
		//pb05) 입력된 수가 소수인지 판별해주는 프로그램 작성
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 하나 입력하시오 : ");
			int num = sc.nextInt();
			boolean isPrime = true;
			for(int i =2;i<num;++i) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
			System.out.println(isPrime? num+" is prime number":num+" is not prime number");
		*/
		//pb06) 입력한 수의 각 자리수를 더하는 프로그램
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 하나 입력하시오 : ");
			int num = sc.nextInt();
			int sum = 0;
			for(int i=num;i>0;) {
				sum += i%10;
				i/=10;
			}
			System.out.println(num + "의 각  자릿수의 합은 ? "+sum);
		*/
		//pb07) 자연수 입력받아 각 자리를 제외한 나머지 수들의 합을 구하기
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 하나 입력하시오 : ");
			int num = sc.nextInt();
			int sum = 0;
			for(int i=1;i<num;) {
				sum+=((num/(i*10))*i)+(num%i);
				i*=10;
				
			}
			System.out.println(num + " >> "+sum);
		*/
		//pb08) 문자열 입력받아 각 아스키 코드값을 더하기
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter : ");
			String str = sc.nextLine();
			int sum = 0;
			for(int i=0;i<str.length();++i) {
				sum += str.charAt(i);
			}
			System.out.println(sum);
		*/
		//pb09)1*2-2*3 +3*4...  와 같은방식으로 계속 더해나갈떄 총합이 100이ㅏ되는 마지막수(앞을수)가 무엇인지 출력하는 프로그램
		/*
			int sum =0;
			int de = -1;
			for(int i=1;;++i) {
				de*=-1;
				sum += de*i*(i+1);
				if(sum>100) {
					System.out.println(i);
					break;
				}
			}
		*/
		//handsomeQ 수열 : 자연수 n에 대해 1이될떄까지 n이 짝수면 n=n/2, 홀수면 n=2*n+2
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		int num = sc.nextInt();
		for(int i=2; ; ++i) {
			if(num % 2 == 0) {
				num/=2;
			}else {
				num=2*num +2;
			}
			if(num == 1) {
				System.out.println(i);
				break;
			}
			
		}
	}

}
