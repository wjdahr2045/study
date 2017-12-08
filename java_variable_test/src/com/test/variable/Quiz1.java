package com.test.variable;

public class Quiz1 {

	public static void main(String[] args) {

		int kor = 10;
		int eng = 85;
		int math = 85;

		float total = kor + eng + (math * 1.0f);

		float avg = total / 3;

		System.out.println("총정" + total);
		System.out.println("평균" + avg);

		System.out.println("평균 " + ((avg >= 90) ? "A" : ((avg >= 80) ? "B" : "F")));
		// Quiz2)
		// 평균이 90이상이면 : A
		// 평균이 80점 이상이면: B
		// 평균이 80점 미만이면 : F 출력

		// 1234.56789 의 수에 소수점 세째짜리에서 반올림하시오

	}

}
