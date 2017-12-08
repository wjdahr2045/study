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

			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("[1]로그인");
			System.out.println("[2]회원가입");
			System.out.println("[3]아이디/패스워드 찿기");
			System.out.println("[4]종료");
			System.out.println("메뉴를 선택하세요");

			String menu = scan.nextLine();

			switch (menu) {
			case "1":
				System.out.println("로그인 선택하셧습니다.");
				// System.out.println(msg);
				System.out.print("아이디: ");
				idch = scan.nextLine();
				int findIndex = -1;
				for (int index = 0; index < i; index++) {
					if (idch.equals(idArray[index])) {
						findIndex = index;
						break;
					}
				}
				if (findIndex > -1) {
					System.out.print("패스워드 :");
					pwdch = scan.nextLine();
					if (pwdch.equals(pwdArray[findIndex])) {
						System.out.println("로그인에 성공하셧습니다./n");
					} else {
						System.out.println("패스워드가 일치하지 않습니다.");
					}
				} else {
					System.out.println("아이디가 존재하지 안습니다.");
				}
				break;

			case "2":
				System.out.println("회원가입 을선택하셧습니다");

				System.out.print("아이디 :");
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
					System.out.println("패스워드 : ");
					pwdch = scan.nextLine();
					idArray[i] = idch;
					pwdArray[i] = pwdch;
				} else {
					System.out.println("중복된 아이디 입니다.");
				}

			case "3":
				msg = "아이디/패스워드 찿기를 선택하셧습니다.";
				System.out.println(msg);
				break;
			case "4":
				msg = "프로그램을 종료합니다..";
				System.out.println(msg);

				return;
			default:
				msg = "메뉴 선택이 올바르지 않습니다.";

			}

		}
	}

}
