package java_project;

import java.util.Scanner;

public class ch16 {

	public static void main(String[] args) {
		// �޼ҵ� : ������ �Լ��� ����� �ǹ� = �Է¿� ���Ͽ� �ϳ��� ����� ����
		//�ݺ����� �۾��� ����� �ſ� ȿ�����̴�
		//public static �����ڷ��� �޼ҵ��(input){ ... return ���ϰ�;//void�� ���� �ʿ�x }
		//ex01) �ΰ��� ������ �Է¹޾Ƽ� ����� ������ ������ ��ȯ�ϴ� sum(int a, int b) �Լ�
		/*
			int num1 = 10;
			int num2 = 20;
			int answer = sum(num1,num2);
			System.out.println(answer);
		*/
		//ex02) �޼ҵ�� return�� Ȱ���Ͽ� �� ��ȯ ���� ���������� ������ ���� �����ص� �ȴ�(void)
		/*
			say1();
			say2("Kim");
			System.out.println(divideby2(1.4));
		*/
		//ex03) Ư���� ��� �޼ҵ带 ���� ������ ���ؼ��� return�� �ܵ����� �Ἥ �޼ҵ带 ��� ���������� �ִ�.
		// say_name �޼ҵ�� �Է°����� Bob�̶�� ���� ������ ���ڿ� �������� �ʰ� ��� ������.(return �� ���� ���������� ����� ���� �ڷ����� void�ΰ�츸 ����)
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the name : ");
			String name = sc.nextLine();
			say_name(name);
		*/
		//ex04) �޼ҵ忡�� ���̴� ������ �޼ҵ� ���� ������ �̸��� ���Ƶ� ��� ����.
		// �޼ҵ� �������� ���̴� ������ ���ú������ �Ѵ�.
		/*
			int a = 1;
			plusA(a);
			System.out.println(a);
		*/
		//pb01) ��°�� ����
		/*
			int a =1;
			a = plusA(a);
			a = plusA(a);
			System.out.println(a);//3
		*/
		
		//pb02) ��°�� ����
		/*
			int a = 1;
			int b = 1;
			a = plusAB(a,b);//3
			a = plusAB(a,b);//5
			System.out.println(a);//5
		*/
		//pb03) �Ʒ� ���ؿ� ���� �л� ������ �Է¹޾� ������ �����ϴ�  grade(int score) �޼ҵ� �ۼ�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the score : ");
			int score = sc.nextInt();
			System.out.println(grade(score));
		*/
		//pb04) �ڿ��� n�� �Է¹޾� 1~n-1������ ������ ������ 5�γ��� ���������� ���� �����ϴ� �Լ� fun(int n)�� �ۼ�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the num : ");
			int num = sc.nextInt();
			int sum = fun(num);
			System.out.println(sum);
		*/
		//pb05) wordlist(String str) �� ������ �Է¹޾� �� ���ĺ��� �빮�ڷ� �ٲ� �� �ܾ�� �߶� ����ϴ� �޼ҵ�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the str : ");
			String str = sc.nextLine();
			wordlist(str);
		*/
		//pb06) gcd(n,m)�� �� �ڿ����� �Է¹޾� �ִ������� �����ϴ� �Լ��̰� lcm(n,m)�� �ּ� ������� �����ϴ� �Լ� ��ĭ ä���
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
		//pb07) �޼ҵ� �Ѱ��� �����Ͽ� ������ �Է¹޾� �Է¹��� ���ڸ� �Ųٷ� ������ ���� ���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			int reverse = Reverse(num);
			System.out.println(reverse);
		*/
		//pb08) ��� ��� ����
		/*
			int a = 1;
			int b = 1;
			a = fun(a,b);//a=4
			b = fun(a,b);//b=8
			System.out.printf("%d %d",a,b);
		*/
		//pb09) swap(int num,int i,int j)�� 10�� i-1 �ڸ����� 10�� j-1�ڸ����� �ٲ㼭 ���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			System.out.println(num);
			int swap = Swap(num,3,2);
			System.out.println(swap);
		*/
		//pb10) � �� n�� �ԷµǸ� n�� �� �ڸ����� ���� ���ڸ��� �ɋ����� ����Ͽ� ����ϴ� ���α׷�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			int isOneNum = Func(num);
			System.out.println(isOneNum);
		*/
		//pb11)��ü �ڵ�� 20���� ���� ������ 3�ǹ���� �����ϴ� ismulThree(n),5�ǹ���� �����ϴ� ismulFive(n)�� �����ϸ�
		//	   100000���� ���� ���� �ڿ����� 3�Ǵ� 5�� ����� ��� ���Ѱ��� ���
		/*
			long sum =0L;
			for(long n=1;n<100000;++n) {
				if(ismulThree(n) || ismulFive(n)) {
					sum+=n;
				}
			}
			System.out.println(sum);
		*/
		//pb12) 0~9���� ���ڰ� ��� �ѹ��� �������� Ȯ��
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			Long num = sc.nextLong();
			
			System.out.println(Func(num));
		*/
		//pb13) ���� n�� �Է¹޾����� 1~n������ ������ ������ 1�� �� ������ ���ϱ�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			int count = Func(num);
			System.out.println(count);
		*/
		//pb14) ���ڸ� �Է��ϸ� ���� �ѹ����� �Ǻ�
		//      ���� ���� n�� ���Ͽ� d(n)�� n�� n�� �� �ڸ����� ���ϴ� �Լ���� ���� ������ ex)d(75) = 75+7+5
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			boolean isMake = isFunc(num);
			System.out.println(isMake);
		*/
		//pb15) ������ �ڿ����� �׺��� ���� ���������� ������ ǥ�� �����ϴ�.
		//fun_double(n)�� �ڿ��� n�� �־����� ��ǥ������ �ּ� ���������ϳ��� ���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			fun_Double(num);
		*/
		//pb16) ��� �м��� ���ѼҼ��� ��ȯ���� ���� ���ѼҼ��� ǥ���ȴ�.
		// ���� ��� 1/8�� 0.125 �� ���ѼҼ� , 1/7 = 142857�� ��ȯ�ϴ� ���ѼҼ�
		//1~100���� N�� ���Ͽ� fun_recurring(n)�� 1/n�� ��ȯ���� ���ϴ� �Լ��Դϴ�.
		//���� 1/n�� ���ѼҼ��� 0���� ,  ���ѼҼ��̸� ��ȯ���� ����
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
			temp = temp + result.substring(i,i+1);//���ڸ��� ���Ѵ�.
			int tL = temp.length();
			if(temp.equals(result.substring(tL,2*tL))) {
				return temp;
			}
		}
		return "0";
	}
}
