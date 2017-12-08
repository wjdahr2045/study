package com.test.exercise;

public class EX04_2 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int num=1;num<21;num++){
			
			if(num%2!=0 && num%3!=0){
				sum+=num;
		    }
	    }
	   System.out.println(sum);
	   
			

	}

}
