package java_project;

public class ch01 {

	public static void main(String[] args) {
		//ex01)System.out.println ���� ������ 
		System.out.print("abc");//�ּ�
		System.out.print("de"+"fg");//���ڿ� ���ϱ�
		System.out.println(34);//���� ���
		System.out.print(10+21);//������
		//ex02)���� ã��
		System.out.println('A'+5);//System.out.println(5+A);//���ڿ� ���� ���Ҽ� ����.//���� +���� = �ƽ�Ű �ڵ� ��
		//System.out.println(Hello);//ū����ǥ ��� x
		//System.out.println(3+"412");//���ڿ� ���� ���Ҽ� ���� ���� ū����ǥ ���θ� ���ڰ��ȴ�.
		//ex03)\n (�ٹٲ�) ,  + (���ڿ� ���ϱ�) ������ Ȱ��
		System.out.println("Hello!\n"
				+ "My name is BitCoding\n"
				+"Nice to meet You");
		//pb01) 123456890�� �ι� ����ϴ� ���α׷� �ۼ� ��) ��¹� 2������ϰ� ������ ��¹��� ���ڿ��� ���� ���
		System.out.println("1234567"+"890");
		System.out.print(1234567890);
		//pb02) �� �̸��� xxx ���
		String name = "����ȣ";
		System.out.println("�� �̸��� "+name + "�Դϴ�");
		
		//pb03)����
		System.out.println(16230);//o
		//System.out.println(abc);// error ""����
		System.out.println(13 - 2.0);//11.0 //int - double = double 
		System.out.println(12 + 4 / 2 + 1);//15
		System.out.println("A"+"B"+"C");//ABC
		//System.out.println("A" - "B");//error ���ڿ� - �Ұ���
		System.out.println("A"+'B');//AB 
		//System.out.println(52-"33");//error���ڿ� ���� �Ұ���
		//pb04)��°�� ����
		System.out.println("CA\n"+"AC");/*CA
										AC*/
		System.out.println(35+4.0);//39.0
		System.out.println(5);//6
		/*pb05)"���̽㵵 ����
		*		�ڹٵ� ����
		*		�� õ���ΰ�!" �ϳ��� ��¹����� ���
		*/
		System.out.print("���̽㵵 ���� \n�ڹٵ� ���� \n�� õ���ΰ�!");
		/*pb06) 33Ad1
		*		33Ad1 �� ����ϴ� ��¹��� ����
		*/				
		System.out.println("33Ad1");
		System.out.print("33Ad1");

	}

}
