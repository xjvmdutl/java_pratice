package java_project;

public class ch08 {

	public static void main(String[] args) {
		//����ȯ : int->String , String -> int String = Integer.toString(Int) , int = Integer.parseInt(String) , int = Integer.valueOf(String).intValue()
		//		 double->String , String -> double String = Double.toString(Double) , double = Double.valueOf(String).doubleValue()
		//		 float->String , String ->float -> String = Float.toString(Float) , float = Float.valueOf(String).floatValue()
		//���ڵ� ���̿����� ����ȯ : ������ �ڷ���
		//ex01) ������ �ڷ��� : byte, short, int, long (���� �ڷ��� -> ū �ڷ��� ĳ��Ʈ ������ ���� ����)
		//      byte => ��� �ڷ��� ��ȯ ���������� int -> byte��  ���ս� �����.
		/*
			int intNum = 1000100;
			byte byteNum = (byte)intNum;
			short shortNum = (short)intNum;
			long longNum = intNum;
			System.out.printf("%d %d %d %d",intNum,byteNum,shortNum,longNum);
		*/
		//ex02) ���� -> �Ǽ� , ���� -> ���� ����ȯ
		//		������ �Ǽ��� ����ȯ�� ĳ��Ʈ������ ���� ����(��, �ݵ�� ���� �ȵȴ�)
		//		���ڿ� ������ �ƽ�Ű �ڵ尪 ���� ����ȯ ��, int -> char����� ���� �Ұ���
		/*
			int intNum1 = 78;
			float floatNum = intNum1;
			int intNum2 = (int)floatNum;
			char charVar = (char)intNum1;
			System.out.printf("%d %f %d %c",intNum1,floatNum,intNum2,charVar);
		*/
		//pb01) ���� �ڵ� ã��
		/*
			int intNum = 30;
			//byte byteNum = intNum;//ĳ��Ʈ ������
			//short shortNum = intNum;//ĳ��Ʈ ������
			long longNum = intNum;
			float floatNum = intNum;
			double doubleNum =intNum;
			System.out.printf("%d %d %f %f",intNum,longNum,floatNum,doubleNum);
		*/
		//pb02) ����ȯ �����Ҽ� �ִ� �͵��� ��� ����
		/*
			int i = 1;
			byte b = (byte)i;//�����Ұ��� ū->��
			char ch = (char)b;//���� �Ұ��� ū->��
			short s = (short)ch;//�����Ұ��� ū->��
			long l = 4;
			float f = l;//���� ����
			i = ch;//���� ����		
			System.out.printf("%d %d %d %d %c %f ",s,b,i,l,ch,f);
		*/
		//pb03) ���� ã�Ƽ� �ùٸ��� ��ġ��
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
		//ex03) ���ڿ� -> ����: parseInt , ���� -> ���ڿ� : toString
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
		//pb04) ȭ�� ��� 8282 1234.4321
		int num1 = 8282;
		float num2 = 1234.4321f;
		String str_1 = Integer.toString(num1);
		String str_2 = Float.toString(num2);
		System.out.printf("%s %s",str_1,str_2);
				
		
	}

}
