package java_project;

import java.util.Scanner;

public class ch11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc =new Scanner(System.in); System.out.print("���� �Է�: "); int number =
		 * sc.nextInt(); for(int i=number;i>0;--i) { for(int j=1;j<i;++j) {
		 * System.out.print(" "); } for(int k=0;k<((number-i)*2)+1;++k) {
		 * System.out.print("*"); } System.out.println();
		 }*/
		
		// ���ǹ� : if(){}else if(){..}else{...}
		// ���� ������ : (����) ? ����� : ������� ;
		//pb01) : ���� �ϳ��� �Է� �޾� Ȧ���̸� oddNumber,¦���̸� evennumber�� ���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int number = sc.nextInt();
			if(number %2 != 0) {
				System.out.println("odd number");
			}else {
				System.out.println("even number");
			}
		*/
		//pb02) : �ֹι�ȣ ���ڸ��� �Է¹޾� 65 �̻��̸� old�� ����ϴ� ���α׷� �ۼ�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			String number = sc.nextLine();
			int age = Integer.parseInt(number.substring(0,2));
			//2018�� ����
			if(2018-(age-1+1900) > 65) {
				System.out.println("old");
			}else {
				System.out.println("age");
			}
		*/
		//pb03) : if�� ���α׷����� ����
		/*
			int num =13;
			//num����� ���� 2,3�� ����ΰ�?
			//boolean ans = (num%2 == 0)|(num%3 == 0);
			if(num%2==0 | num%3==0) {
				System.out.println("2�Ǵ� 3�� ����ΰ�? "+ true);
			}
		*/
		//pb04) : ��°�� ����
		/*
			int num = 73;
			if(num<=30) {
				num += ++num;
			}
			if(num<=100) {
				num -= num/2;//37
			}
			System.out.println(num);
		*/
		//pb05) : ��°�� ����
		/*
			int num = 53;
			if(num <= 60) {
				if(num<=30) {
					num+= --num/2 -30;
				}else {
					num -= --num/2 + 30;//-3
				}
				num+= ++num;//-5
			}
			System.out.println(num);
		*/
		//pb06) �л��� ������ �Է¹޾� ������ A,b = �� ���߽��ϴ�, C,D = �� �� ����ϼ���. , F = �����б⿡ �ٽ� �����ϼ��並 ���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			String num = sc.next();
			if("A".equals(num) || "B".equals(num)) {
				System.out.println("�� ���߽��ϴ�");
			}else if("C".equals(num) || "D".equals(num)) {
				System.out.println("�� �� ����ϼ���");
			}else {
				System.out.println("�����б⿡ �ٽ� �����ϼ���");
			}
		*/
		//pb07) �⵵�� �Է¹޾� ������� ����//����� 4�� ���� �������� ��
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("�⵵ �Է� : ");
			int year = sc.nextInt();
			if(year%4 ==0) {
				if(year %100 == 0) {
					if(year % 400 == 0) {
						System.out.println("����");
					}else {
						System.out.println("���");	
					}
				}else {
					System.out.println("����");
				}
			}
		*/
		//pb08) ���ڵ� ��ȣȭ 1000������ ������ 2�������� ��ȯ�� �ٽ� 8�������� �ؼ��� ��
		//		1000�Ѵ� ������ 8���� ��ȯ�� �ٽ� 16�������� �ؼ�
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("��й�ȣ �Է� : ");
			int password = sc.nextInt();
			if(password > 0) {
				if(password <= 1000) {
					String newPassword = Integer.toBinaryString(password);
					password= Integer.parseInt(newPassword,8);
					
				}else{
					String newPassword = Integer.toOctalString(password);
					password = Integer.parseInt(newPassword,16);
				}
			}
			System.out.println(password);
		*/
		//pb09) ���� ���� �ϳ��Է¹޾� ó�� �����ϴ� ���ĺ��� �����̸� goog sentence �� ����ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		String sentence = sc.nextLine();
		if(sentence.indexOf(sentence) != -1) {
			
		}
	}
}
