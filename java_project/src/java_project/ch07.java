package java_project;

public class ch07 {

	public static void main(String[] args) {
		//�� �ڷ��� : boolean  1. �񱳿����� :==,>,< 2.�� ������ : && || !
		//ex01)Boolean �� ���� ���
		/*
			boolean A = true;
			boolean B = false;
			boolean C = 1 ==2;
			System.out.printf("%s %s %s ",A,B,C);
		 */
		//ex02) �� ������ ����
		/*
			boolean boolean_1 = 1 > 2;
			boolean boolean_2 = 3 == 3;
			boolean boolean_3 = 1 >= 1;
			boolean boolean_4 = 4 != 2;
			
			System.out.println(boolean_1);
			System.out.println(boolean_2);
			System.out.println(boolean_3);
			System.out.println(boolean_4);
		*/
		//ex03) �������� ���� 
		/*
			boolean boolean_1 = true && true;
			boolean boolean_2 = true && false;
			boolean boolean_3 = false | false;
			boolean boolean_4 = true | false;
			boolean boolean_5 = true ^ true;
			boolean boolean_6 = true ^ false;
			boolean boolean_7 = false ^ false;
			System.out.println(boolean_1);
			System.out.println(boolean_2);
			System.out.println(boolean_3);
			System.out.println(boolean_4);
			System.out.println(boolean_5);
			System.out.println(boolean_6);
			System.out.println(boolean_7);
		*/
		//ex04) �� �ڷ��� Ȱ�� 
		//num�� ����� ���� 1~100�ϰ�� true �ƴҰ�� false
		/*
			int num = 13;
			System.out.printf("1�ʰ� 100 �̸��ΰ�? %s",num>1 && num <100);
		*/
		//pb01) ��°�� ����
		/*
			boolean boolean_1 = false;
			boolean boolean_2 = !true;
			//boolean boolean_3 != true;//error : boolean �� ���� ���ǵ��� �ʾҴµ� ��x
			boolean boolean_4 = true == true;
			boolean boolean_5 = true == false;
			//boolean boolean_6 = true > true;//error : ���ڷ������� ũ���x
			//boolean boolean_7 = true > false;//error : ���ڷ������� ũ���x
			//boolean boolean_8 = false > true;//error : ���ڷ������� ũ���x
			System.out.println(boolean_1);//false
			System.out.println(boolean_2);//false
			System.out.println(boolean_4);//true
			System.out.println(boolean_5);//false
		*/
		//pb02 ) �� ������(<,==,<=,!=) �� ��� ���� �ּ� 1�� �� ����Ͽ� ��¹� �ϳ��� true ����ϴ� ���� ���
		/*
		 * System.out.println((4>3) == (5<=5) == (2!=3)); System.out.println((3<2 ==
		 * 1<=2) != true);
		 */
		//ex04) ��¹����� : �Ķ���ͷ� ���;� �ȴ� ��Ģ(���ڴ� �״��,���ڿ� ū����ǥ,"1"�� ���ڿ�(1�� ����),Ÿ�Կ� ���� ���� ��� �޶���, ������ ����ҋ��� �������or+����
		/*
			System.out.println(2020);//2020
			System.out.println(20+20);//40
			System.out.println("20"+"20");//2020
			System.out.println(4*4);//16
			System.out.println("HelloWorld");//HelloWorld
			System.out.println(true);//true
			System.out.printf("%d %d\n",3,5);//3 5
		*/
		//pb03) String Ÿ�� ���� name �� �ڽ��� �̸��� �����ϰ� ���� name�� �̿��ؼ� �ڽ��� �̸� ���
		/*
		 * String name = "����ȣ"; System.out.println("�� �̸��� "+name + "�Դϴ�");
		 */
		//pb04) ��°�� ����
		/*
			System.out.println(1+2);//3
			System.out.println("1"+"2");//12
			System.out.println(true + " or false");//true or false
			System.out.println('1'+'2');//99 : �ƽ�Ű �ڵ尪�� ����
			System.out.println('1'+2);//51
			System.out.println('J'+"ava");//JAVA
			System.out.println(123+"456"+789);//123456789
			//System.out.println(boolean);//���� �ڷ����� ������ ����
			//System.out.println('true'+'false');//���� ''���� �Ѱ��� ���ڸ� ��
			//System.out.println('true' && 'false');//���� ''���� �Ѱ��� ���ڸ� ��
		*/
		 
		//pb05) ������ ��� ����
		/*
			System.out.println(true && false);//false
			System.out.println(true ^ (true | false));//false
			System.out.println((true | false) | false);//true
			System.out.println((true ^ false) ^ (false ^ false));//true
			System.out.println(true & (false ^ false) ^ true);//true
			System.out.println(false | (false | false) ^ false);//false
		*/
		//pb06) ������ ��� ����
		/*
			System.out.println(3>0 != 2< 1);//true
			//System.out.println(2 != 3 == 3 != 2);//���� : ==������ ���� ��� �� �ڷ����� ���� �� x
			System.out.println((3==1) ^ (4>2) & (1<0));//false ^true & false = false
			System.out.println((1!=1)|(3>0 & 5<1));//false | true & false = false
			System.out.println(2<=3 ^ 5 != 1 ^ 3 ==3);//true ^ ture ^ true = ture
		*/
		//pb07) �� ������ &&,|,^�� ��� �ּ� �ѹ��� ����Ͽ� true�� ���
		//System.out.println(true && true | false ^ false);
		//pb08) num ������ �����Ͽ� num�� 0������ �����ϴ� ���α׷� �ۼ�, 3�� ����
		//int num = 13;
		//System.out.printf("�� ���� %d�� 0�ΰ�?: %s" , num,num == 0);
		//pb09) num �� 2�Ǵ� 3�� ������� �Ǻ��ϴ� ���α׷� �ۼ� 2�Ǵ� 3��� = true ,�ƴҰ�� false,���α׷� 3�� ����
		/*
		 * int num = 23; System.out.printf("�� ���� %d�� 2�Ǵ� 3�� ����ΰ�?: %s\n", num, num % 2
		 * == 0 || num % 3 == 0);
		 */
		
	}

}
