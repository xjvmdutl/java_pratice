package java_project;

public class ch03 {

	public static void main(String[] args) {
		//ex01)산술연산자: 사칙연산(+,-,*,/,%), 대입연산(+=,-=,*=,/=,%=) => 변수1 = 변수1(+,-,*,/,%)변수2
		//이항 연산자
		/*
			int add = 12 + 21;//덧셈
			int sub = 41 - 22;//뺄셈
			int mul = 2 * 8;//곱셈
			int div = 3 / 2;//나누기
			int mod = 34 % 5;//나머지
			System.out.println(add);
			System.out.println(sub);
			System.out.println(mul);
			System.out.println(div);
			System.out.println(mod);
		*/
		//ex02) 대입연산자
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
		//ex03) 증감 연산자 
		/*
			int a = 1;
			System.out.println(a++);//출력후 증가 1
			System.out.println(a++);//출력후 증가 2
			System.out.println(a); //3
			
			System.out.println(++a);//증가 후 출력 4
			System.out.println(++a);//증가 후 출력 5
			System.out.println(--a);//감소 후 출력 4
			System.out.println(a);// 4
		*/
		//ex04 ) 증감연산자 심화 : int y = a++; 경우 y에 a 를 대입후 a값을 증가 시킨다.
		/*
			int x = 2;
			int y = x++;//2
			int z = ++x;//4
			System.out.println(y);
			System.out.println(z);
		*/
		//pb01) 출력결과 적기
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
		//pb02) 3   5   11 출력
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
		//ex05 ) 연산자 우선순위 1.괄호,소수점 2. 증감 3.곱,나눗,나머지 4.시프트 연산자 5. 비교연산자 6.항등 비교 연산자 7.비트 논리 연산자 8.논리 연산자 9.대입연산자
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
		//
	}

}

