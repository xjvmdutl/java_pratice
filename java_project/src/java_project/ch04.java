package java_project;

public class ch04 {

	public static void main(String[] args) {
		//�ϳ��� ���ڰ� char , �ƽ�Ű �ڵ� a = 97, z =122 , A = 64 , Z = 90
		//ex01) a~z = 97~122 ,A~Z = 65~90
		/*
			char a = 'A';
			char b = 66;//B 
			char x = 'x';
			char z = 122;
			System.out.printf("%s %s \n",a,b);
			System.out.printf("%s %s",x,z);
		*/
		//ex02 ) �ƽ�Ű �ڵ带 Ȱ���Ͽ� ��ҹ���,������ ��� �񱳰����ϴ�.
		//���ڸ� �ƽ�Ű �ڵ�� �ٲٰ� ������ ����ȯ�� �Ѵ�.
		/*
			char A = 'A';
			//char a = (int)A + 32;//����  �������� �Ǽ����� �ƽ�Ű�ڵ����� �򰥸���. 
			char a = (char)((int)A + 32);
			char b = 65 + 33;
			System.out.printf("%s %d \n",A,(int)A);
			System.out.printf("%s %d \n",a,(int)a);
			System.out.printf("%s %d \n",b,(int)b);
		*/
		//PB01 ) 1.���ڿ� ���� x = 'k' ����, ������ ����  y �� 'g' ����
		//		 �κ��� x,y �ƽ�Ű �ڵ� �� ���
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
