package java_project;

public class ch02 {

	public static void main(String[] args) {
		//ex01 ������ ���� : �ڷ��� ������ = ��
		/*
			int a = 5; 
			float b = 8;//�Ǽ��ϱ� �Ҽ��� �ڵ� ǥ��
			System.out.println(a);
			System.out.println(b);
		*/
		//ex02 ���� ã��
		//int a = 1.0; //error : �������� 1.0 ����x
		//int a = 10502931582301; //error : int�� �����Ҽ� �ִ� �޸� �ʰ�
		//long a = 105202931582301;//error : long�� int�� �����Ҽ� �ִ� �޸��� ũ�Ⱑ �Ѵ� ���� �Ҵ��Ϸ��� �������� L �������Ѵ�.
		//float pi = 3.14; //error : float�� ���� �Ҵ��Ҷ� F�� �ٿ��־�� �Ѵ�.
		//ex 03) printf �Լ��� �������� ������Ŀ� ���缭 ����ϱ� ���� ����ϴ� �Լ�,
		//		 ū����ǥ �� ������ ����� ��ġ�� ���� ��� %d(������), %f(�Ǽ���), %s(���ڿ�) , %c(������) �� ���� ����ǥ�� ������ ��������� ������ ���� �ְ��� �ϴ� �������� ���´�.
		/*
			int aa = 10;
			long b1 = 20;
			long b2 = 1000000000000L;
			float c = 1.23F;
			double d = 5.4321;
			System.out.printf("���� : %d, %d \n",aa,b1);
			System.out.printf("ū ���� : %d \n",b2);
			System.out.printf("�Ǽ� : %f, %f \n",c,d);
		*/
		//ex 04) ������ ����� ������ + ����
		//��������� Ȱ�� : %�ڸ���d, %�ڸ���.��Ÿ���Ҽ�����f ex)(%3d,1)�� 1�� ���ڸ��� ���缭 ��� '   1', (%6,2f, 14.12345)�� 14.12
		//����/������ ���� : �������� -��ȣ�� �ٿ��־�� �Ѵ�. ex) (%-3d,1)�� '1   '
		/*
			int age =20;
			int height = 180;
			float a1 = 20F;
			double b0 = 1.623;
			int c1 = 34;
			System.out.println("���̴� "+age +" Ű�� " + height);
			System.out.printf("���̴� %d Ű�� %d\n",age,height);
			System.out.printf("%4d\n",c1);
			System.out.printf("%6.2f\n",a1);
			System.out.printf("%-6.2f\n",b0);
		*/
		//ex5) ���� �ڷ����� �⺻�� ��Ģ���� ����
		/*
			int a = 1;
			int b = 2;
			float c = 1.5F;
			double d = 2.5;
			System.out.println(a+b);//����
			System.out.println(a*c);//����
			System.out.println(b-c);//�E��
			System.out.println(b%a);//������
			System.out.println(b/a);//��
			System.out.println(d%b);//������
			System.out.println(d/b);//��
		*/
		//ex6) ���� ����� �ٸ� �������� ���� ��� ����
		/*
			int a = 3; int b = 5;
			double c =4;
			int d = a+b;
			//int e = c+a;//�Ұ���
			double f = c+d;
			System.out.println(d);
			System.out.println(f);
		*/
		//pb01) ���� x�� ���� 5 ���� ���� y ���� 10����, ������ ���� Z�� X,Y������ ����, Z�� �� ���
		/*
			int x = 5;
			int y = 10;
			int z = x+y;
			System.out.println(z);
		*/
		//pb02) ������ ���� A�� 2����, B�� 3����, ������ A,B �ΰ��� ����, �����缱��x , print�� �ȿ� ���� A,B��λ�� , 10�� ���
		/*
			int a = 2;
			int b = 3;
			System.out.printf("%d",(a+b)*2);
		*/
		//Math.round()�޼ҵ� : �Ǽ� -> ������ ��ȯ 
		/*
		 	float a = 1.0f;
		 	System.out.println(a);
		 	System.out.println(Math.round(a));
		 	System.out.println((int)a);//���� ����ȯ
		 */
		//pb03) ����~~�� �ڽ��� ����� �뵷�� �����ߴ�. ��� ��� ����
		/*
			int mon = 10000;
			int tue = 24000;
			int wed = 6000;
			int thu = 4000;
			int fri = 31000;
			int sat = 15000;
			System.out.println(mon);//10000
			System.out.println(wed);//6000
			System.out.println(fri+sat);//21000
			System.out.println(mon*1.0);//10000.0
			System.out.println(wed-tue*1.0);//-18000.0
		*/
		//pb04) ������ ���� x,y,z���� �ܼ��� ��� ����� ����
		/*
			int x = 1;
			int y = 2;
			double z = 1.5;
			System.out.println(x);//1
			System.out.println(x+y);//3
			System.out.println(x+y+z);//4.5
			//System.out.println(2x);//error 2*x
			System.out.println(2*x);//2
			System.out.println(2.0*x);//2.0
			System.out.println(x+1.0);//2.0
			System.out.println(x-1.0);//0.0
			System.out.println(x-1);//0
			System.out.println(z-0.5);//1.0
			//System.out.println(xz);//error x*z
			System.out.println(x*z);//1.5
		*/
		//pb05)) 1,2,3 �������� �����ϴ� ���� 3������ (�缱��x), print(10)�� ���� ���� ���� ��� x, print���� ���� �ּ� �ΰ������� ���
		/*
			int a = 1;
			int b = 2;
			int c = 3;
			System.out.println((b+c)*b);//10
			System.out.println(((b+c)*b) * ((b+c)*b));//100
			System.out.println(((b+c)*b) * ((b+c)*b) * ((b+c)*b));//1000
		*/
		//pb06) ��°�� ����
		/*
			int a = 3;
			int b = 5;
			int c = 7;
			a = b = c;
			System.out.println(a);//7
			System.out.println(b);//7
			System.out.println(c);//7
		*/
		//pb07) ��°�� ����
		/*
			int a = 3;
			int b = 5;
			double c = 7;
			b = b+1;//6
			a = a+b;//9
			c = c+1+a;//17.0
			System.out.println(a);//9
			System.out.println(b);//6
			System.out.println(c);//17.0
		*/
	}

}
