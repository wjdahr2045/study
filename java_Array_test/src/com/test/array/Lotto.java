package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		System.out.println("����� ��Ʈ�� �Է��ϼ���");
		int setNum=Integer.parseInt(new Scanner(System.in).nextLine());
		for(int k=0; k<setNum;k++){
			
		int lottoNum[] = new int[45];
		for(int i=0;i<lottoNum.length;i++){// length �ϳ� ������
			lottoNum[i]=i+1;
		}
		int tempNum=0;
		int changeIndex=0;
		for(int i=0;i<lottoNum.length*2;i++){
			changeIndex=(int)(Math.random()*lottoNum.length);
			tempNum=lottoNum[changeIndex];
			lottoNum[changeIndex]=lottoNum[0];
			lottoNum[0]=tempNum;
		}
		int output[] = new int[6];
		output=Arrays.copyOfRange(lottoNum,0,6);
		//lottoNum�� 0 ���� 5������ ���� ������
        //Arrays�� ���·�  �����´�
		//
		
		Arrays.sort(output);
		System.out.println(Arrays.toString(output));
		//toString �� �޼��� �ݺ����� ������ִ°�
		}
		
	}
		
}	
		
	
			
		
		
	


