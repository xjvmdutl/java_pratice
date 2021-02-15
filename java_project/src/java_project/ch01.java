package java_project;

public class ch01 {

	public static void main(String[] args) {
		//ex01)System.out.println 사용법 익히기 
		System.out.print("abc");//주석
		System.out.print("de"+"fg");//문자열 더하기
		System.out.println(34);//숫자 출력
		System.out.print(10+21);//숫자합
		//ex02)에러 찾기
		System.out.println('A'+5);//System.out.println(5+A);//문자와 숫자 더할수 없다.//문자 +숫자 = 아스키 코드 합
		//System.out.println(Hello);//큰따움표 사용 x
		//System.out.println(3+"412");//문자와 수를 더할수 없음 수를 큰따움표 감싸면 문자가된다.
		//ex03)\n (줄바꿈) ,  + (문자열 더하기) 연산을 활용
		System.out.println("Hello!\n"
				+ "My name is BitCoding\n"
				+"Nice to meet You");
		//pb01) 123456890을 두번 출력하는 프로그램 작성 단) 출력문 2개사용하고 각각의 출력문은 문자열과 정수 출력
		System.out.println("1234567"+"890");
		System.out.print(1234567890);
		//pb02) 제 이름은 xxx 출력
		String name = "김준호";
		System.out.println("제 이름은 "+name + "입니다");
		
		//pb03)오답
		System.out.println(16230);//o
		//System.out.println(abc);// error ""없음
		System.out.println(13 - 2.0);//11.0 //int - double = double 
		System.out.println(12 + 4 / 2 + 1);//15
		System.out.println("A"+"B"+"C");//ABC
		//System.out.println("A" - "B");//error 문자열 - 불가능
		System.out.println("A"+'B');//AB 
		//System.out.println(52-"33");//error문자열 뺴기 불가능
		//pb04)출력결과 적기
		System.out.println("CA\n"+"AC");/*CA
										AC*/
		System.out.println(35+4.0);//39.0
		System.out.println(5);//6
		/*pb05)"파이썬도 배우고
		*		자바도 배우면
		*		난 천재인가!" 하나의 출력문으로 출력
		*/
		System.out.print("파이썬도 배우고 \n자바도 배우면 \n난 천재인가!");
		/*pb06) 33Ad1
		*		33Ad1 를 출력하는 출력문을 구현
		*/				
		System.out.println("33Ad1");
		System.out.print("33Ad1");

	}

}
