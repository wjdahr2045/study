import java.util.Scanner;

public class Gawibawibo {


		public static void main(String[] args) {
			boolean regame=true;
			boolean isNumber = true;
			String use = "xx";
			Scanner scan = new Scanner(System.in);
			System.out.println("������ �����մϴ� �ƹ�Ű���Է��Ͻÿ�");

			while (regame) {
				System.out.println("�ڡ١ڡ١ڡ١ڡ� �߾��� !�ٲ��� ���������� ���� ~�ڡ١ڡ١ڡ١ڡ�");

				while (isNumber) {
					for (int index = 0; index < use.length(); index++) {
						System.out.println("���� ��������~~?");
						System.out.println("[1 ��], [2 ��], [3 ��] ");
						use = scan.nextLine();
						int in = use.charAt(index);
						   
						if (!(in >= 48 && in <= 57)) {
							System.out.println("���ڰ� �ƴմϴ�.");
							break;
						}else if(!(0<=Integer.parseInt(use)&&4>=Integer.parseInt(use))){
							System.out.println("1~3���ڸ� �Է��ϼ���.");
							break;
						}else{
							
							isNumber=false;
						}
					}
				}

				// use�� ��ȿ���˻�
				// String com="";
				int use2 = Integer.parseInt(use);
				int computer = (int) (Math.random() * 5);

				int computer2 = computer;

				switch (use2) {
				case 1:
					System.out.println(((use2 == computer2) ? " ���� " : (((use2 > computer2) ? "�� �̱�" : "���� ����~"))));
					break;
				case 2:
					System.out.println((use2 == computer2) ? " ���� " : (((use2 > computer2) ? "�� �̱�" : "���� ����~")));
					break;
				case 3:
					System.out.println((use2 == computer2) ? " ���� " : (((use2 > computer2) ? " �� �̱�" : "���� ����~")));
					break;
				default:
					use = "�޴� ������ �ùٸ��� �ʽ��ϴ�.";
					return;
				}
				System.out.println("�ٽ��ҷ�? y/n");
				
				
				
				if(scan.nextLine().toUpperCase().equals("N")){
					regame=false;
				}else{
					isNumber=true;//��ȿ���˻� ���� �ʱ�ȭ
				}
			}
			System.out.println("END");
		}
	}

