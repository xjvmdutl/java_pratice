package java_project;

import java.util.Scanner;

public class ch05 {

	public static void main(String[] args) {
		//String ���ڿ� : ���ڿ��� �ε��� �����ϸ�,�ε����� Ȱ���� �����̽� ����(substring �޼ҵ�)
		//���� Ư�� �ε����� �˱����� indexOf()�Լ�, ���ڿ� �� �ٲٴ�replace(), �ҹ��ڸ� �빮�ڷ� �ٲٱ� ���� toUpperCase()�޼ҵ� ����
		//ex01) ���ڿ� ���� String ������ = "��"
		/*
			String str1 = "ABCDE";
			String str2 = "FGH";
			String str3 = str1 + str2;//ABCDEFGH
			System.out.println(str1 + str2);
			System.out.println(str3);
		*/
		//ex02) int indexOf(char ch) : ���� ���ڿ� ��ü���� ch�� ù������ �߰ߵǴ� ��ġ �ε��� ��´�. ������ -1
		//		int indexOf(String str) : ���� ���ڿ� ��ü���� str�� ã�Ƽ� ù��° ������ �ε��� ��ȯ ������ -1
		//		char charAt(int index) : ���� ���ڿ� ��ü index ��ġ�� ���ڰ� �ϳ��� ��´�.
		/*
			String str = "ABCDE";
			System.out.println(str.indexOf('A'));//0
			System.out.println(str.indexOf("CD"));//2
			System.out.println(str.charAt(4));//E
		*/
		//ex03) �ε����� Ȱ���Ͽ� �κ� ���ڿ� ���� : String substring(int start):���� ���ڿ� ��üstart��ġ���� ������ ���ڿ� ����
		//		String substring(int start,int end) : ���� ���ڿ� ��ü start���� end�������� ���ڿ� ����
		/*
			String str = "ABCDEFGH";
			System.out.println(str.substring(3));//DEFGH
			System.out.println(str.substring(1,3));//BC
			System.out.println(str.substring(2,2));//
		*/
		//ex04) Boolean startWith(String str) : ���ڿ��� str�� �����ϴ��� �Ǵ� ������ true,�ƴϸ� fasle
		//		Boolean endWith(String str) : ���ڿ��� str�� �������� �Ǵ� ������ true,�ƴϸ� fasle
		//		int length() : ���ڿ����� ��ȯ
		//		String replace(String str1,String str2) : ���ڿ��� �ִ� str1�� ���ڿ� str2�� ����
		//		String concat(String str) : ���ڿ��� ����
		/*
			String str = "aBCd EFgH";
			System.out.println(str.startsWith("A"));//flase
			System.out.println(str.length());//9
			System.out.println(str.replace("BC","KK"));//aKKd EFgH
			System.out.println(str.toLowerCase());//abcd efgh
			System.out.println(str.concat("34"));//aBCd EFgH34
		*/
		//pb01) Korea�� ����ϴ� ���α׷�
		/*
			String str = "Korea";
			System.out.println(str);
		*/
		//pb02) ��� ��� ����
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
		//pb03) 3���� ���ڿ� ���� str1,str2,str3���� , ���ڿ����� Julio,Abraham,DoDo ����,
		//		���̸��� ���� �ձ��ڸ� �̾� �ٿ��� ���
		/*
			String str1 = "Julio";
			String str2 = "Abraham";
			String str3 = "DoDo";
			System.out.println(str1.charAt(0)+str2.substring(0,1)+str3.charAt(0));
		*/
		//ex05) �̽������� �ڵ� : ���α׷��� �Ҷ� ����Ҽ� �ְ� ����� ���ڿ�
		//		\n : �ٹٲ� , \' : ��������ǥ ���, \" : ū ����ǥ ��� , \\ : �������� ��� , \t : �Ǹ�ŭ ����
		/*
			String text_1 = "���ڿ����� \n�� ���� �ٹٲ��� �ǰ� \t�� ����ϸ� �� ������ �־�����.";
			String text_2 = "���ڿ����� \'�� \"�� ����ǥ�� ���� ����� �ش�.";
			String text_3 = "�������ø� ���� ������ \\";
			System.out.println(text_1);
			System.out.println(text_2);
			System.out.println(text_3);
		*/
		//ex06) �ʹ� �� ���ڿ��� + �������� �����ٿ� ���ļ� ���� ����
		/*
			String text = "Hello " 
					+"My name is "
					+"Q";
			System.out.println(text);
		*/
		//pb04)��°�� �����
		/*
			String str1= "������ ���� \n"
					+"������ ���\n"
					+"�׷��ǹ̰� ����.";
			System.out.println(str1);
		*/
		
		//pb05) ��� ��� ����
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
		//pb06) ��ĭ ä���
		/*
			String name = "Ronaldo";
			String nation = "Portugal";
			int age = 33;
			int height = 185;
			System.out.printf("My name is %s, and I\'M from %s\n",name,nation);
			System.out.printf("I\'M %d years old and %d cm tall",age,height);
		*/
		//pb07) ���ȭ�� �����
		/*
			String name1 = "Billy";
			String name2 = "Juno";
			String status1 = "tall";
			String status2 = "smart";
			
			System.out.println(name1 + " is " + status1);
			System.out.println(name2 + " is " + status2);
		*/
		//pb08) ��� ���
		/*
			String text_1 = "����\n�ٶ�\n���ٻ�\t��";
			String text_2 = "����ī";
			String text_3 = "Ÿ\n����";
			
			System.out.println(text_1);//����
									   //�ٶ�
									   //���ٻ�	��
			System.out.println(text_2);//����ī
			System.out.print(text_3);//Ÿ
									 //����
		*/
		//pb09) �ϳ��� ��¹����� ���� ������ ����ϴ� ��¹�
		/*
			System.out.println("���� : ���ѹα�\n"
					+"���� : ����\n"
					+"��� : �ѱ���\n"
					+"�α� : 51,779,148��");
		*/
		//pb10) ��ĭ ä���
		/*
			String mystr = "ORANGE";
			
			System.out.println(mystr.charAt(0));//O
			System.out.println(mystr.charAt(4));//G
			System.out.println(mystr.charAt(3));//N
			System.out.println(mystr.charAt(0));//O
		*/
		//pb11) ��ĭ ä���
		/*
			String mystr = "SOLUTION";
			System.out.println(mystr.substring(1,4));//OLU
			System.out.println(mystr.substring(0,5));//SOLUT
		*/
		//pb12) c:\'aa\"abc.txt���
		//System.out.println("c:\\\'aa\\\"abc.txt");
		//pb13) num1, num2 �� ���ڿ� Ư������ ���� ������ �Է��޾� �ش� �κ� ���
		/*
			Scanner sc = new Scanner(System.in);	
			System.out.print("num1 ? ");
			int num1 = sc.nextInt();
			System.out.print("num2 ? ");
			int num2 = sc.nextInt();
			
			System.out.print("���ڿ� �Է� : ");
			String str = sc.next();
			
			System.out.println(str.substring(num1-1,num2));
		*/
		//pb14) �ֱ��� 1���� ���ڼ�(���� ������)�� ����ϴ� ���α׷�
		/*
			String str = "���ع��� ��λ��� ������ �⵵��\n �ϴ����� �����ϻ� �츮 ���󸸼�\n ����ȭ ��õ�� ȭ������\n ���ѻ�� �������� ���� �����ϼ�";
			System.out.println(str.replace(" ", ""));
		*/
		//pb15) Sentence��� ������ I'm from Korea, but I don't like Kimchi ����
		//		���ڿ� �Լ��� �̿��Ͽ� 4�ٳ��� �ʰ� �ۼ�
		/*
			String sentence = "I\'m from Korea, but I don\'t like Kimchi" ;
			System.out.println(sentence.toUpperCase());
			System.out.println(sentence.toLowerCase());
			System.out.println(sentence.replace(" " , ""));
		*/
		}

}