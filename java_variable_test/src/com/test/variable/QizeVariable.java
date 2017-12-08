package com.test.variable;

import java.util.Scanner;

public class QizeVariable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int kor; // kor 변수에 int형 정수 90 초기화
		int eng; // eng 변수에 int형 정수 80 초기화
		int math; // math 변수에 int형 정수 100 초기화
        /* catch(NumberFormatException e) <- 사전처리*/
		
		
		
		// 입력되는값은 0~100사이의 정수만 가능하도록
		// '계속하시겠습니까?(y/n)'메세지를 출력하고
		// 'n'일떄까지 반복
		boolean x=true;
		while (x) {
			System.out.print("국어점수 : ");
			kor = Integer.parseInt(scan.nextLine());
			if (kor > 100 || kor < 0) {
				System.out.println("0~100사이 숫자만 입력하세요");
				return;
			}
			System.out.print("영어점수 : ");
			eng = Integer.parseInt(scan.nextLine());
			if (eng > 100 || eng < 0) {
				System.out.println("100이 넘는다 ㅡㅡ");
				return;
			}
			System.out.print("수학점수 : ");
			math = Integer.parseInt(scan.nextLine());
			if (math > 100 || math < 0) {
				System.out.println("100이 넘는다ㅡㅡ");
				return;
			}

			int total = kor + eng + math; // 변수 kor,eng,math 의 더한값을 변수total 초기화

			float avg = total / 3; // total 값을 나누기3을해서 변수 avg값에 초기화

			System.out.println("총정" + total); // 초기화된total값 출력
			System.out.println("평균" + avg); // 초기화된 avg값 출력

			// Quiz2)
			// 평균이 90이상이면 : A
			// 평균이 80점 이상이면: B
			// 평균이 80점 미만이면 : F 출력

			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			System.out.println("학점 : " + grade);

			String gradeIf = "";
			if (avg >= 90) {
				gradeIf = "A";
				if (avg >= 95) {
					gradeIf = gradeIf + "+";
				}
			} else if (avg >= 80) {
				gradeIf = "B";
				if (avg >= 85) {
					gradeIf = gradeIf + "+";
				}
			} else {
				gradeIf = "F";
			}
			System.out.println("학점 : " + gradeIf);

			System.out.println("종료 하시겟습니까?(y/n)");
			String hop = scan.nextLine();
			if(!hop.equals("n")){
				x=false;
			}else{
				x=true;
			}
		}
		System.out.println("종료합니다^^");

	}

}