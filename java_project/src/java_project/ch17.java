package java_project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ch17 {

	public static void main(String[] args) {
		// random �Լ� : 1) MathŬ������ random()�޼ҵ� Math.random()�ڵ带 ���� 0.0~1.0�̸��� doubleŸ�ԽǼ��� �����ϰ� �߻�
		//				���� max~min������ ������ ���ϰ� �ʹٸ� (int)Math.random()*(max-min+1)+min �̷��� ���
		//				2) RandomŬ������ ���  random��ü�� �����ؼ� nextInt,nextBoolean �޼ҵ� Ȱ��
		//ex01) MathŬ������ random()�޼ҵ�
		/*
			double num1 = Math.random();
			System.out.println(num1);
			
			int max = 20;
			int min = 10;
			int num = (int)(Math.random()*(max-min+1)+min);
			System.out.println(num);
		*/
		//ex02) Random()����� Ȱ���� ������ �߻� nextInt(max)�� 0~Max���� ������ �߻�
		/*
			Random r = new Random();
			int var1 = r.nextInt(10);
			boolean var2 =r.nextBoolean();
			double var3 = r.nextDouble();
			System.out.printf("%d %b %f ",var1,var2,var3);
		*/
		//ex03) ��ǻ�Ͱ� �߻���Ų ���ڸ� ������ ���ߴ� ���α׷�
		/*
			Random rd = new Random();
			Scanner sc = new Scanner(System.in);
			int answer =rd.nextInt(10);
			int num =0;
			do {
				System.out.print("10 ���� ���� ���߼��� : ");
				num = sc.nextInt();
			}while(num != answer);
			System.out.println("�­����ϴ�.");
		*/
		//pb01) 1~10������ ���� 5���� �߻����� ���� �ϳ��� �߻����� �� ���� �������� ��պ��� ũ�� Big ������ Small
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
		//pb02) 0.00���� 10.00���� �Ҽ� ��° �ڸ����� ������ �Ǽ� ������ �߻���Ű�� ���α׷� �ۼ�
		/*
			Random r = new Random();
			double num = r.nextDouble();
			num = Math.nextUp(num);//0.0000000000~0.9999999999
			num = Math.round((num*1000))/100.0; // 0~999/100.0 => 0~9.99
			System.out.println(num);
		*/
		//pb03) 0~100������ ¦���� �����ϰ� �߻��ϰ� Ȧ���� �����ϰ� �߻��ϴ� ���α׷� �ۼ�
		/*
			int n1 = oddNum();
			int n2 = EvenNum();
			System.out.println(n1 + " : "+n2);
		*/
		//ex04) ǥ�� ���Ժ����� �����߻��� Random Ŭ������ nextGaussian()�޼ҵ带 Ȱ�� : -log u/n(� ������ �߽����� �� ���� �󵵰� �ö�)
		/*
			Random r = new Random();
			double rNarm = r.nextGaussian();
			double u = r.nextDouble();
			double lambda = 5.0;
			double rExpo = - Math.log(u)/lambda;
			System.out.printf("%f %f",rNarm,rExpo);
		*/
		//pb04) ���׺����� p�� Ȯ���� �����ϴ� ����� n�� ���� �ߤ����� ����� �����ϴ� Ƚ���� ������ ������ �ǹ� �̷��� ������(n,p)�� ������ ���׺���
		//		�� n���� 0~1 ������ ������ �߻����Ѽ� p���� ū ���� ���� Ƚ�� ���ϱ�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int n = sc.nextInt();
			int rBinom = rBinom(n,0.5);
			System.out.println(rBinom);
		*/
		//pb05) �μ��� �Է¹ް� �Է¹��� �μ� ������ ������ �������� ����Ϥô� ���α׷� �ۼ�(���� �μ� ���� ���� ������� no integer between two numbers ���)
		/*
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			System.out.print("�� ������ �Է��Ͻÿ� : ");
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
		//pb06) ��ǻ�Ͱ� �������� �߻��� ������ ���ߴ� ����
		//		Level 1 : 1~2�߿� �ϳ��� ���� ���߱�
		//		Level 2 : 1~4�߿� �ϳ��� ���� �����.
		//		Level 3 : 1~8�߿� �ϳ��� ���� �����.
		//		3�ܰ� ������ Locky ���߿� Ʋ���� failure ���
		/*
 		if(stepOne() && stepTwo() && stepThree()) {
 			System.out.println("Lucky");
 		}else {
 			System.out.println("Failure");
 		}
		*/
		//pb07) ���������� �־��� �������� Ư�� ����� �Ͼ ������ �ɸ� �ð��� �����ϴ� Ȯ������
		//		��� �Ĵ翡 �մ��� �ѽð��� 20�� �´ٸ� �մԵ��� �����ϴ� �ð��� ������ ����� 1/20�ð� �� 5���� ���������� ������(-log u/n)
		//		t =0�� �������� u=1/20�� ���������� �߻��� �ټ����� �������� ������ 4.7 1.5 7.8 5.2 6.1 �̶�� ���� 4.7 6.2 14.0 19.2 25.3���������� �ǹ�
		//		���� ������ �Է¹ް� ���������� ������ �������� 10�� �߻���Ų�� �ð� 0 �������� ���� ������ �ð��� ���ϴ� ���α׷� �ۼ�
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
		//pb08) ���� �����ϴ� �մ��� �ð� ���� = 1/20 , ���� ����� �ӵ� ��� 3�� , �ѽð� ���� �մԵ��� �� ��ٸ� �ð��� ���ϴ� �ùķ��̼� ���α׷� �ۼ�
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
