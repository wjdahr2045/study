package com.test.array;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {

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

		while (true) {

			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("[1]�α���");
			System.out.println("[2]ȸ������");
			System.out.println("[3]���̵�/�н����� �O��");
			System.out.println("[4]����");
			System.out.println("�޴��� �����ϼ���");

			String menu = scan.nextLine();

			switch (menu) {
			case "1":
				System.out.println("�α��� �����ϼ˽��ϴ�.");
				// System.out.println(msg);
				System.out.print("���̵�: ");
				idch = scan.nextLine();
				int findIndex = -1;
				for (int index = 0; index < i; index++) {
					if (idch.equals(idArray[index])) {
						findIndex = index;
						break;
					}
				}
				if (findIndex > -1) {
					System.out.print("�н����� :");
					pwdch = scan.nextLine();
					if (pwdch.equals(pwdArray[findIndex])) {
						System.out.println("�α��ο� �����ϼ˽��ϴ�./n");
					} else {
						System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
					}
				} else {
					System.out.println("���̵� �������� �Ƚ��ϴ�.");
				}
				break;

			case "2":
				System.out.println("ȸ������ �������ϼ˽��ϴ�");

				System.out.print("���̵� :");
				idch = scan.nextLine();
				if (i >= idArray.length) {
					String[] temp = new String[idArray.length + 20];
					for (int a = 0; a < idArray.length; a++) {
						temp[i] = idArray[i];
					}
					idArray = temp;
				}

				boolean exsistID = false;

				for (int a = 0; a < idArray.length; a++) {
					if (idch.equals(idArray[a])) {
						exsistID = true;
					}
				}
				if (!exsistID) {
					System.out.println("�н����� : ");
					pwdch = scan.nextLine();
					idArray[i] = idch;
					pwdArray[i] = pwdch;
				} else {
					System.out.println("�ߺ��� ���̵� �Դϴ�.");
				}

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
