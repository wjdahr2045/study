package com.test.statement;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		boolean x = true;
		Scanner scan = new Scanner(System.in);

		String msg = "";
		String[] idArray = new String[100];
		idArray[0] = "mimi";
		idArray[1] = "mama";
		idArray[2] = "mumu";

		String[] pwdArray = new String[100];
		pwdArray[0] = "mimi";
		pwdArray[1] = "mama";
		pwdArray[2] = "mumu";
		String id = "";
		int i = 3;
		String idch = "";
		String pwdch = "";

		while (x) {

			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("[1]�α���");
			System.out.println("[2]ȸ������");
			System.out.println("[3]���̵�/�н����� �O��");
			System.out.println("[4]����");
			System.out.println("�޴��� �����ϼ���");

			String menu = scan.nextLine();

			switch (menu) {
			case "1":
				msg = "�α��� �����ϼ˽��ϴ�.";
				System.out.println(msg);
				System.out.print("���̵�: ");
				idch = scan.nextLine();
				
				System.out.print("�н�����: ");
				pwdch = scan.nextLine();
				for (int a = 0; a < i; a++) {
					if (idch.equals(idArray[a])) {

						if (pwdch.equals(pwdArray[a])) {
							System.out.println("�α����� �����ϼ� ���ϴ�");
							break;
						} else {
							System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						}
					} else {
						if(a==i-1){
							System.out.println("���̵� �Ǵº�й�ȣ�� Ʋ�ǽ��ϴ�.");
							
						}
					}
				}
				break;
			case "2":
				msg = "ȸ������ �������ϼ˽��ϴ�";
				System.out.println(msg);
				// for()
				System.out.print("���̵� :");
				idArray[i] = scan.nextLine();

				System.out.print("�н����� :");
				pwdArray[i] = scan.nextLine();
				i++;
				break;
			case "3":
				msg = "���̵�/�н����� �O�⸦ �����ϼ˽��ϴ�.";
				System.out.println(msg);
				break;
			case "4":
				msg = "���α׷��� �����մϴ�..";
				System.out.println(msg);

				return;
			default:
				msg = "�޴� ������ �ùٸ��� �ʽ��ϴ�.";

			}

		}
	}

}
