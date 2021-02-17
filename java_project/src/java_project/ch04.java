package java_project;

public class ch04 {

	public static void main(String[] args) {
		//하나의 문자값 char , 아스키 코드 a = 97, z =122 , A = 64 , Z = 90
		//ex01) a~z = 97~122 ,A~Z = 65~90
		/*
			char a = 'A';
			char b = 66;//B 
			char x = 'x';
			char z = 122;
			System.out.printf("%s %s \n",a,b);
			System.out.printf("%s %s",x,z);
		*/
		//ex02 ) 아스키 코드를 활용하여 대소문자,문자의 대소 비교가능하다.
		//문자를 아스키 코드로 바꾸고 싶을시 형변환을 한다.
		/*
			char A = 'A';
			//char a = (int)A + 32;//에러  정수인지 실수인지 아스키코드인지 헷갈린다. 
			char a = (char)((int)A + 32);
			char b = 65 + 33;
			System.out.printf("%s %d \n",A,(int)A);
			System.out.printf("%s %d \n",a,(int)a);
			System.out.printf("%s %d \n",b,(int)b);
		*/
		//PB01 ) 1.문자열 변수 x = 'k' 저장, 문자형 변수  y 에 'g' 저장
		//		 두변수 x,y 아스키 코드 값 출력
		/*
			char x = 'k';
			char y = 'g';
			System.out.printf("%d\n",(int)x);
			System.out.printf("%d",(int)y);
		*/
		//pb02 ) x ='a', y ='b', z = 'c' ,w
		char x ='a';//97
		char y ='b';//98
		char z ='c';//99
	
	}
}
