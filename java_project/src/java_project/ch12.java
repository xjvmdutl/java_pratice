package java_project;

import java.util.Scanner;

public class ch12 {

	public static void main(String[] args) {
		//���ǹ� switch : switch(����) { case �Է� ��:~~ break; default : .... break;}
		//ex01)�Էº��� ���� ���� �ڵ带 ����
		/*
			int value = 2;
			switch(value) {
			case 1: 
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("�� �� ����");
			}
		*/
		//ex02) break�� ���� ����� �ϳ��� ���ǹ��� ���� ���´�. break�� ������ break�� ���������� �� �ڵ带 ��� ����
		/*
			int value = 1;
			switch(value) {
			case 1: 
				System.out.println("1");			
			case 2:
				System.out.println("2");
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("�� �� ����");
			}
		 */
		//pb01) if-else �� switch������ ����
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num = sc.nextInt();
//		
//			if(num % 3 == 0) {
//				System.out.println(num+3);
//			}else {
//				System.out.println(num%3);
//			}
//	
		switch(num%3) {
		case 0:
			System.out.println(num+3);
			break;
		default:
			System.out.println(num%3);
		}
		*/
		//pb02) ��°�� ����
		/*
			char value = 'A';
			switch(value) {
			case 'a':System.out.println("1");
			case 'A':System.out.println("2");
			case 'B':System.out.println("3");
			default:System.out.println("4");
			}
		*/
		//234���
	}

}
