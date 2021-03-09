package java_project;

import java.util.Scanner;

public class ch16 {

	public static void main(String[] args) {
		// 메소드 : 수학적 함수와 비슷한 의미 = 입력에 대하여 하나의 결과를 대응
		//반복적인 작업을 수행시 매우 효율적이다
		//public static 리턴자료형 메소드명(input){ ... return 리턴값;//void는 리턴 필요x }
		//ex01) 두개의 정수를 입력받아서 결과로 정수형 변수를 반환하는 sum(int a, int b) 함수
		/*
			int num1 = 10;
			int num2 = 20;
			int answer = sum(num1,num2);
			System.out.println(answer);
		*/
		//ex02) 메소드는 return을 활용하여 값 반환 가능 리턴형식이 없으면 굳이 사용안해도 된다(void)
		/*
			say1();
			say2("Kim");
			System.out.println(divideby2(1.4));
		*/
		//ex03) 특별한 경우 메소드를 빠져 나가기 위해서는 return만 단독으로 써서 메소드를 즉시 빠져나갈수 있다.
		// say_name 메소드는 입력값으로 Bob이라는 값이 들어오면 문자열 츨력하지 않고 즉시 나간다.(return 을 통해 빠져나가는 방법은 리턴 자료형이 void인경우만 가능)
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the name : ");
			String name = sc.nextLine();
			say_name(name);
		*/
		//ex04) 메소드에서 쓰이는 변수와 메소드 밖의 변수는 이름이 같아도 상관 없다.
		// 메소드 내에서만 쓰이는 변수는 로컬변수라고 한다.
		/*
			int a = 1;
			plusA(a);
			System.out.println(a);
		*/
		//pb01) 출력결과 적기
		/*
			int a =1;
			a = plusA(a);
			a = plusA(a);
			System.out.println(a);//3
		*/
		
		//pb02) 출력결과 적기
		/*
			int a = 1;
			int b = 1;
			a = plusAB(a,b);//3
			a = plusAB(a,b);//5
			System.out.println(a);//5
		*/
		//pb03) 아래 기준에 따라 학생 점수를 입력받아 학점을 리턴하는  grade(int score) 메소드 작성
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the score : ");
			int score = sc.nextInt();
			System.out.println(grade(score));
		*/
		//pb04) 자연수 n을 입력받아 1~n-1까지의 각가의 수들을 5로나눈 나머지들의 합을 리턴하는 함수 fun(int n)을 작성
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the num : ");
			int num = sc.nextInt();
			int sum = fun(num);
			System.out.println(sum);
		*/
		//pb05) wordlist(String str) 은 문장을 입력받아 각 알파벳을 대문자로 바꾼 후 단어별로 잘라서 출력하는 메소드
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the str : ");
			String str = sc.nextLine();
			wordlist(str);
		*/
		//pb06) gcd(n,m)은 두 자연수를 입력받아 최대공약수를 리턴하는 함수이고 lcm(n,m)은 최소 공배수를 리턴하는 함수 빈칸 채우기
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the 1st number : ");
			int n = sc.nextInt(); 
			
			System.out.print("Enter the 2nd number : ");
			int m = sc.nextInt();
			
			int GCD = gcd(n,m);
			int LCM = lcm(n,m);
			System.out.printf("GCD of %d and %d is %d\n",n,m,GCD);
			System.out.printf("LCM of %d and %d is %d\n",n,m,LCM);
		*/
		//pb07) 메소드 한개를 정의하여 정수를 입력받아 입력받은 숫자를 거꾸로 뒤집은 수를 출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			int reverse = Reverse(num);
			System.out.println(reverse);
		*/
		//pb08) 출력 결과 적기
		/*
			int a = 1;
			int b = 1;
			a = fun(a,b);//a=4
			b = fun(a,b);//b=8
			System.out.printf("%d %d",a,b);
		*/
		//pb09) swap(int num,int i,int j)은 10의 i-1 자릿수와 10의 j-1자릿수를 바꿔서 출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			System.out.println(num);
			int swap = Swap(num,3,2);
			System.out.println(swap);
		*/
		//pb10) 어떤 수 n이 입력되면 n의 각 자릿수의 합이 한자리가 될떄까지 계산하여 출력하는 프로그램
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			int isOneNum = Func(num);
			System.out.println(isOneNum);
		*/
		//pb11)전체 코드는 20줄을 넘지 않으며 3의배수를 판정하는 ismulThree(n),5의배수를 판정하는 ismulFive(n)을 정의하며
		//	   100000보다 작은 작은 자연수중 3또는 5의 배수를 모두 더한값을 출력
		/*
			long sum =0L;
			for(long n=1;n<100000;++n) {
				if(ismulThree(n) || ismulFive(n)) {
					sum+=n;
				}
			}
			System.out.println(sum);
		*/
		//pb12) 0~9까지 숫자가 모두 한번만 쓰였는지 확인
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			Long num = sc.nextLong();
			
			System.out.println(Func(num));
		*/
		//pb13) 정수 n울 입력받았을때 1~n까지의 정수에 나오는 1의 총 갯수를 구하기
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			int count = Func(num);
			System.out.println(count);
		*/
		//pb14) 숫자를 입력하면 셀프 넘버인지 판별
		//      양의 정수 n에 대하여 d(n)을 n과 n의 각 자릿수를 더하는 함수라고 정의 했을때 ex)d(75) = 75+7+5
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			boolean isMake = isFunc(num);
			System.out.println(isMake);
		*/
		//pb15) 임의의 자연수는 그보다 작은 제곱수들의 합으로 표현 가능하다.
		//fun_double(n)은 자연수 n이 주어질때 그표현들중 최소 갯수들중하나를 출력
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			fun_Double(num);
		*/
		//pb16) 모든 분수는 유한소수나 순환마디를 갖는 무한소수로 표현된다.
		// 예를 들어 1/8은 0.125 의 유한소수 , 1/7 = 142857이 순환하는 무한소수
		//1~100까지 N에 대하여 fun_recurring(n)은 1/n의 순환마디를 구하는 함수입니다.
		//만약 1/n이 유한소수면 0리턴 ,  무한소수이면 순환마디를 리턴
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(fun_recurring(num));
	}
	
	
	/* ex01
	public static int sum(int a, int b) {
		return a+b;
	}
	*/
	// ex02
	/*
	public static void say1() {
		System.out.println("Hi");
	}
	public static void say2(String name) {
		System.out.println("My name is "+ name);
	}
	public static double divideby2(double num) {
		return num/2;
	}
	*/
	/* ex03
	public static void say_name(String name) {
		if("Bob".equals(name)) {
			return;
		}
		System.out.println(name);
	}
	*/
	/* ex04
	public static void plusA(int a) {
		a++;
	}
	*/
	/* pb01
	public static int plusA(int a) {
		a++;
		return a;
	}
	*/
	/* pb02
	public static int plusAB(int a,int b) {
		a++;
		b++;
		return ++a;
	}
	*/
	/* pb03
	public static char grade(int score) {
		if(100>score && score >=90) {
			return 'A';
		}else if(90>score && score >=80) {
			return 'B';
		}else if(80>score && score >=70) {
			return 'C';
		}else if(70>score && score >=60) {
			return 'D';
		}else{
			return 'F';
		}
	}
	*/
	/* pb04
	public static int fun(int num) {
		int sum = 0;
		for(int i=1;i<=num-1;++i) {
			sum+=i%5;
		}
		return sum;
	}
	*/
	/* pb05
	public static void wordlist(String str) {
		String[] strs = str.toUpperCase().split(" ");
		for(String s : strs) {
			System.out.println(s);
		}
	}
	*/
	/* pb06
	public static int gcd(int n,int m) {
		int min = n<m ? n:m;
		int num = min-1;
		while(num >= 2) {
			if(n%num == 0 && m%num ==0) {
				break;
			}
			num--;
		}
		return num;
	}
	public static int lcm(int n,int m) {
		int max = n<m ? m : n;
		int num = max;
		while(true) {
			if(num%m == 0 && num%n ==0) {
				break;
			}
			num++;
		}
		return num;
	}
	*/
	/* pb07
	public static int Reverse(int num) {
		int reverse = 0;
		while(num>0) {
			reverse*=10;
			reverse += num%10;
			num/=10;
		}
		return reverse;
	}
	*/
	/* pb08
	public static int fun(int a, int b) {
		if(a>b) {
			a=funA(a);
		}else {
			b=funB(b);
		}
		return a+b;
	}
	public static int funA(int a) {
		return funB(a++ + 1);
	}
	public static int funB(int b) {
		return (++b + 1);
	}
	*/
	/* pb09
	public static int Swap(int num,int i,int j) {
		int num1 = (int) (num % Math.pow(10, i)/Math.pow(10, i-1));
		int num2 = (int) (num % Math.pow(10, j)/Math.pow(10, j-1));
		int swap = num - (int)(num1*Math.pow(10, i-1)) - (int)(num2*Math.pow(10, j-1)) 
				+ (int)(num1*Math.pow(10, j-1)) + (int)(num2*Math.pow(10, i-1));
		return swap;
	}
	*/
	/* pb10
	public static int Func(int num) {
		int sum = 0;
		while(10 <= num ) {
			sum = 0;
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			num=sum;
		}
		return num;
	}
	 */
	/* pb 11
	public static boolean ismulThree(long n) {
		if(n%3==0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean ismulFive(long n) {
		if(n%5==0) {
			return true;
		}else {
			return false;
		}
	}
	*/
	/*	pb12
	public static boolean Func(long num) {
		for(int i=0;i<=9;++i) {
			boolean is_bth = false;
			int count= 0;
			long n = 1;
			while(num > n) {
				int bit_num =(int)(num/n%10);
				if(bit_num == i) {
					is_bth =true;
					count++;
				}
				n*=10;
			}
			if(!is_bth || count >1) {
				return false;
			}
		}
		return true;
	}
	*/
	/* pb13
	public static int Func(int num) {
		int count = 0;
		for(int n=1;n <= num; ++n) {
			int tmp = n;
			while(tmp>0) {
				if(tmp%10 == 1) {
					count++;
				}
				tmp/=10;
			}
		}
		return count;
	}
	*/
	/* pb14
	public static boolean isFunc(int num) {
		for(int i=1;i<num;++i) {
			int selfNum = i;
			while(selfNum <= num) {
				int tmp =selfNum;
				
				while(tmp>0) {
					selfNum += tmp%10;
					tmp/=10;
				}
				if(selfNum == num) {
					return false;
				}
			}
		}
		return true;
	}
	*/
	/* pb15
	public static void fun_Double(int num) {
		int sum = 0;
		int i =1;
		System.out.print("N = "+num+" >> [");
		String str = "";
		while(sum < num) {
			if(i*i<num) {
				i++;
				continue;
			}
			for(int j=i-1;j>=1;--j) {
				sum += j*j;
				if(sum > num) {
					sum -= j*j;
				}else {
					str += j+",";
					j++;
				}
			}
			
		}
		System.out.println(str.substring(0,str.length()-1)+"]");
	}
	*/
	/*pb16*/
	public static String fun_recurring(int num) {
		String result = new String();
		result = Double.toString(1/(double)num);
		result = result.substring(2);
		if(result.length()<8) {
			return "0";
		}
		String temp = "";
		for(int i=0;i<result.length();++i) {
			temp = temp + result.substring(i,i+1);//한자리씩 더한다.
			int tL = temp.length();
			if(temp.equals(result.substring(tL,2*tL))) {
				return temp;
			}
		}
		return "0";
	}
}
