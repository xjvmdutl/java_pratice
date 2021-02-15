package java_project;

public class ch02 {

	public static void main(String[] args) {
		//ex01 변수의 선언 : 자료형 변수명 = 값
		int a = 5; 
		float b = 8;//실수니까 소수점 자동 표현
		System.out.println(a);
		System.out.println(b);
		//ex02 에러 찾기
		//int a = 1.0; //error : 정수형에 1.0 저장x
		//int a = 10502931582301; //error : int가 저장할수 있는 메모리 초과
		//long a = 105202931582301;//error : long에 int가 저장할수 있는 메모리의 크기가 넘는 수를 할당하려면 마지막에 L 붙혀야한다.
		//float pi = 3.14; //error : float는 값을 할당할때 F를 붙여주어야 한다.
		//ex 03) printf 함수는 변수들을 출력형식에 맞춰서 출력하기 위해 사용하는 함수,
		//		 큰따움표 안 변수를 출력할 위치에 변수 대신 %d(정수형), %f(실수형), %s(문자열) , %c(문자형) 을 적고 따옴표가 끝난후 출력형식의 순서에 맞춰 넣고자 하는 변수명을 적는다.
		int aa = 10;
		long b1 = 20;
		long b2 = 1000000000000L;
		float c = 1.23F;
		double d = 5.4321;
		System.out.printf("정수 : %d, %d \n",aa,b1);
		System.out.printf("큰 정수 : %d \n",b2);
		System.out.printf("실수 : %f, %f \n",c,d);
		//ex 04) 변수를 출력할 떄에는 + 연습
		//출력형식을 활용 : %자리수d, %자리수.나타낼소수점수f ex)(%3d,1)은 1을 세자리에 맞춰서 출력 '   1', (%6,2f, 14.12345)는 14.12
		

	}

}
