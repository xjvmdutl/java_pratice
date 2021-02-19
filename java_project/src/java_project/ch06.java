package java_project;

public class ch06 {
	public static void main(String[] args) {
		//비트 연산자 8진수는 0,16진수는 0x 붙여서 사용
		// 10 -> 2진수 : Integer클래스의toBinaryString(), ->8진수 : Integer클래스의toOctalString(), ->16진수 : Integer클래스의toHexString()
		// 파라미터 = 정수, 결과는 문자열
		//반대로 10진수로 변경시 Integer클래스의 parseInt()사용
		//(>>,<<) : 각 비트를 오른쪽 왼쪽으로 옮긴다. /2,*2 효과
		//(>>>) : 각 비트를 오른쪽으로 옮긴다. 단, 비트를 밀면서 비게되는 비트는 0
		//(&,|,^,~) : 비트 비교 연산 , 둘다 1,둘중하나 1,다르면 1,1->0
		//ex01) 10 -> 2진수 : Integer클래스의toBinaryString(), ->8진수 : Integer클래스의toOctalString(), ->16진수 : Integer클래스의toHexString()
		// 		파라미터 = 정수, 결과는 문자열
		/*
		 * int a = 153; int oct = 012; int hex = 0x1a4;
		 * 
		 * String a_Bi = Integer.toBinaryString(a); String a_Oct =
		 * Integer.toOctalString(a); String a_Hex = Integer.toHexString(a);
		 * 
		 * int a1 = Integer.parseInt(a_Bi,2); int a2 = Integer.parseInt(a_Oct,8); int a3
		 * = Integer.parseInt(a_Hex,16);
		 * 
		 * System.out.printf("%d %d %d %s %s %s \n",a,oct,hex,a_Bi,a_Oct,a_Hex);
		 * System.out.printf("%d %d %d ",a1,a2,a3);
		 */
		//ex02) 비트연산은 2진수 표현에 대한 연산
		/*
		 * int a = 181; int b = 217; int op_and = a&b; int op_or = a|b; int op_xor =
		 * a^b; int op_not = ~a;
		 * 
		 * System.out.printf("%d %d %d %d \n",op_and,op_or,op_xor,op_not);
		 */
		//pb01) 물음 질문
		// 19 의 2진수 표현 // 10011
		//System.out.println(Integer.toBinaryString(19));
		//34의 8진수 표현 // 42
		//System.out.println(Integer.toOctalString(34));
		//94의 16진수 표현 //5e
		//System.out.println(Integer.toHexString(94));
		//288의 16진수 표현 //120
		//System.out.println(Integer.toHexString(288));
		//162의 15진수 표현 // ac		
		//pb02) 출력 결과 
		/*
		 * int a =24; int b = 17; int c = 015; int d =0x3ab;
		 * System.out.printf("%s %s \n",Integer.toBinaryString(a),Integer.toOctalString(
		 * b));//11000,21
		 * System.out.printf("%S %S",Integer.toBinaryString(c),Integer.toOctalString(d))
		 * ;//1101,0011/1010/1011 ,1653
		 */
		//pb03) 출력결과 적기
		int a = 31;
		int b = 19;
		System.out.printf("%s %s \n",Integer.toBinaryString(b));
		
	
	}
}

