import java.util.Scanner;

public class Gawibawibo {


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
						System.out.println("[1 묵], [2 찌], [3 빠] ");
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
				int computer = (int) (Math.random() * 5);

				int computer2 = computer;

				switch (use2) {
				case 1:
					System.out.println(((use2 == computer2) ? " 비겻다 " : (((use2 > computer2) ? "니 이김" : "졌어 수고링~"))));
					break;
				case 2:
					System.out.println((use2 == computer2) ? " 비겻다 " : (((use2 > computer2) ? "님 이김" : "졌어 수고링~")));
					break;
				case 3:
					System.out.println((use2 == computer2) ? " 비겻다 " : (((use2 > computer2) ? " 님 이김" : "졌어 수고링~")));
					break;
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

