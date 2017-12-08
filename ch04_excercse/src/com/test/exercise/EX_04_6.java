package com.test.exercise;

import java.util.Scanner;

public class EX_04_6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int sum=Integer.parseInt(scan.nextLine());
		
		sumResult(sum);
		
		
		
		for(int num = 1; num<7;num++){
			if(sum-num<0){
				System.out.println("("+ num + ","+(sum-num)+")");
				
			}
		}
	}

	public static void sumResult(int sum){
		for(int num1= 1;num1<7;num1++){
			for(int num2=1;num2<7;num2++){
				if(num1+num2==6){
					System.out.println("("+ num1 + ","+num2+")");
}



			}
		}
	}
}