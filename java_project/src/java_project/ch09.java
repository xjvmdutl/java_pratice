package java_project;

import java.util.Scanner;
import java.io.IOException;

public class ch09 {

	public static void main(String[] args) throws IOException{
		// �Է¹� : Scanner Ŭ���� ���(import)
		//		  nextLine(),nextDouble(),nextInt()�Լ�����ؼ� �Է¹޴´�
		//		  System.in.read()�Լ��� ���ؼ��� �Է¹����� ������ �ϳ��� ������ �Է¹����� �־� �ַ� ���ڿ� �Է¹����� ���
		//ex01) import java.util.Scanner ����Ʈ�� Scanner ��ü�� �����ѵ� �Է¹޴´�.
		/*
			Scanner sc = new Scanner(System.in);//Scanner ��ü ����
			System.out.print("�̸���?");
			String name = sc.next();
			System.out.println(name);
		*/
		//ex02) new Scanner�� �Ķ���ʹ� ���α׷� �ý��ۿ� �Է��� �ްڴٰ� ���� �Ѱ�
		//		next() : ���� ������ ���ڿ��� �б�
		//		nextLine() : ���� ���� , nextDouble,nextInt :�Ǽ�, ���� �Է�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸���? ");
			String name = sc.next();
			System.out.print("���̴�? ");
			int age = sc.nextInt();
			System.out.print("������? ");
			float score = sc.nextFloat();
			System.out.println(name + " " + age + "��, ������ "+score);
		*/
		//ex03) scanner Ŭ������ �̿����� �ʰ� System.in.read() �޼ҵ带 �̿�
		/*
			int a = System.in.read();
			System.out.print(a);
		*/
		//pb01) �Է¹��� Ȱ���Ͽ� ������� �⺻�� �⺻���� �Է¹ޱ�
		/*
			System.out.println("<����� �⺻����>");
			Scanner sc =new Scanner(System.in);
			System.out.print("�̸��� �Է��ϼ��� ");
			String name = sc.next();
			System.out.print("���̸� �Է��ϼ��� ");
			int age = sc.nextInt();
			System.out.println("����� �̸��� "+name + ", ���̴� "+age);
		*/
		//pb02) �̸��� Ű �����Ը� �Է¹޴´�, print���� �ϳ��� ���
		
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸��� �Է��ϼ���. ");
			String name = sc.next();
			System.out.print("Ű�� �Է��ϼ���. ");
			double key = sc.nextDouble();
			System.out.print("�����Ը� �Է��ϼ���. ");
			int height = sc.nextInt();
			System.out.println(name+"�� Ű�� "+key+"cm, �����Դ� "+height + "kg");
		*/
		//pb03) �μ��� �Է¹޾� �μ��� ���� ���
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("�μ��� �Է��ϼ��� : ");
			String num1Plusnum2 = sc.nextLine();
			int num1 = Integer.parseInt(num1Plusnum2.substring(0,num1Plusnum2.indexOf(' ')));
			int num2 = Integer.parseInt(num1Plusnum2.substring(num1Plusnum2.indexOf(' ')+1));
			System.out.println("�Է��� �� ���� ���� : "+(num1+num2));
		*/
		//pb04) �̸��� �Է¹޾� �̸��� ���ڼ��� ���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸��� ? ");
			String name = sc.next();
			System.out.println(name.length());
		*/
		//ex04) �ΰ��� ���� �ϳ��� �ٿ��� �Է� �ް������� => �������� �μ��� ����
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("�� ���� �Է�: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("%d %d ",a,b);
		*/
		//pb05) �� ���� �Է� �޾� ó�� �Ϸ� ���� ���� �ι��� �Է¹��� ������ Ŭ��  true, �ƴϸ� false
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("first Number : ");
			int num1 = sc.nextInt();
			System.out.print("second Number : ");
			int num2 = sc.nextInt();
			boolean isBig = num1 < num2;
			System.out.println(isBig);
		*/
		//pb06) ���� ���� �Ԥ��¹޾� ó�� �μ��� ���� ������ ���� ������� true �ƴϸ� false
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
		//pb07) 2017�� ���̰� 20�ϋ� �⵵�� �Է��ϸ� �ش� �⵵�� ���̸� ���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("�⵵�� �Է��ϼ��� : ");
			int year = sc.nextInt();
			int age = 20;
			System.out.println(year +"�� ������ ���̴� "+(age+year-2017) +"�� �Դϴ�." );
		*/
		//pb08) ���� 4�� �Է¹޾� ��հ� �л��� ������ִ� ���α׷�(split()�Լ��� ����Ͽ� ������ �������� ���ڸ� �߶� ����Ʈ�� ����)
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("�� ���� �Է��ϼ��� : ");
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
			System.out.println("��� : " + avg);
			System.out.println("�л� : " + bun);
		*/
		//pb09) ������ �Է¹޾� �ܾ��� ���� ���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �Է��ϼ��� : ");
			String[] sentences = sc.nextLine().split(" ");
			System.out.println("�ش� ������ �ܾ� ���� "+sentences.length+"�� �Դϴ�.");
		*/
		//pb10) �� �L���� �Է¹޾� ������ ������ �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		String sentence1 = sc.nextLine();
		System.out.print("����2 : ");
		String sentence2 = sc.nextLine();
		System.out.println("������ ���� "+ (sentence1.length()+ sentence2.length())+" �Դϴ�");
	}

}
