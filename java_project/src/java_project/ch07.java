package java_project;

public class ch07 {

	public static void main(String[] args) {
		//논리 자료형 : boolean  1. 비교연산자 :==,>,< 2.논리 연산자 : && || !
		//ex01)Boolean 형 선언 방식
		/*
			boolean A = true;
			boolean B = false;
			boolean C = 1 ==2;
			System.out.printf("%s %s %s ",A,B,C);
		 */
		//ex02) 비교 연산자 실행
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
		//ex03) 논리연산자 실행 
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
		//ex04) 논리 자료형 활용 
		//num에 저장된 값이 1~100일경우 true 아닐경우 false
		/*
			int num = 13;
			System.out.printf("1초과 100 미만인가? %s",num>1 && num <100);
		*/
		//pb01) 출력결과 적기
		/*
			boolean boolean_1 = false;
			boolean boolean_2 = !true;
			//boolean boolean_3 != true;//error : boolean 형 값이 정의되지 않았는데 비교x
			boolean boolean_4 = true == true;
			boolean boolean_5 = true == false;
			//boolean boolean_6 = true > true;//error : 비교자료형끼리 크기비교x
			//boolean boolean_7 = true > false;//error : 비교자료형끼리 크기비교x
			//boolean boolean_8 = false > true;//error : 비교자료형끼리 크기비교x
			System.out.println(boolean_1);//false
			System.out.println(boolean_2);//false
			System.out.println(boolean_4);//true
			System.out.println(boolean_5);//false
		*/
		//pb02 ) 논리 연산자(<,==,<=,!=) 를 모두 각각 최소 1번 씩 사용하여 출력문 하나로 true 출력하는 문장 출력
		/*
		 * System.out.println((4>3) == (5<=5) == (2!=3)); System.out.println((3<2 ==
		 * 1<=2) != true);
		 */
		//ex04) 출력문정리 : 파라미터로 들어와야 된는 규칙(숫자는 그대로,문자열 큰따옴표,"1"은 문자열(1은 숫자),타입에 따라 연산 방법 달라짐, 변수를 출력할떄는 출력형식or+연산
		/*
			System.out.println(2020);//2020
			System.out.println(20+20);//40
			System.out.println("20"+"20");//2020
			System.out.println(4*4);//16
			System.out.println("HelloWorld");//HelloWorld
			System.out.println(true);//true
			System.out.printf("%d %d\n",3,5);//3 5
		*/
		//pb03) String 타입 변수 name 에 자신을 이름을 대입하고 변수 name을 이용해서 자신을 이름 출력
		/*
		 * String name = "김준호"; System.out.println("제 이름은 "+name + "입니다");
		 */
		//pb04) 출력결과 적기
		/*
			System.out.println(1+2);//3
			System.out.println("1"+"2");//12
			System.out.println(true + " or false");//true or false
			System.out.println('1'+'2');//99 : 아스키 코드값을 덧셈
			System.out.println('1'+2);//51
			System.out.println('J'+"ava");//JAVA
			System.out.println(123+"456"+789);//123456789
			//System.out.println(boolean);//에러 자료형을 넣을순 없다
			//System.out.println('true'+'false');//에러 ''에는 한가지 문자만 들어감
			//System.out.println('true' && 'false');//에러 ''에는 한가지 문자만 들어감
		*/
		 
		//pb05) 논리연산 결과 적기
		/*
			System.out.println(true && false);//false
			System.out.println(true ^ (true | false));//false
			System.out.println((true | false) | false);//true
			System.out.println((true ^ false) ^ (false ^ false));//true
			System.out.println(true & (false ^ false) ^ true);//true
			System.out.println(false | (false | false) ^ false);//false
		*/
		//pb06) 논리연산 결과 적기
		/*
			System.out.println(3>0 != 2< 1);//true
			//System.out.println(2 != 3 == 3 != 2);//에러 : ==연산자 같은 경우 논리 자료형과 숫자 비교 x
			System.out.println((3==1) ^ (4>2) & (1<0));//false ^true & false = false
			System.out.println((1!=1)|(3>0 & 5<1));//false | true & false = false
			System.out.println(2<=3 ^ 5 != 1 ^ 3 ==3);//true ^ ture ^ true = ture
		*/
		//pb07) 논리 연산자 &&,|,^를 모두 최소 한번만 사용하여 true를 출력
		//System.out.println(true && true | false ^ false);
		//pb08) num 변수를 선언하여 num이 0인지를 판정하는 프로그램 작성, 3줄 이하
		//int num = 13;
		//System.out.printf("이 변수 %d는 0인가?: %s" , num,num == 0);
		//pb09) num 이 2또는 3의 배수인지 판별하는 프로그램 작성 2또는 3배수 = true ,아닐경우 false,프로그램 3줄 이하
		/*
		 * int num = 23; System.out.printf("이 변수 %d는 2또는 3의 배수인가?: %s\n", num, num % 2
		 * == 0 || num % 3 == 0);
		 */
		
	}

}
