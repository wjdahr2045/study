package com.test.statement;

import java.util.Scanner;

public class statementTest {

	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		
	   Scanner scan = new Scanner(System.in);
	   System.out.print("����");
	   kor = Integer.parseInt(scan.nextLine());
	   System.out.print("����");
	   eng = Integer.parseInt(scan.nextLine());
	   System.out.print("����");
	   math = Integer.parseInt(scan.nextLine());
	   
	   float avg=(kor+eng+math)/3f;
	   String grade="";
	   switch((int)(avg/10)){
	   case 10:case 9:
		   grade="A";
		   break;
	   case 8:
		   grade="B";
		   break;
	   case 7:
		   grade="C";
		   break;
	   case 6:
		   grade="D";
		   break;
	   default:
		   grade="F";
		 
	   }
	   System.out.println("��� : " + avg);
	   System.out.println("���� : " + grade);
	   
	}

}
