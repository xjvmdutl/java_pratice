package java_project;

import java.util.Scanner;

public class ch18 {

	public static void main(String[] args) {
		// �迭 = �ڷ����� ������ ���̻��� ���� �����Ҽ� �ִ� ���� 
		// �ڷ���[] �迭�̸� = new �ڷ���[�迭ũ��]
		//ex01) 1���� �迭 ������ �ڷ���[] �迭�̸� = new �ڷ���[�迭ũ��] ���� �̷�����.
		//		length�� ���� ���̸� ������ ���� ������ ������ �־� ���� ���� ����
		/*
			int[] arr1 = new int[4];
			double[] arr2;//�������� ����
			arr2 = new double[7];
			System.out.println(arr1.length);
			System.out.println(arr2);//��ü �ּ�
		*/
		//ex02) �迭�� Ư���� ��ġ�� ���� �ε����� ���� ���� ���� , �迭�� ���� �Ҵ���� ������ ������ 0 �Ǽ��� 0.0 char�� ���� String�� null boolean�� false�� �ʱ�ȭ
		/*
			String[] arr1 =new String[5];
			double[] arr2 = new double[3];
			arr1[0] = "My name is ";
			arr1[1] = "Real Slow";
			System.out.println(arr1[0] + arr1[1]);
			System.out.println(arr1[3]);
			System.out.println(arr2[1]);
		*/
		//ex03) �迭�� �����ҋ����� int[] arr = new int[3] �� int arr[] = new int[3]�� ȥ���Ҽ� �ִ�. 
		//		���� �ʱ�ȭ�� ���ÿ� {}�� ���� ���� �ٷ� �ϤӤ����Ҽ� ������ ��ü�� ������ ���� ���� �Ҵ��ϸ� ������ �߻�
		/*
			int arr1[] = new int[3];
			//arr1 = {1,2,3};//�����߻�
			int[] arr2 = new int[] {1,2,3};
			int[] arr3 = {4,5,6,7};
			System.out.println(arr1[0]);
			System.out.println(arr2[2]);
			System.out.println(arr3[3]);
		*/
		//pb01) Tony�� ���Ƹ��� ģ�� 3���� �ֽ��ϴ� ģ�� �̸��� "Amy","Julia","Tom"�Դϴ� 
		//		Tony�� ���Ƹ� ģ������ �̸��� ���ҷ� ���̰� 3�� �迭�����
		/*
			String[] arr = new String[3];
			arr[0]= "Amy";
			arr[1]= "Julia";
			arr[2]= "Tom";
			for(int i=0;i<arr.length;++i) {
				System.out.println(arr[i]);
			}
		*/
		//pb02) int�� ������ ���ҷ� ���� �迭 arr1���� [1,2,3,4]�� �����ϰ� , arr2 ���� [8,7,6,5]�� �����Ѵ�.
		//		�ι迭�� �� �ڸ��� ���� ���ҷ� ���� ���̰� 4�� �迭 arr3�� ����
		/*
			int[] arr1 = {1,2,3,4};
			int[] arr2 = {8,7,6,5};
			int[] arr3 = new int[4];
			for(int i=0;i<arr1.length;++i) {
				arr3[i]=arr1[i] + arr2[i];
				System.out.println(arr3[i]);
			}
		*/
		//ex04) �迭�� �ִ� ������ ���ҿ� �ݺ����� �۾��� for�� ������
		//		�� ȿ������ ����� Ȯ��� for�� for(��� : �迭){...}
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
		//pb03) {1~10}���� �ʱ�ȭ ���ִ� 1���� �迭 arr�� �����ϰ� ���ҵ��� ���� ���ϴ� ���α׷� �ۼ�(Ȯ��� for��)
		/*
			int[] arr = {1,2,3,4,5,6,7,8,9,10};
			int sum = 0;
			for(int num : arr) {
				sum += num;
			}
			System.out.println(sum);
		*/
		//ex05) �迭�� �޼ҵ��� �Ű������� �Է¹����� �ִ�.(int[] arr)=> ������ �Է¹޴´�
		/*
			int[] arr = {1,2,3,4};
			System.out.println(sum_arr(arr));
		*/
		// pb04) int �� ������ ���ҷ� ���� 1���� �迭�� �Է¹޾� �迭�� ����� ������ �ִ񰪰� �ּڰ��� ��ȯ���ִ� �޼ҵ� maxValue(int[] arr),minValue(int[] arr)�� ���弼��
		/*
			int[] arr = {1,2,3,4,5,6,7,8,9,10};
			int max = maxVlaue(arr);
			int min = minVlaue(arr);
			System.out.println(max + " : "+ min);
		*/
		//pb05) int �������� ���ҷ� ���� 1���� �迭 arr�� �ϳ��� ������num�� �Է¹޾� �迭�� num ���� ������ �ִ��� ���� �˷��ֱ�
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
