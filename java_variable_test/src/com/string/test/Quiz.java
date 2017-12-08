package com.string.test;

import java.util.Scanner;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class Quiz {

	public static void main(String[] args) {
		boolean regame=true;
		boolean isNumber = true;
		String use = "xx";
		Scanner scan = new Scanner(System.in);
		System.out.println("게임을 시작합니다 아무키나입력하시오");

		while (regame) {
			System.out.println("★☆★☆★☆★☆ 추억의 !핵꿀잼 가위바위보 게임 ~★☆★☆★☆★☆");

			while (isNumber) {
				for (int index = 0; index < use.length(); index++) {
					System.out.println("내가 뭘냇을까~~?");
					System.out.println("[1 가위], [2 바위], [3 빠] ");
					use = scan.nextLine();
					int in = use.charAt(index);
					   
					if (!(in >= 48 && in <= 57)) {
						System.out.println("숫자가 아닙니다.");
						break;
					}else if(!(0<=Integer.parseInt(use)&&4>=Integer.parseInt(use))){
						System.out.println("1~3숫자를 입력하세요.");
						break;
					}else{
						
						isNumber=false;
					}
				}
			}

			// use의 유효성검사
			// String com="";
			int use2 = Integer.parseInt(use);
			int computer = (int) (Math.random() * 3+1);
			System.out.println(computer);

			int computer2 = computer;

			switch (use2) {
			case 1:
				if(use2==computer){
					System.out.println("비김");
					break;
				}else if(use2<computer&& computer ==2){
					System.out.println("이김");
					break;
				}else if(use2<computer){
					System.out.println("졌다");
					break;
				}
				
				break;
			case 2:
				if(use2==computer){
					System.out.println("비김");
					break;
				}else if(use2<computer&& computer ==3){
					System.out.println("졌다");
					break;
				}else if(use2>computer){
					System.out.println("이김");
					break;
				}
			case 3:
				if(use2==computer){
					System.out.println("비김");
					break;
				}else if(use2>computer&& computer ==1){
					System.out.println("졋음");
					break;
				}else if(use2>computer){
					System.out.println("이김");
					break;
				}
			default:
				use = "메뉴 선택이 올바르지 않습니다.";
				return;
			}
			System.out.println("다시할래? y/n");
			
			
			
			if(scan.nextLine().toUpperCase().equals("N")){
				regame=false;
			}else{
				isNumber=true;//유효성검사 변수 초기화
			}
		}
		System.out.println("END");
	}
}
