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
		int a = 31;
		int b = 19;
		System.out.printf("%s %s \n",Integer.toBinaryString(b));
		
	
	}
}

