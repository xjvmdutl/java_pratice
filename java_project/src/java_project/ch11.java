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
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("���� ���� �Է� : ");
			String sentence = sc.nextLine();
			if(sentence.indexOf('A',0) != -1
					|| sentence.indexOf('E',0) != -1
					|| sentence.indexOf('I',0) != -1
					|| sentence.indexOf('O',0) != -1
					|| sentence.indexOf('U',0) != -1) {
				System.out.println("Good Sentence");
			}
		*/
		//pb10) ���� �ΰ��� �Է¹޾� �μ��� �� ���ϱ�
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("���� 2���� �Է�(�������):");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int sum;
			if(num1 > num2) {
				sum = num1 -num2; 
			}else {
				sum = num2 - num1;
			}
			System.out.println(sum);
		*/
		//pb11) if-else�� 3�� �����ڷ� ����
		/*
			Scanner sc =new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			
	//		if(a+b >= 0.5 * a * b) {
	//			System.out.println("Nice");
	//		}else {
	//			System.out.println("Bad");
	//		}
			String s = a+b >= 0.5 * a* b? "Nice"  : "Bad"; 
			System.out.println(s);
		*/
		//pb12) �Էµ� �� ���� a,b,c �� ���� ���� ���� ���
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int min = 0;
			if(a < b && a < c) {
				min = a;
			}else if( b < c && b < a){
				min = b;
			}else{
				min = c;
			}
			System.out.println(min);
		*/
		//pb13) 4���� 3�� �����ڸ� �����Ͽ� �ۼ��Ѵ�. �ϳ��� ������ �Է¹޾� ���/����, Ȧ��/¦��, 3�� ���/�ƴ��� , 5�ǹ��/�ƴ��� �Ǻ����ִ� ���α׷�
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			boolean result1 = num > 0 ? true : false;
			boolean result2 = num % 2 != 0 ? true : false;
			boolean result3 = num % 3 == 0 ? true : false;
			boolean result4 = num % 5 == 0 ? true : false;
			System.out.println("���?"+result1);
			System.out.println("Ȧ��?"+result2);
			System.out.println("3�ǹ��?"+result3);
			System.out.println("5�ǹ��?"+result4);
		*/
		//pb14) ���� ��Ģ���� ���� �Է¹޾� ����ϱ�
		/*
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter : ");
		String input = sc.nextLine();
		int num1 = Integer.parseInt(input.split(" ")[0]);
		String result = input.split(" ")[1];
		int num2 = Integer.parseInt(input.split(" ")[2]);
		if("+".equals(result)) {
			System.out.println(num1+num2);
		}else if("-".equals(result)) {
			System.out.println(num1-num2);
		}else if("*".equals(result)) {
			System.out.println(num1*num2);
		}else if("/".equals(result)) {
			System.out.println(num1/num2);
		}else {
			System.out.println("ERROR");
		}
		*/
		
	}
}
