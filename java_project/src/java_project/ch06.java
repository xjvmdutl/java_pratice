package java_project;

public class ch06 {
	public static void main(String[] args) {
		//��Ʈ ������ 8������ 0,16������ 0x �ٿ��� ���
		// 10 -> 2���� : IntegerŬ������toBinaryString(), ->8���� : IntegerŬ������toOctalString(), ->16���� : IntegerŬ������toHexString()
		// �Ķ���� = ����, ����� ���ڿ�
		//�ݴ�� 10������ ����� IntegerŬ������ parseInt()���
		//(>>,<<) : �� ��Ʈ�� ������ �������� �ű��. /2,*2 ȿ��
		//(>>>) : �� ��Ʈ�� ���������� �ű��. ��, ��Ʈ�� �и鼭 ��ԵǴ� ��Ʈ�� 0
		//(&,|,^,~) : ��Ʈ �� ���� , �Ѵ� 1,�����ϳ� 1,�ٸ��� 1,1->0
		//ex01) 10 -> 2���� : IntegerŬ������toBinaryString(), ->8���� : IntegerŬ������toOctalString(), ->16���� : IntegerŬ������toHexString()
		// 		�Ķ���� = ����, ����� ���ڿ�
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
		//ex02) ��Ʈ������ 2���� ǥ���� ���� ����
		/*
		 * int a = 181; int b = 217; int op_and = a&b; int op_or = a|b; int op_xor =
		 * a^b; int op_not = ~a;
		 * 
		 * System.out.printf("%d %d %d %d \n",op_and,op_or,op_xor,op_not);
		 */
		//pb01) ���� ����
		// 19 �� 2���� ǥ�� // 10011
		//System.out.println(Integer.toBinaryString(19));
		//34�� 8���� ǥ�� // 42
		//System.out.println(Integer.toOctalString(34));
		//94�� 16���� ǥ�� //5e
		//System.out.println(Integer.toHexString(94));
		//288�� 16���� ǥ�� //120
		//System.out.println(Integer.toHexString(288));
		//162�� 15���� ǥ�� // ac		
		//pb02) ��� ��� 
		/*
		 * int a =24; int b = 17; int c = 015; int d =0x3ab;
		 * System.out.printf("%s %s \n",Integer.toBinaryString(a),Integer.toOctalString(
		 * b));//11000,21
		 * System.out.printf("%S %S",Integer.toBinaryString(c),Integer.toOctalString(d))
		 * ;//1101,0011/1010/1011 ,1653
		 */
		//pb03) ��°�� ����
		/*
		 * int a = 31; int b = 19;
		 * System.out.printf("%s %s \n",Integer.toBinaryString(a&b),Integer.
		 * toBinaryString(a|b));//10011,11111
		 * System.out.printf("%s %s \n",Integer.toBinaryString(a+b),Integer.
		 * toBinaryString(a-b));//110010,1100
		 */
		//pb04) a=11,b=22,c=33 1011,16,41,1000010���
		/*
		 * int a = 11;//1011 int b = 22;//10110 int c = 33;//100001
		 * System.out.println(Integer.toBinaryString(a));
		 * System.out.println(Integer.toHexString(b));
		 * System.out.println(Integer.toHexString(c));
		 * System.out.println(Integer.toBinaryString(a+b+c));//c<<1
		 */
		//pb05) ��°�� ����
		/*
		 * int a = -123;//11111111111111111111111110000101 //���� 10���� 2���� ǥ�� = 8��Ʈ�� ���� ��,
		 * (01111011) , ù��ȣ�� 1�� ����(11111011), 0->1 1->0 ��ȯ(��ȣ��Ʈ����)= 10000100 , +1�� ���ش�
		 * 10000101
		 * System.out.printf("%s %s",Integer.toBinaryString(~a),~a);//1111010,122
		 */
		//pb06) ��°�� ���� 
		/*
		 * int a = 82;//1010010 int b = 98;//1100010
		 * System.out.printf("%s %d \n",Integer.toBinaryString(a&b),a&b);//1000010 66
		 * System.out.printf("%s %d \n",Integer.toBinaryString(a^b),a^b);//110000 48
		 * System.out.printf("%s %d \n",Integer.toBinaryString(a|b),a|b);//1110010 114
		 * System.out.printf("%s %d \n",Integer.toBinaryString(a+b>>2),a+b>>2);//101101
		 * 45
		 */
		//pb08)��ĭ ä���
		/*
			int a = 5;//101
			int b = 8;//1000
			int c = 2;//10
			int num1 = a & b;
			int num2 = a | b;
			int num3 = a | c;
			int num4 = a & b | c;
			System.out.printf("%d %d %d %d",num1,num2,num3,num4);//0 13 7 2
		*/
		//pb09) ���� ����  num -> ���� ���� ������ �ٲ㼭 ����ϴ� ���α׷�
		/*
			int num =-3;//num�� ���� ����
			String binaryNum = Integer.toBinaryString(num);
			System.out.println(binaryNum);
			binaryNum = Integer.toBinaryString(--num);
			System.out.println(binaryNum);
			binaryNum = Integer.toBinaryString(~num);
			System.out.println(binaryNum);
			num = Integer.parseInt(binaryNum,2);
			System.out.println(num);//3���
		*/
		//pb10) �ڿ��� num .�� �ι�� ����ؼ� ������ִ� ���α׷� ��, ��Ʈ������ ���
		/*
			int num = 8;
			System.out.println(Integer.toBinaryString(num));
			num = num << 1;
			System.out.println(Integer.toBinaryString(num));
			System.out.println(num);
		*/
		//pb11) 2�� �ŵ����� ǥ���ϱ� ��,��Ʈ�����ڸ� Ȱ���ؼ� 2^1~2^7����
		int num = 1;
		for(int i=1; i<=7; ++i) {
			System.out.println(num << i);
		}
		
	}
}

