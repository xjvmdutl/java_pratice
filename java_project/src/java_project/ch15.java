package java_project;

import java.util.Scanner;

public class ch15 {

	public static void main(String[] args) {
		// ���� �ݺ��� : �ݺ����� ��ø�Ͽ� ����ϴ°� 
		//ex01)  ���� �ݺ����� Ȱ���Ͽ� �� �ڸ����� ���� 20�� ������ ���� ���� ��� �Է� �ޱ�
		/*
			Scanner sc = new Scanner(System.in);
			int sum = 0;
			while(sum<=20) {
				sum = 0;
				System.out.print("Enter the number : ");
				int num = sc.nextInt();
				while(num>=1) {
					sum += num % 10;
					num/=10;
				}
			}
			System.out.println("Finish");
		*/
		//pb01) �������� 1~9�ܱ��� ����ϴ� ���α׷�
		/*
			for(int i=1;i<=9;++i) {
				for(int j =1;j<=9;++j) {
					System.out.println(i +" * "+ j +" = " + i*j);
				}
			}
		*/
		//pb02) ���ڿ��� �Է¹޾� ���ڿ��� �ϳ��� ���
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the sentense : ");
			String str = sc.nextLine();
			for(int i=0;i<str.length();++i) {
				for(int j=0;j<=i;++j) {
					System.out.print(str.charAt(j));
				}
				System.out.println();
			}
		*/
		//pb03) �Ƕ�̵�1 : 11�� �Ƕ�̵带 ��� 
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ******
		 * *******
		 * ********
		 * *********
		 * **********
		 * ***********
		 * */
		/*
			for(int i = 0; i< 11; ++i ) {
				for(int j = 0;j<=i;++j) {
					System.out.print("*");
				}
				System.out.println();
			}
		*/
		//pb04) �Ƕ�̵�2 : 11�� �Ƕ�̵� ���
		/*
		 * ***********
		 * **********
		 * *********
		 * ********
		 * *******
		 * ******
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * */
		/*
			for(int i = 11; i> 0; --i ) {
				for(int j = i;j>0;--j) {
					System.out.print("*");
				}
				System.out.println();
			}
		*/
		//pb05) �Ƕ�̵�3 : 11�� �Ƕ�̵�
		/*
		 * *
		 * ***
		 * *****
		 * *******
		 * *********
		 * ***********
		 * ***********
		 * ***********
		 * ***********
		 * ***********
		 * ***********
		 * */
		/*
		for(int i = 1 ; i<=11;++i) {
			for(int j=1; 2*i <= 11 ? j<(2*i) : j<11;++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//pb06) �Ƕ�̵�4 : 11�� �Ƕ�̵�
		/*
		 *           *
		 *          ***
		 *         ******
		 *        *********
		 *       ***********
		 *      *************
		 *     ***************
		 *    *****************
		 *   *******************
		 *  *********************
		 * ***********************
		 * */
		/*
		for(int i= 1;i<12;++i) {
			for(int j=1;j<12-i;++j) {
				System.out.print(" ");
			}
			for(int k=1;k<(2*i);++k) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//pb07) �Ƕ�̵� 5: 11�� �Ƕ�̵�
		/*
		 *           *
		 *          ***
		 *         *****
		 *        *******
		 *       *********
		 *      ***********
		 *       *********
		 *        *******
		 *         *****
		 *          ***
		 *           *
		 * ***********************
		 * */
		/*
		for(int i=1;i<=11;++i) {
			for(int j=i;j<=11/2;++j) {
				System.out.print(" ");
			}
			
			for(int k=1; i<=13/2 ? k<(2*i) : k< 2*(11-i+1);++k) {
				System.out.print("*");
			}
			System.out.println();
			for(int m = 11-i ;m<=11/2;++m) {
				System.out.print(" ");
			}
		}
		*/
		//pb08) � ���� �Ԥ��µǸ� �� ���� �ν��� ������ ��Ÿ���� ������ �μҼ��� ������������  ����ϰ� �׷��� ������ wrong number ���
		/*
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int i = 1; int j=2;
		boolean isPos =false;
		while(num > i & !isPos) {
			i++;
			//�Ҽ��ΰ� �˾ƾ��Ѵ�.
			boolean isPr_i = true;
			for(int n =2 ; n<i; ++n) {
				if(i%n == 0) {
					isPr_i = false;
				}
			}
			
			for(j=i;j<num;++j) {
				boolean isPr_j = true;
				for(int n=2;n<j;++n) {
					if(j%n == 0) {
						isPr_j=false;
						break;
					}
				}
				if(isPr_i && isPr_j && num == j*i) {
					isPos= true;
					break;
				}
			}
			
		}
		if(isPos) {
			System.out.printf("%d = %d * %d",num,i,j);
		}else {
			System.out.println("wrong number");
		}
		*/
		//pb09) ���� �ݺ����� Ȱ���� ���α׷��� ���� 3x*2y�� �ظ� ���ϼ���
		/*
		for(int x = 0; (3*x) <= 10;++x) {
			for(int y = 0; (y*2) <= 10 ;++y) {
				if((3*x) + (2*y) == 10) {
					System.out.printf("�ش� x=%d, y=%d\n",x,y);
				}
			}
		}
		*/
		//pb10) ��:������ ǥ���ϴ� �����нð�(00:00~23:59)�� �Ϸ絿�� 3�� ǥ�õǴ� �ð��� �� �������� ���ϼ���
		/*
		int count = 0;
		for(int i=0;i<24;++i) {//�ð�
			for(int j =0;j<60;++j) {
				int num = j/10;
				if(i%10 == 3 || j%10 == 3 || num ==3) {
					System.out.printf("%d : %d\n",i,j);
					count++;
				}
			}
		}
		System.out.println(count);
		*/
		//Pb11) a,b,c�� �ڿ����ϋ� a+b+c =100�� �����ϴ� �ߺ����� ���� �� �ڿ����� ������ ���ϼ���
		/*
			int num =100;
			int count = 0;
			for(int a=1;a<num;++a) {
				for(int b=a;b<=num-a;++b) {
					for(int c=b;c<=num-b-a;++c) {
						if(a+b+c == 100) {
							count++;
							System.out.printf("%d + %d + %d = %d\n",a,b,c,a+b+c);
						}
					}
				}
			}
			System.out.println(count);
		*/
		//pb12) 1~3 ���� ���ڸ� �ߺ��Ͽ� ����Ͽ� ���� ���ڸ� ������ ���� ���� ������ ������� ���������� 10���� ���� ���� ���Ͻÿ�
		/*
			int count = 0;
			for(int i=1;i<=3;++i) {
				for(int j=1;j<=3;++j) {
					for(int k=1;k<=3;++k) {
						count++;
						if(count==10) {
							System.out.println(100*i+10*j+k);
						}
					}
				}
			}
		*/
	}

}
