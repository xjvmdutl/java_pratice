package java_project;

public class ch05 {

	public static void main(String[] args) {
		//String 문자열 : 문자열은 인덱스 지원하며,인덱스를 활용한 슬라이싱 지원(substring 메소드)
		//또한 특정 인덱스를 알기위한 indexOf()함수, 문자열 값 바꾸는replace(), 소문자를 대문자로 바꾸기 위한 toUpperCase()메소드 지원
		//ex01) 문자열 선언 String 변수명 = "값"
		/*
			String str1 = "ABCDE";
			String str2 = "FGH";
			String str3 = str1 + str2;//ABCDEFGH
			System.out.println(str1 + str2);
			System.out.println(str3);
		*/
		//ex02) int indexOf(char ch) : 현재 문자열 객체에서 ch가 첫번쨰로 발견되는 위치 인덱스 얻는다. 없을시 -1
		//		int indexOf(String str) : 현재 문자열 객체에서 str을 찾아서 첫번째 문자의 인덱스 반환 없을시 -1
		//		char charAt(int index) : 현재 문자열 객체 index 위치의 문자값 하나를 얻는다.
		/*
			String str = "ABCDE";
			System.out.println(str.indexOf('A'));//0
			System.out.println(str.indexOf("CD"));//2
			System.out.println(str.charAt(4));//E
		*/
		//ex03) 인덱스를 활용하여 부분 문자열 추출 : String substring(int start):현재 문자열 객체start위치부터 끝까지 문자열 추출
		//		String substring(int start,int end) : 현재 문자열 객체 start부터 end직전까지 문자열 추출
		/*
			String str = "ABCDEFGH";
			System.out.println(str.substring(3));//DEFGH
			System.out.println(str.substring(1,3));//BC
			System.out.println(str.substring(2,2));//
		*/
		//ex04) Boolean startWith(String str) : 문자열이 str로 시작하는지 판단 같으면 true,아니면 fasle
		//		Boolean endWith(String str) : 문자열이 str로 끝나는지 판단 같으면 true,아니면 fasle
		//		int length() : 문자열길이 반환
		//		String replace(String str1,String str2) : 문자열에 있는 str1을 문자열 str2로 변경
		//		String concat(String str) : 문자열을 결합
		/*
			String str = "aBCd EFgH";
			System.out.println(str.startsWith("A"));//flase
			System.out.println(str.length());//9
			System.out.println(str.replace("BC","KK"));//aKKd EFgH
			System.out.println(str.toLowerCase());//abcd efgh
			System.out.println(str.concat("34"));//aBCd EFgH34
		*/
		//pb01) Korea를 출력하는 프로그램
		/*
			String str = "Korea";
			System.out.println(str);
		*/
		//pb02) 출력 결과 적기
		/*
			String A = "NOVEMBER";
			String B = "MAY";
			System.out.println(A.indexOf('M'));//4
			System.out.println(A.indexOf('E'));//3
			System.out.println(A.substring(2,5));//VEM
			System.out.println(A.charAt(1));//O
			System.out.println(B.endsWith("y"));//false
			System.out.println(B.toLowerCase());//may
			System.out.println(A+B);//NOVEMBERMAY
		*/
		//pb03) 3개의 문자열 변수 str1,str2,str3선언 , 문자열에는 Julio,Abraham,DoDo 저장,
		//		세이름의 가장 앞글자를 이어 붙여서 출력
		/*
			String str1 = "Julio";
			String str2 = "Abraham";
			String str3 = "DoDo";
			System.out.println(str1.charAt(0)+str2.substring(0,1)+str3.charAt(0));
		*/
		//ex05) 이스케이프 코드 : 프로그래밍 할때 사용할수 있게 저장된 문자열
		//		\n : 줄바꿈 , \' : 작은따옴표 출력, \" : 큰 따옴표 출력 , \\ : 역슬래시 출력 , \t : 탭만큼 띄우기
		/*
			String text_1 = "문자열에서 \n을 쓰면 줄바꿈이 되고 \t를 사용하면 탭 공백이 넣어진다.";
			String text_2 = "문자열에서 \'와 \"는 따옴표를 쓰게 만들어 준다.";
			String text_3 = "역슬래시를 쓰고 싶으면 \\";
			System.out.println(text_1);
			System.out.println(text_2);
			System.out.println(text_3);
		*/
		//ex06) 너무 긴 문자열은 + 연산으로 여러줄에 걸쳐서 선언 가능
		/*
			String text = "Hello " 
					+"My name is "
					+"Q";
			System.out.println(text);
		*/
		//pb04)출력결과 만들기
		/*
			String str1= "지나간 것은 \n"
					+"지나간 대로\n"
					+"그런의미가 있죠.";
			System.out.println(str1);
		*/
		
		//pb05) 출력 결과 적기
		/*
			String str1 = "A\nB\tC\tD\n\n";
			String str2 = "EFG\n\"H\"";
			System.out.println(str1);
								  */ /*A
									   B	C	D
									   
									   
			 						 */
			/*
			System.out.println(str2);
								*/ 	 /*EFG
									   "H"
			 						 */
		//pb06) 빈칸 채우기
			String name = "Ronaldo";
			String nation = "Portugal";
			int age = 33;
			int height = 185;
			System.out.printf("My name is %s, and I\'M from %s\n",name,nation);
			System.out.printf("I\'M %d years old and %d cm tall",age,height);
		}

}
