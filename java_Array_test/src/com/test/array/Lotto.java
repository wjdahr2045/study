package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		System.out.println("출력할 세트를 입력하세요");
		int setNum=Integer.parseInt(new Scanner(System.in).nextLine());
		for(int k=0; k<setNum;k++){
			
		int lottoNum[] = new int[45];
		for(int i=0;i<lottoNum.length;i++){// length 하나 적은것
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
		//lottoNum의 0 부터 5까지의 값을 가져와
        //Arrays의 형태로  가져온다
		//
		
		Arrays.sort(output);
		System.out.println(Arrays.toString(output));
		//toString 의 메서드 반복문을 만들어주는것
		}
		
	}
		
}	
		
	
			
		
		
	


