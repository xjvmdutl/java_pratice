package java_project;

import java.util.Scanner;

public class ch18 {

	public static void main(String[] args) {
		// 배열 = 자료형이 동일한 둘이상의 값을 저장할수 있는 공간 
		// 자료형[] 배열이름 = new 자료형[배열크기]
		//ex01) 1차원 배열 생성은 자료형[] 배열이름 = new 자료형[배열크기] 통해 이뤄진다.
		//		length를 통해 길이를 저장한 고유 변수를 가지고 있어 쉽게 접근 가능
		/*
			int[] arr1 = new int[4];
			double[] arr2;//참조변수 생성
			arr2 = new double[7];
			System.out.println(arr1.length);
			System.out.println(arr2);//객체 주소
		*/
		//ex02) 배열은 특정한 위치의 값에 인덱스를 통해 접근 가능 , 배열에 값이 할당되지 않으면 정수는 0 실수는 0.0 char는 공백 String은 null boolean은 false로 초기화
		/*
			String[] arr1 =new String[5];
			double[] arr2 = new double[3];
			arr1[0] = "My name is ";
			arr1[1] = "Real Slow";
			System.out.println(arr1[0] + arr1[1]);
			System.out.println(arr1[3]);
			System.out.println(arr2[1]);
		*/
		//ex03) 배열을 선언할떄에는 int[] arr = new int[3] 과 int arr[] = new int[3]과 혼용할수 있다. 
		//		또한 초기화와 동시에 {}를 통해 값을 바로 하ㅣㄹ당할수 있지만 객체가 생성된 이후 값을 할당하면 에러가 발생
		/*
			int arr1[] = new int[3];
			//arr1 = {1,2,3};//에러발생
			int[] arr2 = new int[] {1,2,3};
			int[] arr3 = {4,5,6,7};
			System.out.println(arr1[0]);
			System.out.println(arr2[2]);
			System.out.println(arr3[3]);
		*/
		//pb01) Tony는 동아리에 친구 3명이 있습니다 친구 이름은 "Amy","Julia","Tom"입니다 
		//		Tony의 동아리 친구들의 이름을 원소로 길이가 3인 배열만들기
		/*
			String[] arr = new String[3];
			arr[0]= "Amy";
			arr[1]= "Julia";
			arr[2]= "Tom";
			for(int i=0;i<arr.length;++i) {
				System.out.println(arr[i]);
			}
		*/
		//pb02) int형 변수를 원소로 갖는 배열 arr1에는 [1,2,3,4]를 저장하고 , arr2 에는 [8,7,6,5]를 저장한다.
		//		두배열의 각 자리의 합을 원소로 갖는 길이가 4인 배열 arr3을 생성
		/*
			int[] arr1 = {1,2,3,4};
			int[] arr2 = {8,7,6,5};
			int[] arr3 = new int[4];
			for(int i=0;i<arr1.length;++i) {
				arr3[i]=arr1[i] + arr2[i];
				System.out.println(arr3[i]);
			}
		*/
		//ex04) 배열에 있는 각가의 원소에 반복적인 작업은 for문 돌리기
		//		더 효과적인 방법은 확장된 for문 for(요소 : 배열){...}
		/*
			int[] arr = {1,2,3,4};
			for(int i=0;i<arr.length;++i) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			int[] brr = {5,6,7,8};
			for(int e : brr) {
				System.out.print(e+" ");
			}
		*/
		//pb03) {1~10}까지 초기화 되있는 1차원 배열 arr을 선언하고 원소들의 합을 구하는 프로그램 작성(확장된 for문)
		/*
			int[] arr = {1,2,3,4,5,6,7,8,9,10};
			int sum = 0;
			for(int num : arr) {
				sum += num;
			}
			System.out.println(sum);
		*/
		//ex05) 배열을 메소드의 매개변수를 입력받을수 있다.(int[] arr)=> 참조를 입력받는다
		/*
			int[] arr = {1,2,3,4};
			System.out.println(sum_arr(arr));
		*/
		// pb04) int 형 변수를 원소로 갖는 1차원 배열을 입력받아 배열에 저장된 원소의 최댓값과 최솟값을 반환해주는 메소드 maxValue(int[] arr),minValue(int[] arr)을 만드세요
		/*
			int[] arr = {1,2,3,4,5,6,7,8,9,10};
			int max = maxVlaue(arr);
			int min = minVlaue(arr);
			System.out.println(max + " : "+ min);
		*/
		//pb05) int 형변수를 원소로 갖는 1차원 배열 arr과 하나의 정수값num을 입력받아 배열이 num 값을 가지고 있는지 여부 알려주기
		/*
			int[] arr = {3,5,1,7,5};
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Number : ");
			int num = sc.nextInt();
			if(is_Have(num,arr)) {
				System.out.println("arr Is have "+ num);
			}else {
				System.out.println("No result");
			}
		*/
		
	}
	
	/* ex05
	public static int sum_arr(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		return sum;
	}
	 */
	/* pb04
	public static int maxVlaue(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;++i) {
			max = max<arr[i]? arr[i]: max;   
		}
		return max;
	}
	public static int minVlaue(int[] arr) {
		int min = arr[0];
		for(int i=1;i<arr.length;++i) {
			min = min>arr[i]? arr[i]: min;   
		}
		return min;
	}
	*/
	/* pb05
	public static boolean is_Have(int num,int[] arr) {
		for(int num1 : arr) {
			if(num == num1) {
				return true;
			}
		}
		return false;
	}
	*/
}
