package java_project;

import java.util.Scanner;

public class ch15 {

	public static void main(String[] args) {
		// 다중 반복문 : 반복문을 중첩하여 사용하는것 
		//ex01)  이중 반복문을 활용하여 각 자릿수의 합이 20이 넘을떄 까지 수를 계속 입력 받기
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
		//pb01) 구구단을 1~9단까지 출력하는 프로그램
		/*
			for(int i=1;i<=9;++i) {
				for(int j =1;j<=9;++j) {
					System.out.println(i +" * "+ j +" = " + i*j);
				}
			}
		*/
		//pb02) 문자열을 입력받아 문자열을 하나씩 출력
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
		//pb03) 피라미드1 : 11층 피라미드를 출력 
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
		//pb04) 피라미드2 : 11층 피라미드 출력
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
		//pb05) 피라미드3 : 11층 피라미드
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
		//pb06) 피라미드4 : 11층 피라미드
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
		
		//pb07) 피라미드 5: 11층 피라미드
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
		//pb08) 어떤 수가 입ㄹ력되면 이 수를 두스의 곱으로 나타낼수 있으면 두소수를 오름차순으로  출력하고 그렇지 않으면 wrong number 출력
		/*
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int i = 1; int j=2;
		boolean isPos =false;
		while(num > i & !isPos) {
			i++;
			//소수인걸 알아야한다.
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
		//pb09) 다중 반복문을 활용한 프로그램을 통해 3x*2y을 해를 구하세요
		/*
		for(int x = 0; (3*x) <= 10;++x) {
			for(int y = 0; (y*2) <= 10 ;++y) {
				if((3*x) + (2*y) == 10) {
					System.out.printf("해는 x=%d, y=%d\n",x,y);
				}
			}
		}
		*/
		//pb10) 시:분으로 표시하는 디지털시계(00:00~23:59)에 하루동안 3이 표시되는 시간이 총 몇초인지 구하세요
		/*
		int count = 0;
		for(int i=0;i<24;++i) {//시간
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
		//Pb11) a,b,c가 자연수일떄 a+b+c =100을 만족하는 중복되지 않은 세 자연수을 조합을 구하세요
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
		//pb12) 1~3 까지 숫자를 중복하여 사용하여 만든 세자리 수들을 가장 작은 수부터 순서대로 나열했을떄 10쨰에 오는 수를 구하시오
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
