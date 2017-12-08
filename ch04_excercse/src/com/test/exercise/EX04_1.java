package com.test.exercise;

public class EX04_1 {

	public static void main(String[] args) {
		//4-1 1
		int x= 11;
		System.out.println(x>10 && x<20);
	    //4-1 2
		char ch =' ' ;
		System.out.println(!(ch == ' ' || ch == '\t'));
		//4-1 3
		System.out.println(ch=='x' || ch=='X');
		//4-1 4
		System.out.println(ch>='0' && ch <='9');
		//4-1 5
		System.out.println((ch >= 'a' && ch<='z') || (ch>='A' && ch<='Z'));
		//4-1 6
		int year = 2000;
		System.out.println(((year%400)==0) || ((year%4)==0 && (year%100)!=0));
		//4-1 7
		boolean powerOn = false;
		System.out.println(!powerOn);
		//4-1 8
		String str="yes";
		System.out.println(str.equals("yes"));// 문자열 비교는 equals 를쓴다
		
		/*for(int i=0;i<20;i++){
			i=(i%2);
			i=(i%4);
		}*/
		int total = 0;
		for(int i = 2; i<=9; i++){
			//System.out.println("단입니다");
			for(int y=1; y<=3;y++){
				System.out.println(i+"x"+y+"="+i*y);
			}
		}
		

	}

}
