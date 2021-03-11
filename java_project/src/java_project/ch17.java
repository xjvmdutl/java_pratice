package java_project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ch17 {

	public static void main(String[] args) {
		// random ÇÔ¼ö : 1) MathÅ¬·¡½ºÀÇ random()¸Ş¼Òµå Math.random()ÄÚµå¸¦ »ç¿ë½Ã 0.0~1.0¹Ì¸¸ÀÇ doubleÅ¸ÀÔ½Ç¼ö¸¦ ·£´ıÇÏ°Ô ¹ß»ı
		//				¸¸¾à max~min±îÁöÀÇ Á¤¼ö¸¦ ±¸ÇÏ°í ½Í´Ù¸é (int)Math.random()*(max-min+1)+min ÀÌ·¸°Ô »ç¿ë
		//				2) RandomÅ¬·¡½º¸¦ »ç¿ë  random°´Ã¼¸¦ »ı¼ºÇØ¼­ nextInt,nextBoolean ¸Ş¼Òµå È°¿ë
		//ex01) MathÅ¬·¡½ºÀÇ random()¸Ş¼Òµå
		/*
			double num1 = Math.random();
			System.out.println(num1);
			
			int max = 20;
			int min = 10;
			int num = (int)(Math.random()*(max-min+1)+min);
			System.out.println(num);
		*/
		//ex02) Random()¸ğµÑÀ» È°¿ëÇÑ ³­¼ö¸¦ ¹ß»ı nextInt(max)´Â 0~Max±îÁö Á¤¼ö¸¦ ¹ß»ı
		/*
			Random r = new Random();
			int var1 = r.nextInt(10);
			boolean var2 =r.nextBoolean();
			double var3 = r.nextDouble();
			System.out.printf("%d %b %f ",var1,var2,var3);
		*/
		//ex03) ÄÄÇ»ÅÍ°¡ ¹ß»ı½ÃÅ² ÇÑÀÚ¸® ³­¼ö¸¦ ¸ÂÃß´Â ÇÁ·Î±×·¥
		/*
			Random rd = new Random();
			Scanner sc = new Scanner(System.in);
			int answer =rd.nextInt(10);
			int num =0;
			do {
				System.out.print("10 ÀÌÇÏ ¼ö¸¦ ¸ÂÃß¼¼¿ä : ");
				num = sc.nextInt();
			}while(num != answer);
			System.out.println("¸Â­Ÿ½À´Ï´Ù.");
		*/
		//pb01) 1~10±îÁöÀÇ ³­¼ö 5°³¸¦ ¹ß»ı½ÃÄÑ ¼ıÀÚ ÇÏ³ª¸¦ ¹ß»ı½ÃÄÑ ÀÌ ¼ö°¡ ³­¼öµéÀ» Æò±Õº¸´Ù Å©¸é Big ÀÛÀ¸¸é Small
		/*
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			System.out.print("Random numbers : ");
			int sum=0;
			for(int i=0;i<5;++i) {
				int random = rd.nextInt(9)+1;
				sum += random;
				System.out.print(random + " ");
			}
			System.out.println("\n" + (sum/5 <  num ? "Big" : "small"));
		*/
		//pb02) 0.00ºÎÅÍ 10.00±îÁö ¼Ò¼ö µÑÂ° ÀÚ¸®±îÁö °¡Áö´Â ½Ç¼ö ³­¼ö¸¦ ¹ß»ı½ÃÅ°´Â ÇÁ·Î±×·¥ ÀÛ¼º
		/*
			Random r = new Random();
			double num = r.nextDouble();
			num = Math.nextUp(num);//0.0000000000~0.9999999999
			num = Math.round((num*1000))/100.0; // 0~999/100.0 => 0~9.99
			System.out.println(num);
		*/
		//pb03) 0~100±îÁöÀÇ Â¦¼ö¸¦ ·£´ıÇÏ°Ô ¹ß»ıÇÏ°í È¦¼ö¸¦ ·£´ıÇÏ°Ô ¹ß»ıÇÏ´Â ÇÁ·Î±×·¥ ÀÛ¼º
		/*
			int n1 = oddNum();
			int n2 = EvenNum();
			System.out.println(n1 + " : "+n2);
		*/
		//ex04) Ç¥ÁØ Á¤±ÔºĞÆ÷ÀÇ ³­¼ö¹ß»ıÀº Random Å¬·¡½ºÀÇ nextGaussian()¸Ş¼Òµå¸¦ È°¿ë : -log u/n(¾î¶² ±¸°£ÀÇ Áß½ÉÁ¡¿¡ ´õ ¸¹Àº ºóµµ°¡ ¿Ã¶ó°¨)
		/*
			Random r = new Random();
			double rNarm = r.nextGaussian();
			double u = r.nextDouble();
			double lambda = 5.0;
			double rExpo = - Math.log(u)/lambda;
			System.out.printf("%f %f",rNarm,rExpo);
		*/
		//pb04) ÀÌÇ×ºĞÆ÷´Â pÀÇ È®·ü·Î ¼º°øÇÏ´Â »ç°ÇÀ» n¹ø ½ÇÇà Çß¤·À»‹š »ç°ÇÀÌ ¼º°øÇÏ´Â È½¼ö°¡ µû¸£´Â ºĞÆ÷¸¦ ÀÇ¹Ì ÀÌ·¯ÇÑ ºÎÆ÷¸¦(n,p)¸¦ µû¸£´Â ÀÌÇ×ºĞÆ÷
		//		Áï n¹øÀÇ 0~1 »çÀÌÀÇ ³­¼ö¸¦ ¹ß»ı½ÃÄÑ¼­ pº¸´Ù Å« ¼ö°¡ ³ª¿Â È½¼ö ±¸ÇÏ±â
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int n = sc.nextInt();
			int rBinom = rBinom(n,0.5);
			System.out.println(rBinom);
		*/
		//pb05) µÎ¼ö¸¦ ÀÔ·Â¹Ş°í ÀÔ·Â¹ŞÀº µÎ¼ö »çÀÌÀÇ Á¤¼ö¸¦ ·£´ıÀ¸·Î Ãâ·ÂÇÏ¤Ã´Â ÇÁ·Î±×·¥ ÀÛ¼º(¸¸¾à µÎ¼ö »çÀÌ Á¤¼ö ¾øÀ»°æ¿ì no integer between two numbers Ãâ·Â)
		/*
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			System.out.print("µÎ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int max = n1<n2 ? n2:n1;
			int min = n1<n2 ? n1+1:n2+1;
			if(max - min >= 0) {
				int num = rd.nextInt(max-min);
				System.out.println(num+min);
			}else {
				System.out.println("no integer between two numbers");
			}
		*/
		//pb06) ÄÄÇ»ÅÍ°¡ ·£´ıÀ¸·Î ¹ß»ıÇÑ ³­¼ö¸¦ ¸ÂÃß´Â °ÔÀÓ
		//		Level 1 : 1~2Áß¿¡ ÇÏ³ªÀÇ ¼ıÀÚ ¸ÂÃß±â
		//		Level 2 : 1~4Áß¿¡ ÇÏ³ªÀÇ ¼ıÀÚ ¸ÂÃá´Ù.
		//		Level 3 : 1~8Áß¿¡ ÇÏ³ªÀÇ ¼ıÀÚ ¸ÂÃá´Ù.
		//		3´Ü°è ¼º°ø½Ã Locky µµÁß¿¡ Æ²¸±½Ã failure Ãâ·Â
		/*
 		if(stepOne() && stepTwo() && stepThree()) {
 			System.out.println("Lucky");
 		}else {
 			System.out.println("Failure");
 		}
		*/
		//pb07) Áö¼öºĞÆ÷´Â ÁÖ¾îÁø ½ÃÁ¡À¸·Î Æ¯Á¤ »ç°ÇÀÌ ÀÏ¾î³¯ ¶§±îÁö °É¸° ½Ã°£À» ÃøÁ¤ÇÏ´Â È®·üºĞÆ÷
		//		¾î´À ½Ä´ç¿¡ ¼Õ´ÔÀÌ ÇÑ½Ã°£¿¡ 20¸í ¿Â´Ù¸é ¼Õ´ÔµéÀÌ µµÂøÇÏ´Â ½Ã°£ÀÇ °£°İÀº Æò±ÕÀÌ 1/20½Ã°£ Áï 5ºĞÀÎ Áö¼öºĞÆ÷¸¦ µû¸¥´Ù(-log u/n)
		//		t =0À» ±âÁØÀ¸·Î u=1/20ÀÎ Áö¼öºĞÆ÷·Î ¹ß»ıÇÑ ´Ù¼¸°³ÀÇ µµÂø°£°İ ³­¼ö°¡ 4.7 1.5 7.8 5.2 6.1 ÀÌ¶ó¸é °í°´ÀÌ 4.7 6.2 14.0 19.2 25.3µµÂøÇßÀ½À» ÀÇ¹Ì
		//		Áö¼ö ºĞÆ÷¸¦ ÀÔ·Â¹Ş°í Áö¼öºĞÆ÷¿¡ µû¸£´Â µµÂø°£°İ 10°³ ¹ß»ı½ÃÅ²ÈÄ ½Ã°£ 0 ±âÁØÀ¸·Î °í°´ÀÌ µµÂøÇÑ ½Ã°¢À» ±¸ÇÏ´Â ÇÁ·Î±×·¥ ÀÛ¼º
		/*
			Random rd = new Random();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the lambda : ");
			double lambda = sc.nextDouble();
			for(int i=0;i<10;++i) {
				double d = rd.nextDouble();
				System.out.println(-Math.log(d)/lambda);
			}
		*/
		//pb08) °¡°è µµÂøÇÏ´Â ¼Õ´ÔÀ» ½Ã°£ °£°İ = 1/20 , ¹ö°Å ¸¸µå´Â ¼Óµµ Æò±Õ 3ºĞ , ÇÑ½Ã°£ µ¿¾È ¼Õ´ÔµéÀÇ ÃÑ ±â´Ù¸° ½Ã°£À» ±¸ÇÏ´Â ½Ã¹Ä·¹ÀÌ¼Ç ÇÁ·Î±×·¥ ÀÛ¼º
		Random rd = new Random();
		double lamda = 1/20;
		double time = 0;
		double wating = 0;
		ArrayList<Double> arr = new ArrayList<Double>();
		ArrayList<Double> lev = new ArrayList<Double>();
		time = time +exp_randnum(lamda);
		while(time<=3600.0) {
			arr.add(time);
			lev.add(time +rd.nextDouble()*2+2);
			if(lev.get(lev.size()-1)>3600) {
				break;
			}
			time = time +exp_randnum(lamda);
		}
		for(int i=0;i<arr.size();++i) {
			Double max_lev=0.0;
			for(int j = 0 ;j<i;++j) {
				if(arr.get(i)<lev.get(j)) {
					max_lev=lev.get(j);
				}
			}
			wating += max_lev -arr.get(i);
		}
		System.out.println(wating);
	} 
	public static double exp_randnum(double lamda) {
		Random rd = new Random();
		return (-Math.log(rd.nextDouble())/lamda);
	}
	/* pb03
	public static int oddNum() {
		Random r = new Random();
		int num = r.nextInt(100);
		while(num%2 == 0) {
			num = r.nextInt(100);
		}
		return num;
	}
	public static int EvenNum() {
		Random r = new Random();
		int num = r.nextInt(100);
		while(num%2 != 0) {
			num = r.nextInt(100);
		}
		return num;
	}
	*/
	/* pb04
	public static int rBinom(int n,double p) {
		Random r = new Random();
		int count = 0;
		for(int i=1;i<=n;++i) {
			if(r.nextDouble() > p) {
				count++;
			}
		}
		return count;
	}
	*/
	/* pb06
	public static boolean stepOne() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Level1 (1~2) : ");
		int rand = rd.nextInt(2)+1;
		boolean result = rand != sc.nextInt() ? false : true;
		if(result) {
			System.out.println("Correct");
		}else {
			System.out.println("Answer is : "+ rand);
		}
		return result;
	}
	public static boolean stepTwo() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Level2 (1~4) : ");
		int rand = rd.nextInt(4)+1;
		boolean result = rand != sc.nextInt() ? false : true;
		if(result) {
			System.out.println("Correct");
		}else {
			System.out.println("Answer is : "+ rand);
		}
		return result;
	}
	public static boolean stepThree() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Level1 (1~8) : ");
		int rand = rd.nextInt(8)+1;
		boolean result = rand != sc.nextInt() ? false : true;
		if(result) {
			System.out.println("Correct");
		}else {
			System.out.println("Answer is : "+ rand);
		}
		return result;
	}
	*/
}
