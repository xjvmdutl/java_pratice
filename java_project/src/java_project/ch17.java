package java_project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ch17 {

	public static void main(String[] args) {
		// random 함수 : 1) Math클래스의 random()메소드 Math.random()코드를 사용시 0.0~1.0미만의 double타입실수를 랜덤하게 발생
		//				만약 max~min까지의 정수를 구하고 싶다면 (int)Math.random()*(max-min+1)+min 이렇게 사용
		//				2) Random클래스를 사용  random객체를 생성해서 nextInt,nextBoolean 메소드 활용
		//ex01) Math클래스의 random()메소드
		/*
			double num1 = Math.random();
			System.out.println(num1);
			
			int max = 20;
			int min = 10;
			int num = (int)(Math.random()*(max-min+1)+min);
			System.out.println(num);
		*/
		//ex02) Random()모둘을 활용한 난수를 발생 nextInt(max)는 0~Max까지 정수를 발생
		/*
			Random r = new Random();
			int var1 = r.nextInt(10);
			boolean var2 =r.nextBoolean();
			double var3 = r.nextDouble();
			System.out.printf("%d %b %f ",var1,var2,var3);
		*/
		//ex03) 컴퓨터가 발생시킨 한자리 난수를 맞추는 프로그램
		/*
			Random rd = new Random();
			Scanner sc = new Scanner(System.in);
			int answer =rd.nextInt(10);
			int num =0;
			do {
				System.out.print("10 이하 수를 맞추세요 : ");
				num = sc.nextInt();
			}while(num != answer);
			System.out.println("맞췃습니다.");
		*/
		//pb01) 1~10까지의 난수 5개를 발생시켜 숫자 하나를 발생시켜 이 수가 난수들을 평균보다 크면 Big 작으면 Small
		/*
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			System.out.print("Random numbers : ");
			int sum=0;
			for(int i=0;i<5;++i) {
				int random = rd.nextInt(9)+1;
				sum += random;
				System.out.print(random + " ");
			}
			System.out.println("\n" + (sum/5 <  num ? "Big" : "small"));
		*/
		//pb02) 0.00부터 10.00까지 소수 둘째 자리까지 가지는 실수 난수를 발생시키는 프로그램 작성
		/*
			Random r = new Random();
			double num = r.nextDouble();
			num = Math.nextUp(num);//0.0000000000~0.9999999999
			num = Math.round((num*1000))/100.0; // 0~999/100.0 => 0~9.99
			System.out.println(num);
		*/
		//pb03) 0~100까지의 짝수를 랜덤하게 발생하고 홀수를 랜덤하게 발생하는 프로그램 작성
		/*
			int n1 = oddNum();
			int n2 = EvenNum();
			System.out.println(n1 + " : "+n2);
		*/
		//ex04) 표준 정규분포의 난수발생은 Random 클래스의 nextGaussian()메소드를 활용 : -log u/n(어떤 구간의 중심점에 더 많은 빈도가 올라감)
		/*
			Random r = new Random();
			double rNarm = r.nextGaussian();
			double u = r.nextDouble();
			double lambda = 5.0;
			double rExpo = - Math.log(u)/lambda;
			System.out.printf("%f %f",rNarm,rExpo);
		*/
		//pb04) 이항분포는 p의 확률로 성공하는 사건을 n번 실행 했ㅇ을떄 사건이 성공하는 횟수가 따르는 분포를 의미 이러한 부포를(n,p)를 따르는 이항분포
		//		즉 n번의 0~1 사이의 난수를 발생시켜서 p보다 큰 수가 나온 횟수 구하기
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int n = sc.nextInt();
			int rBinom = rBinom(n,0.5);
			System.out.println(rBinom);
		*/
		//pb05) 두수를 입력받고 입력받은 두수 사이의 정수를 랜덤으로 출력하ㅓ는 프로그램 작성(만약 두수 사이 정수 없을경우 no integer between two numbers 출력)
		/*
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			System.out.print("두 정수를 입력하시오 : ");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int max = n1<n2 ? n2:n1;
			int min = n1<n2 ? n1+1:n2+1;
			if(max - min >= 0) {
				int num = rd.nextInt(max-min);
				System.out.println(num+min);
			}else {
				System.out.println("no integer between two numbers");
			}
		*/
		//pb06) 컴퓨터가 랜덤으로 발생한 난수를 맞추는 게임
		//		Level 1 : 1~2중에 하나의 숫자 맞추기
		//		Level 2 : 1~4중에 하나의 숫자 맞춘다.
		//		Level 3 : 1~8중에 하나의 숫자 맞춘다.
		//		3단계 성공시 Locky 도중에 틀릴시 failure 출력
		/*
 		if(stepOne() && stepTwo() && stepThree()) {
 			System.out.println("Lucky");
 		}else {
 			System.out.println("Failure");
 		}
		*/
		//pb07) 지수분포는 주어진 시점으로 특정 사건이 일어날 때까지 걸린 시간을 측정하는 확률분포
		//		어느 식당에 손님이 한시간에 20명 온다면 손님들이 도착하는 시간의 간격은 평균이 1/20시간 즉 5분인 지수분포를 따른다(-log u/n)
		//		t =0을 기준으로 u=1/20인 지수분포로 발생한 다섯개의 도착간격 난수가 4.7 1.5 7.8 5.2 6.1 이라면 고객이 4.7 6.2 14.0 19.2 25.3도착했음을 의미
		//		지수 분포를 입력받고 지수분포에 따르는 도착간격 10개 발생시킨후 시간 0 기준으로 고객이 도착한 시각을 구하는 프로그램 작성
		/*
			Random rd = new Random();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the lambda : ");
			double lambda = sc.nextDouble();
			for(int i=0;i<10;++i) {
				double d = rd.nextDouble();
				System.out.println(-Math.log(d)/lambda);
			}
		*/
		//pb08) 가계 도착하는 손님을 시간 간격 = 1/20 , 버거 만드는 속도 평균 3분 , 한시간 동안 손님들의 총 기다린 시간을 구하는 시뮬레이션 프로그램 작성
		Random rd = new Random();
		double lamda = 1/20;
		double time = 0;
		double wating = 0;
		ArrayList<Double> arr = new ArrayList<Double>();
		ArrayList<Double> lev = new ArrayList<Double>();
		time = time +exp_randnum(lamda);
		while(time<=3600.0) {
			arr.add(time);
			lev.add(time +rd.nextDouble()*2+2);
			if(lev.get(lev.size()-1)>3600) {
				break;
			}
			time = time +exp_randnum(lamda);
		}
		for(int i=0;i<arr.size();++i) {
			Double max_lev=0.0;
			for(int j = 0 ;j<i;++j) {
				if(arr.get(i)<lev.get(j)) {
					max_lev=lev.get(j);
				}
			}
			wating += max_lev -arr.get(i);
		}
		System.out.println(wating);
	} 
	public static double exp_randnum(double lamda) {
		Random rd = new Random();
		return (-Math.log(rd.nextDouble())/lamda);
	}
	/* pb03
	public static int oddNum() {
		Random r = new Random();
		int num = r.nextInt(100);
		while(num%2 == 0) {
			num = r.nextInt(100);
		}
		return num;
	}
	public static int EvenNum() {
		Random r = new Random();
		int num = r.nextInt(100);
		while(num%2 != 0) {
			num = r.nextInt(100);
		}
		return num;
	}
	*/
	/* pb04
	public static int rBinom(int n,double p) {
		Random r = new Random();
		int count = 0;
		for(int i=1;i<=n;++i) {
			if(r.nextDouble() > p) {
				count++;
			}
		}
		return count;
	}
	*/
	/* pb06
	public static boolean stepOne() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Level1 (1~2) : ");
		int rand = rd.nextInt(2)+1;
		boolean result = rand != sc.nextInt() ? false : true;
		if(result) {
			System.out.println("Correct");
		}else {
			System.out.println("Answer is : "+ rand);
		}
		return result;
	}
	public static boolean stepTwo() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Level2 (1~4) : ");
		int rand = rd.nextInt(4)+1;
		boolean result = rand != sc.nextInt() ? false : true;
		if(result) {
			System.out.println("Correct");
		}else {
			System.out.println("Answer is : "+ rand);
		}
		return result;
	}
	public static boolean stepThree() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Level1 (1~8) : ");
		int rand = rd.nextInt(8)+1;
		boolean result = rand != sc.nextInt() ? false : true;
		if(result) {
			System.out.println("Correct");
		}else {
			System.out.println("Answer is : "+ rand);
		}
		return result;
	}
	*/
}
