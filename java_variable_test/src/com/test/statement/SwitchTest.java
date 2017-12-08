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

			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("[1]로그인");
			System.out.println("[2]회원가입");
			System.out.println("[3]아이디/패스워드 찿기");
			System.out.println("[4]종료");
			System.out.println("메뉴를 선택하세요");

			String menu = scan.nextLine();

			switch (menu) {
			case "1":
				msg = "로그인 선택하셧습니다.";
				System.out.println(msg);
				System.out.print("아이디: ");
				idch = scan.nextLine();
				
				System.out.print("패스워드: ");
				pwdch = scan.nextLine();
				for (int a = 0; a < i; a++) {
					if (idch.equals(idArray[a])) {

						if (pwdch.equals(pwdArray[a])) {
							System.out.println("로그인의 성공하셧 습니다");
							break;
						} else {
							System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
						}
					} else {
						if(a==i-1){
							System.out.println("아이디 또는비밀번호가 틀렷습니다.");
							
						}
					}
				}
				break;
			case "2":
				msg = "회원가입 을선택하셧습니다";
				System.out.println(msg);
				// for()
				System.out.print("아이디 :");
				idArray[i] = scan.nextLine();

				System.out.print("패스워드 :");
				pwdArray[i] = scan.nextLine();
				i++;
				break;
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
