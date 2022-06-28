package javaminiproject;

import java.util.Scanner;

public class MenuMain extends Thread{
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Menu ob = new MenuImpl();
		
		int ch;
		
		while(true) {
			try {
				do {
					System.out.println(
							" ＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿\n"
							+ "|     　＿＿＿＿＿＿　　　   　＿＿＿＿＿＿＿＿＿　       　＿＿＿＿＿＿　　   　|\n"
							+ "| 　 　　｜1.구매  |　      ｜ 2.할인권 구매　｜      　｜3.첫 화면 |　　    |\n"
							+ "|　   　　￣￣￣￣￣￣　　　　   ￣￣￣￣￣￣￣￣￣　　　    　￣￣￣￣￣￣　     |\n"
							+ "￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣\n"
							+ "");
					System.out.print("메뉴를 선택해주세요! ");
					ch =sc.nextInt();
					
					System.out.println("======================================");
				}while(ch<1);
				
				switch(ch) {
				case 1: ob.inoutput(); break;
				case 2: ob.halin(); break;
				case 3: SingMain.main(args);
				default:
					System.out.println("다시 골라주세요!");
				}
			} catch (Exception e) {
				
			}
			
		}

	}

	
}
