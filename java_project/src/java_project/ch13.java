package java_project;

import java.util.Scanner;

public class ch13 {

	public static void main(String[] args) {
		//�ݺ� while��  while(���ǹ�) {  ������ ���� }
		//do while�� do { ������ ���� } while(���ǹ�) = �ݵ�� �ѹ��� �����Ѵ�.
		//ex01) �ݺ����� ���ѷ����� ������ �ʵ��� ���������� ��Ȯ�� �����ϴ°��� �߿�.
		/*
			int num=5;
			System.out.println("Count Down Starts");
			while(num>=0) {
				System.out.print(num + " ");
				num--;
			}
			System.out.println("Boom!");
		*/
		//ex02) break  = ���ǿ� ������� �ݺ��� ������ ���������� countinue�� �ڿ� �ڵ带 �������� �ʰ� ���ǹ����� ���ư���.
		/*
			int i = 1;
			while(true) {
				i++;
				if(i>=3 && i<=5) {
					 continue;
				}
				System.out.printf("%d ���� ....\n",i);
				if(i==7) {
					break;
				}
			}
		*/
		//ex03) dowhile�� ó�� ������ ���ǹ� ������� �ݵ�� �ѹ� ����
		/*
			int i = 1;
			while(i <=0) {
				System.out.println(i);
			}
			do {
				System.out.println(i);
			}while(i <= 0);
		*/
		//pb01) ��ĭ ä���
		/*
			int i = 2;
			while(i<=20) {//2 4 8 16
				System.out.printf("%d ",i);
				//��ĭ
				i*=2;
			}
		*/
		//pb02) ��ĭ ä���
		/*
			int i =1;
			while(i<=5){//��ĭ
				System.out.printf("%d ",i*3 );//��ĭ
				i++;
			}
			//3 6 9 12 15
		*/
		//pb03)��� ��� ����
		/*
			int num = 1;
			do {
				if(num >= 100) {
					System.out.println(100);
					break;
				}
				num*=2;
				System.out.print(num++ + " ");
			}while(num>=2);
			//2 6 14 30 62 126 100
		*/
		//pb04) while�� Ȱ�� ������ q�� �Էµɶ����� �ݺ�
		/*
			Scanner sc = new Scanner(System.in);
			String str = "";
			while(!str.equals("q")) {
				System.out.print("Enter the alphabet : ");
				str = sc.next();
			}
			System.out.println("Finish");
		*/
		//pb05) while���� Ȱ���Ͽ� �μ��� �Է¹޾� ���������� ũ������ 5�� ��� ������� ���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("first Num : ");
			int num1 = sc.nextInt();
			System.out.print("second Num : ");
			int num2 = sc.nextInt();
			if(num1 > num2) {
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
			num1 = (5*(num1/5+1));
			while(num1 < num2) {
				System.out.println(num1);
				num1+=5;
			}
		*/
		
	}

}
