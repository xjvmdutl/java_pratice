package java_project;

public class ch03 {

	public static void main(String[] args) {
		//ex01)���������: ��Ģ����(+,-,*,/,%), ���Կ���(+=,-=,*=,/=,%=) => ����1 = ����1(+,-,*,/,%)����2
		//���� ������
		/*
			int add = 12 + 21;//����
			int sub = 41 - 22;//����
			int mul = 2 * 8;//����
			int div = 3 / 2;//������
			int mod = 34 % 5;//������
			System.out.println(add);
			System.out.println(sub);
			System.out.println(mul);
			System.out.println(div);
			System.out.println(mod);
		*/
		//ex02) ���Կ�����
		/*
			int a = 3;
			int b = 7;
			int d = 6;
			double c = 1.0;
			a+=1;//4
			b+=a;//11
			c-=b;//-10.0
			d/=2;//3
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		*/
		//ex03) ���� ������ 
		/*
			int a = 1;
			System.out.println(a++);//����� ���� 1
			System.out.println(a++);//����� ���� 2
			System.out.println(a); //3
			
			System.out.println(++a);//���� �� ��� 4
			System.out.println(++a);//���� �� ��� 5
			System.out.println(--a);//���� �� ��� 4
			System.out.println(a);// 4
		*/
		//ex04 ) ���������� ��ȭ : int y = a++; ��� y�� a �� ������ a���� ���� ��Ų��.
		/*
			int x = 2;
			int y = x++;//2
			int z = ++x;//4
			System.out.println(y);
			System.out.println(z);
		*/
		//pb01) ��°�� ����
		/* 
			int a = 1; 
			int b = 2;
			int c = 3;
			a +=b;//3
			b +=c;//5
			c++;//4
			c++;//5
			System.out.println(a);//3
			System.out.println(b);//5
			System.out.println(c);//5
		*/
		//pb02) 3   5   11 ���
		/*
			int a= 2;
			int b= 5;
			System.out.println(++a);//3
			a++;//4
			b++;//6
			System.out.println(++a);//5
			b+=a;
			System.out.println(b);
		*/
		//ex05 ) ������ �켱���� 1.��ȣ,�Ҽ��� 2. ���� 3.��,����,������ 4.����Ʈ ������ 5. �񱳿����� 6.�׵� �� ������ 7.��Ʈ �� ������ 8.�� ������ 9.���Կ�����
		/*
			int a = 1;
			int b = 3;
			double c = 4;
			a += b + c;//8.0
			b += b++ + c++;//10.0
			int d = a * (a+b / 2);//104
			System.out.println(a);//8.0
			System.out.println(b);//10.0
			System.out.println(c);//5.0
			System.out.println(d);//104
		*/
		//pb03 ) ��°�� ����
		/*
			int a = 1;
			int b = 2;
			int c = 3;
			a += b++ +c;//a= 6 b = 3
			b += ++b + c; // 3 += 7 = 10
			c += c++ + ++c;//11
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		*/
		//pb 04 ) ��� ��� ����
		/*
			int a = 1;
			System.out.println(a++);//1
			System.out.println(a + (++a));//5
			System.out.println(a++ + ++a * a);//28 ?? �� �׷��� �� 3 + 5 * 5
		*/
		//pb 05) ��� ��� ���� ��ĭ ä��� //14
		/*
			int a = 1;
			//System.out.println(A + B);
			System.out.println((++a * ++a) + (++a + a));//((2 * 3) + (4 + 4))
		*/
		//pb 06) ���� a, b,c���� �� ��¹� ����
		/*
			int a = 1;
			int b = 3;
			int c = 5;
			System.out.println(a-a);//0
			System.out.println(a * b % c);//3
			System.out.println(++a * a + b);//7
			System.out.println(a++ * ++a);//8
			System.out.println(a * b++ - b);//8 a = 4 ,b = 4 
			System.out.println(--c - c  * ++c);//-16, c=5
			System.out.println(a * (++a * 5 % (c++)));//0 ,a=5 c= 6
			System.out.println((a++) + ++a * a);// 5 + 7 * 7 // 54 
		*/
		//pb 07) ��� ���
		int a = 1; 
		int b = 2;
		a += b +=3;//a = 6, b=5
		System.out.printf("%d %d \n",a,b);
		
		a *= a++ - (a++)  * b;//6 * 6 - 7 * 5
		System.out.println(a+b);//-174+5
	}

}

