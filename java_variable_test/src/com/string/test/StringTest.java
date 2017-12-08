package com.string.test;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class StringTest {

	public static void main(String[] args) {
		
		String msg="반갑습니다.";
		System.out.println(msg);
		System.out.println("문자열길이 : " + msg.length());
		System.out.println("문자열비교 : " + msg.equals("바바바"));
		System.out.println("문자탐색 : "+ msg.contains("반갑"));
		System.out.println("비교 인덱스 반환" + msg.indexOf("니다"));
		System.out.println("index의 글자 반환 : " +msg.charAt(2));// 인덱스 글자 반환
		System.out.println("빈문자열 확인 : " + msg.isEmpty()); //빈 문자열 확인
		System.out.println("문자열 교체 : " + msg.replace("반갑습", "감사함"));// 문자열 교체
		System.out.println("문자열 잘라내기 : " + msg.substring(0,3));//0부터3이전까지 잘라낸걸 출력
		System.out.println("대문자 변환 : "+ msg.toUpperCase());
		System.out.println("소문자 변환 : "+ msg.toLowerCase());
		
		boolean isNumber=true;//is = 무엇이냐
		msg="";
		for(int index=0; index<msg.length();index++){
			System.out.println(msg.charAt(index));
			char ch=msg.charAt(index);
			if(!(ch>=48 && ch<=57)){
				isNumber=false;
			}
			
		}
		
		System.out.println(isNumber?"숫자":"숫자가아님");
	}

}
