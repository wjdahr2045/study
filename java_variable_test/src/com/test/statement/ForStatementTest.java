package com.test.statement;

import java.util.Scanner;

public class ForStatementTest {

	public static void main(String[] args) {
		int sum=0;
		int sumPlus=0;
		for(int i=1;i<11;i++){
			sum+=i;
			sumPlus+=sum;
			
		 }
        System.out.println(sum);
        //1+(1+2)+(1+2+3)+.....+(1+2+3+4+5+6+7+8+9+10)
        
        Scanner scan = new Scanner(System.in);
        while(!scan.nextLine().equals("y")){
        	System.out.println("y�� ������ ������ �ݺ�.");
        }
	}

}
