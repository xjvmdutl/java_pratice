package java_project;

public class ch08 {

	public static void main(String[] args) {
		//형변환 : int->String , String -> int String = Integer.toString(Int) , int = Integer.parseInt(String) , int = Integer.valueOf(String).intValue()
		//		 double->String , String -> double String = Double.toString(Double) , double = Double.valueOf(String).doubleValue()
		//		 float->String , String ->float -> String = Float.toString(Float) , float = Float.valueOf(String).floatValue()
		//숫자들 사이에서의 형변환 : 변수앞 자료형
		//ex01) 정수형 자료형 : byte, short, int, long (작은 자료형 -> 큰 자료형 캐스트 연산자 생략 가능)
		//      byte => 모든 자료형 변환 가능하지만 int -> byte는  값손실 생긴다.
		/*
			int intNum = 1000100;
			byte byteNum = (byte)intNum;
			short shortNum = (short)intNum;
			long longNum = intNum;
			System.out.printf("%d %d %d %d",intNum,byteNum,shortNum,longNum);
		*/
		//ex02) 정수 -> 실수 , 정수 -> 문자 형변환
		//		정수를 실수로 형변환시 캐스트연산자 생략 가능(단, 반드는 생략 안된다)
		//		문자와 정수는 아스키 코드값 통해 형변환 단, int -> char변경시 생략 불가능
		/*
			int intNum1 = 78;
			float floatNum = intNum1;
			int intNum2 = (int)floatNum;
			char charVar = (char)intNum1;
			System.out.printf("%d %f %d %c",intNum1,floatNum,intNum2,charVar);
		*/
		//pb01) 에러 코드 찾기
		/*
			int intNum = 30;
			//byte byteNum = intNum;//캐스트 연산자
			//short shortNum = intNum;//캐스트 연산자
			long longNum = intNum;
			float floatNum = intNum;
			double doubleNum =intNum;
			System.out.printf("%d %d %f %f",intNum,longNum,floatNum,doubleNum);
		*/
		//pb02) 형변환 생략할수 있는 것들을 모두 고르기
		/*
			int i = 1;
			byte b = (byte)i;//생략불가능 큰->작
			char ch = (char)b;//생략 불가능 큰->작
			short s = (short)ch;//생략불가능 큰->작
			long l = 4;
			float f = l;//생략 가능
			i = ch;//생략 가능		
			System.out.printf("%d %d %d %d %c %f ",s,b,i,l,ch,f);
		*/
		//pb03) 에러 찾아서 올바르게 고치기
		/*
			char char1 = 67;
			char char2 = 79;
			int char3 =79;
			int char4 = 76;
			//System.out.printf("%c %c %c %c \n",char1,char2,char3,char4);
			System.out.printf("%c %c %c %c \n",char1,char2,char3,char4);
			//System.out.printf("%d %d %d %d",char1,char2,char3,char4);
			System.out.printf("%d %d %d %d",(int)char1,(int)char2,char3,char4);
		*/
		//ex03) 문자열 -> 숫자: parseInt , 숫자 -> 문자열 : toString
		/*
			int i_1 = 289;
			String str_i = Integer.toString(i_1);
			int i_2 = Integer.parseInt(str_i);
			System.out.printf("%d %d %s \n",i_1,i_2,str_i);
			
			double d_1 = 35.632;
			String str_d = Double.toString(d_1);
			double d_2 = Double.parseDouble(str_d);
			System.out.printf("%f %f %s \n",d_1,d_2,str_d);
		*/
		//pb04) 화면 출력 8282 1234.4321
		int num1 = 8282;
		float num2 = 1234.4321f;
		String str_1 = Integer.toString(num1);
		String str_2 = Float.toString(num2);
		System.out.printf("%s %s",str_1,str_2);
				
		
	}

}
