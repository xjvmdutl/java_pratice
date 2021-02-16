package java_project;

public class ch02 {

	public static void main(String[] args) {
		//ex01 변수의 선언 : 자료형 변수명 = 값
		/*
			int a = 5; 
			float b = 8;//실수니까 소수점 자동 표현
			System.out.println(a);
			System.out.println(b);
		*/
		//ex02 에러 찾기
		//int a = 1.0; //error : 정수형에 1.0 저장x
		//int a = 10502931582301; //error : int가 저장할수 있는 메모리 초과
		//long a = 105202931582301;//error : long에 int가 저장할수 있는 메모리의 크기가 넘는 수를 할당하려면 마지막에 L 붙혀야한다.
		//float pi = 3.14; //error : float는 값을 할당할때 F를 붙여주어야 한다.
		//ex 03) printf 함수는 변수들을 출력형식에 맞춰서 출력하기 위해 사용하는 함수,
		//		 큰따움표 안 변수를 출력할 위치에 변수 대신 %d(정수형), %f(실수형), %s(문자열) , %c(문자형) 을 적고 따옴표가 끝난후 출력형식의 순서에 맞춰 넣고자 하는 변수명을 적는다.
		/*
			int aa = 10;
			long b1 = 20;
			long b2 = 1000000000000L;
			float c = 1.23F;
			double d = 5.4321;
			System.out.printf("정수 : %d, %d \n",aa,b1);
			System.out.printf("큰 정수 : %d \n",b2);
			System.out.printf("실수 : %f, %f \n",c,d);
		*/
		//ex 04) 변수를 출력할 떄에는 + 연습
		//출력형식을 활용 : %자리수d, %자리수.나타낼소수점수f ex)(%3d,1)은 1을 세자리에 맞춰서 출력 '   1', (%6,2f, 14.12345)는 14.12
		//왼쪽/오른쪽 정렬 : 왼쪽정렬 -기호를 붙여주어야 한다. ex) (%-3d,1)은 '1   '
		/*
			int age =20;
			int height = 180;
			float a1 = 20F;
			double b0 = 1.623;
			int c1 = 34;
			System.out.println("나이는 "+age +" 키는 " + height);
			System.out.printf("나이는 %d 키는 %d\n",age,height);
			System.out.printf("%4d\n",c1);
			System.out.printf("%6.2f\n",a1);
			System.out.printf("%-6.2f\n",b0);
		*/
		//ex5) 숫자 자료형은 기본적 사칙연산 가능
		/*
			int a = 1;
			int b = 2;
			float c = 1.5F;
			double d = 2.5;
			System.out.println(a+b);//덧샘
			System.out.println(a*c);//곱셈
			System.out.println(b-c);//뺼셈
			System.out.println(b%a);//나머지
			System.out.println(b/a);//몫
			System.out.println(d%b);//나머지
			System.out.println(d/b);//몫
		*/
		//ex6) 변수 선언시 다른 변수들의 연산 결과 저장
		/*
			int a = 3; int b = 5;
			double c =4;
			int d = a+b;
			//int e = c+a;//불가능
			double f = c+d;
			System.out.println(d);
			System.out.println(f);
		*/
		//pb01) 변수 x에 정수 5 저장 변수 y 정수 10저장, 정수형 변수 Z를 X,Y합으로 저장, Z의 값 출력
		/*
			int x = 5;
			int y = 10;
			int z = x+y;
			System.out.println(z);
		*/
		//pb02) 정수형 변수 A에 2저장, B에 3저장, 변수는 A,B 두개만 선언, 변수재선언x , print문 안에 변수 A,B모두사용 , 10을 출력
		/*
			int a = 2;
			int b = 3;
			System.out.printf("%d",(a+b)*2);
		*/
		//Math.round()메소드 : 실수 -> 정수로 변환 
		/*
		 	float a = 1.0f;
		 	System.out.println(a);
		 	System.out.println(Math.round(a));
		 	System.out.println((int)a);//강제 형변환
		 */
		//pb03) 월요~~토 자신이 사용한 용돈을 저장했다. 출력 결과 적기
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
		//pb04) 다음과 같이 x,y,z선언 콘솔착 출력 결과를 적기
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
		//pb05)) 1,2,3 세가지를 저장하는 변수 3개선언 (재선언x), print(10)과 같이 직접 숫자 출력 x, print문에 각가 최소 두개변수를 사용
		/*
			int a = 1;
			int b = 2;
			int c = 3;
			System.out.println((b+c)*b);//10
			System.out.println(((b+c)*b) * ((b+c)*b));//100
			System.out.println(((b+c)*b) * ((b+c)*b) * ((b+c)*b));//1000
		*/
		//pb06) 출력결과 적기
		/*
			int a = 3;
			int b = 5;
			int c = 7;
			a = b = c;
			System.out.println(a);//7
			System.out.println(b);//7
			System.out.println(c);//7
		*/
		//pb07) 출력결과 적기
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
