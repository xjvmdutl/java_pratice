package java_project;

import java.util.Scanner;

public class ch10 {

	public static void main(String[] args) {
		//pb01)ABCD ������ ����. ���� ��¹��� ����ϴ� ȭ�� ���
		/*
			int A = 1;
			int B = 3;
			int C = 5;
			int D = 7;
			System.out.println(A - 2 *A);//-1
			System.out.println(A +B %C);//4
			System.out.println(++A * A  -D);//-3
			System.out.println((B++) - ++B);//-2
			//System.out.println(++(B + C) -B);//error
			System.out.println(--B - B + (++B));//5
			System.out.println((A++) + ++A * ++A);//22
		*/
		//pb02) ���� ������ ����(���α׷��� 10�̸�,if�� ���x)�ϸ鼭 ���� num�� �Է¹޾� 3�� ����̸鼭 4�� ����� �ƴϸ� true, ������ false���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			boolean isCheck = num%3 != 0 || num%4 != 0;
			System.out.println(isCheck);
		*/
		//pb03) ��� ��� ����
		/*
			System.out.println("3 + 5 = "+2 + 5);//25
			System.out.println("4 + 7 = "+(4+7));//11
			System.out.println("false "+ true);//false true
			System.out.println(3.7+"2.2"+1.6);//3.72.21.6
		*/
		//pb04) ���� �Է� �޾Ƽ� 2������ ǥ���� ���
		/*
			System.out.print("Enter the Number : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			String Hex_num = Integer.toHexString(num);
			System.out.println(num + "�� 16���� ǥ�� : "+Hex_num);
		*/
		
		//pb05) ������ ��¹��� ����ϴ� ȭ�� ����
		//System.out.println(2<3 && 3 == 2 != 2);//error �޺κ��� �� �������� ���Ѵ��� �𸥴�.
		/*
			System.out.println(true | 3 - 5 < -2 | false);//true
			System.out.println(2 == 2 && true ^ false != false);//true
			System.out.println(false | 2 < 3 == (3!=2));//true
		*/
		//pb06) �ڿ��� �ϳ����� �Ԥ��¹޾� num�� 4�踦 2������ ǥ��
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("�ϳ��� �� �Է� : ");
			int num=sc.nextInt();
			num*=4;
			System.out.println(Integer.toBinaryString(num));
		*/
		//pb07) print�� �ϳ��� �̷���� ȭ�� ���
		//System.out.printf("C:\\User\\dataset");
		//pb08)�� ä���
		/*
			String str ="ABCDEFGH";
			System.out.println(str.charAt(5));//F
			System.out.println(str.substring(5,7));
			System.out.println(str.substring(0,4).replace('B', ' '));
			System.out.println(str.substring(0,str.length()-2));
			System.out.println(str.charAt(7));
			System.out.println(str.charAt(6));
			System.out.println(str.charAt(5));
		*/
		//pb09) �ڿ��� N �� �Է¹޾� N��° ���ĺ��� �� �� ���� ���
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("���� �Է�: ");
			int n = sc.nextInt();
			System.out.printf("%c %c",n+64,n+96);
		*/
		//pb10 ) 5�ڸ� ������ �Է� �޾� ���� �ڸ��� ���� �ڸ��� ���� �⤩��
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("���� �Է�: ");
			int n = sc.nextInt();
			System.out.println((n/10000) * (n%100/10));
		*/
		//pb11) 3�ڸ� ������ �Ԏ� �޾� 2������ ��ȯ�ѵ� ������ 2��° ��Ʈ�� 5��° ��Ʈ ���
		/*
			Scanner sc =new Scanner(System.in);
			System.out.print("���� �Է�: ");
			int n = sc.nextInt();
			String binary = Integer.toBinaryString(n);
			System.out.println("�ι�° ��Ʈ : " + (n%(4)>>1));
			System.out.println("�ټ���° ��Ʈ : " + ((n%(32))>>4));
		*/
		//pb12) 6�� ������ �Ԏ��޾� ��� ������ ���ڿ��Τ� ���� �� ���ڸ��� ���� ���� ���Ѵ�
		Scanner sc =new Scanner(System.in);
		System.out.print("���� �Է�: ");
		String numbers = sc.nextLine();
		numbers=numbers.replace(" ","");
		boolean ischk = true;
		int sum = 0;
		while(numbers.length()>3) {
			sum += Integer.parseInt(numbers.substring(0,3));
			numbers = numbers.substring(3);
		}
		sum += Integer.parseInt(numbers);
		System.out.println(sum);
		
	}

}
