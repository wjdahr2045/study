package com.test.variable;

public class Quiz1 {

	public static void main(String[] args) {

		int kor = 10;
		int eng = 85;
		int math = 85;

		float total = kor + eng + (math * 1.0f);

		float avg = total / 3;

		System.out.println("����" + total);
		System.out.println("���" + avg);

		System.out.println("��� " + ((avg >= 90) ? "A" : ((avg >= 80) ? "B" : "F")));
		// Quiz2)
		// ����� 90�̻��̸� : A
		// ����� 80�� �̻��̸�: B
		// ����� 80�� �̸��̸� : F ���

		// 1234.56789 �� ���� �Ҽ��� ��°¥������ �ݿø��Ͻÿ�

	}

}
