package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTeset04 {

	public static void main(String[] args) {
		int[] number = new int [7];// int �� �迭
		Scanner scan=new Scanner(System.in);
		
		for(int num=0;num <number.length;num++){
			System.out.println((num+1)+"��° ���� :");
			number[num]= Integer.parseInt(scan.nextLine());
			
		}
		Arrays.sort(number);// �ڵ� 

		System.out.println("Max num:" + number[number.length-1]);
		System.out.println("min num" + number[0]);
	}

}
