package com.test.variable;

import java.util.Scanner;

public class QizeVariable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int kor; // kor ������ int�� ���� 90 �ʱ�ȭ
		int eng; // eng ������ int�� ���� 80 �ʱ�ȭ
		int math; // math ������ int�� ���� 100 �ʱ�ȭ
        /* catch(NumberFormatException e) <- ����ó��*/
		
		
		
		// �ԷµǴ°��� 0~100������ ������ �����ϵ���
		// '����Ͻðڽ��ϱ�?(y/n)'�޼����� ����ϰ�
		// 'n'�ϋ����� �ݺ�
		boolean x=true;
		while (x) {
			System.out.print("�������� : ");
			kor = Integer.parseInt(scan.nextLine());
			if (kor > 100 || kor < 0) {
				System.out.println("0~100���� ���ڸ� �Է��ϼ���");
				return;
			}
			System.out.print("�������� : ");
			eng = Integer.parseInt(scan.nextLine());
			if (eng > 100 || eng < 0) {
				System.out.println("100�� �Ѵ´� �Ѥ�");
				return;
			}
			System.out.print("�������� : ");
			math = Integer.parseInt(scan.nextLine());
			if (math > 100 || math < 0) {
				System.out.println("100�� �Ѵ´٤Ѥ�");
				return;
			}

			int total = kor + eng + math; // ���� kor,eng,math �� ���Ѱ��� ����total �ʱ�ȭ

			float avg = total / 3; // total ���� ������3���ؼ� ���� avg���� �ʱ�ȭ

			System.out.println("����" + total); // �ʱ�ȭ��total�� ���
			System.out.println("���" + avg); // �ʱ�ȭ�� avg�� ���

			// Quiz2)
			// ����� 90�̻��̸� : A
			// ����� 80�� �̻��̸�: B
			// ����� 80�� �̸��̸� : F ���

			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			System.out.println("���� : " + grade);

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
			System.out.println("���� : " + gradeIf);

			System.out.println("���� �Ͻðٽ��ϱ�?(y/n)");
			String hop = scan.nextLine();
			if(!hop.equals("n")){
				x=false;
			}else{
				x=true;
			}
		}
		System.out.println("�����մϴ�^^");

	}

}