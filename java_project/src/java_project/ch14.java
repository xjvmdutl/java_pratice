package java_project;

import java.util.Scanner;

public class ch14 {

	public static void main(String[] args) {
		//�ݺ��� for�� : for(�ʱ�ȭ ;���ǹ�;�ݺ�){...}
		//�ʱ�ȭ -> ���ǹ� -> ���๮�� -> �ݺ���
		//ex01) for���� �ʱ�����, �ݺ�����, �ݺ� ���๮�� ���ٷ� ����
		/*
			for(int i=1 ; i<=10; i++) {
				System.out.printf("%d ",i);
			}
		*/
		//ex02) for������ �ʱ�ȭ, ���ǹ�, �ݺ����๮�� ��ĭ���� �δ°��� �ƹ��͵� �������� �ʰԴٴ� �ǹ�, ���ǹ��� ���Ͻ� true�ִ°�
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
		//ex03) for���� �̿��Ͽ� 1~100������ ¦�� �� ���ϱ�
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
		//pb01) 100 ~ 1000���� 7�� ����� �� ���ϱ�
		/*
			int total = 0;
			for(int i = 100; i<=1000;++i) {
				if(i%7 == 0) {
					total +=i;
				}
			}
			System.out.println(total);
		*/
		//pb02) for���� Ȱ���Ͽ� 1���� �Է��� ���� n������ �ձ��ϱ�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
			int num = sc.nextInt();
			int sum = 0;
			for(int i = 1;i<=num;++i) {
				sum+=i;
			}
			System.out.println("1���� "+num+"������ ���� "+sum);
		*/
		//pb03) ��°�� ����
		/*
			int sum = 0;
			for(int num = 2018;num>0;) {
				sum += num & 10;//2 
				num = num & (num-10);
			}
			System.out.println(sum);//2
		*/
		//pb04) ��� �������
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
		//pb05) �Էµ� ���� �Ҽ����� �Ǻ����ִ� ���α׷� �ۼ�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
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
		//pb06) �Է��� ���� �� �ڸ����� ���ϴ� ���α׷�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
			int num = sc.nextInt();
			int sum = 0;
			for(int i=num;i>0;) {
				sum += i%10;
				i/=10;
			}
			System.out.println(num + "�� ��  �ڸ����� ���� ? "+sum);
		*/
		//pb07) �ڿ��� �Է¹޾� �� �ڸ��� ������ ������ ������ ���� ���ϱ�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
			int num = sc.nextInt();
			int sum = 0;
			for(int i=1;i<num;) {
				sum+=((num/(i*10))*i)+(num%i);
				i*=10;
				
			}
			System.out.println(num + " >> "+sum);
		*/
		//pb08) ���ڿ� �Է¹޾� �� �ƽ�Ű �ڵ尪�� ���ϱ�
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
		//pb09)1*2-2*3 +3*4...  �� ����������� ��� ���س����� ������ 100�̤��Ǵ� ��������(������)�� �������� ����ϴ� ���α׷�
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
		//handsomeQ ���� : �ڿ��� n�� ���� 1�̵ɋ����� n�� ¦���� n=n/2, Ȧ���� n=2*n+2
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
