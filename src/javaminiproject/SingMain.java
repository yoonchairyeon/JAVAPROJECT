package javaminiproject;

import java.util.Scanner;

import Member.MemberImpl;
import Menu.MenuImpl;
import Seat.SeatImpl;


public class SingMain extends Thread{
	
	public static void main(String[] args) {
		
		MemberImpl mm = new MemberImpl();
		SeatImpl sm = new SeatImpl();
		MenuImpl mm1 = new MenuImpl();

		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		/*try {
			sleep(100);
		} catch (Exception e) {
		}
		while(cnt<1) {
		String[] a = {""
				, " _    _  _____  _      _____  _____ ___  ___ _____   _____  _____ "
				, "| |  | ||  ___|| |    /  __ \\|  _  ||  \\/  ||  ___| |_   _||  _  |"
				, "| |  | || |__  | |    | /  \\/| | | || .  . || |__     | |  | | | |"
				, "| |/\\| ||  __| | |    | |    | | | || |\\/| ||  __|    | |  | | | |"
				, "\\  /\\  /| |___ | |____| \\__/\\\\ \\_/ /| |  | || |___    | |  \\ \\_/ /"
				, " \\/  \\/ \\____/ \\_____/ \\____/ \\___/ \\_|  |_/\\____/    \\_/   \\___/ "
				, "                                                                  "
				, " _____  _____  _____  _   _   _____  _____  _   _  _____  _____  _   _  _____  ______  _____  _____ ___  ___"
				, "/  __ \\|  _  ||_   _|| \\ | | /  ___||_   _|| \\ | ||  __ \\|_   _|| \\ | ||  __ \\ | ___ \\|  _  ||  _  ||  \\/  |"
				, "| /  \\/| | | |  | |  |  \\| | \\ `--.   | |  |  \\| || |  \\/  | |  |  \\| || |  \\/ | |_/ /| | | || | | || .  . |"
				, "| |    | | | |  | |  | . ` |  `--. \\  | |  | . ` || | __   | |  | . ` || | __  |    / | | | || | | || |\\/| |"
				, "| \\__/\\\\ \\_/ / _| |_ | |\\  | /\\__/ / _| |_ | |\\  || |_\\ \\ _| |_ | |\\  || |_\\ \\ | |\\ \\ \\ \\_/ /\\ \\_/ /| |  | |"
				, " \\____/ \\___/  \\___/ \\_| \\_/ \\____/  \\___/ \\_| \\_/ \\____/ \\___/ \\_| \\_/ \\____/ \\_| \\_| \\___/  \\___/ \\_|  |_/"
				, "                                                                                                            "
				, "                                                                                                            "
				, ""};
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
			try {
				sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} cnt++;
		try {
			sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}*/
		int ch;
		while(true) {
			try {
				do {
					System.out.println(
							" ＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿\n"
							+ "|　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿      ＿＿＿＿＿＿　     |\n"
							+ "| 　　　｜1.회원가입|　 　｜ 2.좌석　｜ 　 | 3.매점 |　 　  | 4.종료 |      |\n"
							+ "|　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣　　　 　￣￣￣￣￣￣      |\n"
							+ "￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣	\n"
							+ "");
					System.out.print("메뉴를 선택해주세요! ");
					ch = sc.nextInt();
					
				}while(ch<1);
				switch(ch) {
				case 1: try {
					mm.memmenu();
					 break;
				} catch (Exception e) {
				}
				case 2: 
					try {
						sm.smain();
						break;
					} catch (Exception e) {
					}
				case 3:
					try {
						mm1.mmmain();
						break;
					} catch (Exception e) {
					}
					
				case 4: 
					System.out.println("코인노래방 서비스를 종료합니다.");
					cnt = 0;
					try {
						sleep(100);
					} catch (Exception e) {
					}
					while(cnt<1) {
						String[] bye = {"∧,,∧"
								, "( 'ω' )つ 　다음에"
								, "（m9 ＼ 　　   또 "
								, "　 ＼　 ＼ 　　만나요!"
								, "　 　 ) ) ＼"
								, "　 ／／ ＼ ＼"
								, "　 (＿） 　 (＿)"
								, ""};
						for(int i =0; i<bye.length; i++) {
							System.out.println(bye[i]);
							try {
								sleep(150);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						} cnt++;
						try {
							sleep(800);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					break;
				default:
					System.out.println("다시 골라주세요!");
				}
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			System.exit(0);
	}
		
	}
	
}


