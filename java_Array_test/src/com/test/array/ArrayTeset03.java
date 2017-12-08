package com.test.array;

import java.util.Scanner;

public class ArrayTeset03 {

	public static void main(String[] args) {
		
		String[][] studentArray=new String[3][4]; 
		// string studentArray의 대한 배열
		Scanner scan=new Scanner(System.in);
		//입력
		for(int num=1;num<studentArray.length+1;num++){
			System.out.println(num +"번째 학생");
		    System.out.println("이름 : ");
		    studentArray[num-1][0]=scan.nextLine();
		    System.out.println("국어: " );
		    studentArray[num-1][1]=scan.nextLine();
		    System.out.println("영어 : ");
		    studentArray[num-1][2]=scan.nextLine();
		    System.out.println("수학 : ");
		    studentArray[num-1][3]=scan.nextLine();
		    
		}
		
		//출력
		int total=0;
		for(int num=1;num<studentArray.length+1;num++){
			total=Integer.parseInt(studentArray[num-1][1])
					+Integer.parseInt(studentArray[num-1][2])
					+Integer.parseInt(studentArray[num-1][3]);
			System.out.println(num+"번"+studentArray[num-1][0]
					+"평균 : "+ (total*1f/studentArray[num-1].length-1));
			
		}

		
	}

}
