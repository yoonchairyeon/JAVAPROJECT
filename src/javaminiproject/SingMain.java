package javaminiproject;

import java.util.Scanner;

public class SingMain extends Thread{
	public SingMain() {
		
	}
	@Override
	public void run() {
		System.out.println("코인노래방 서비스를 종료합니다.");
		int cnt = 0;
		try {
			sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} cnt++;
			try {
				sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		SingMain si = new SingMain();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n"
				+ " _    _  _____  _      _____  _____ ___  ___ _____   _____  _____ \n"
				+ "| |  | ||  ___|| |    /  __ \\|  _  ||  \\/  ||  ___| |_   _||  _  |\n"
				+ "| |  | || |__  | |    | /  \\/| | | || .  . || |__     | |  | | | |\n"
				+ "| |/\\| ||  __| | |    | |    | | | || |\\/| ||  __|    | |  | | | |\n"
				+ "\\  /\\  /| |___ | |____| \\__/\\\\ \\_/ /| |  | || |___    | |  \\ \\_/ /\n"
				+ " \\/  \\/ \\____/ \\_____/ \\____/ \\___/ \\_|  |_/\\____/    \\_/   \\___/ \n"
				+ "                                                                  \n"
				+ "                                                                  "
				+ "");
		System.out.print("\n"
				+ " _____  _____  _____  _   _   _____  _____  _   _  _____  _____  _   _  _____  ______  _____  _____ ___  ___\n"
				+ "/  __ \\|  _  ||_   _|| \\ | | /  ___||_   _|| \\ | ||  __ \\|_   _|| \\ | ||  __ \\ | ___ \\|  _  ||  _  ||  \\/  |\n"
				+ "| /  \\/| | | |  | |  |  \\| | \\ `--.   | |  |  \\| || |  \\/  | |  |  \\| || |  \\/ | |_/ /| | | || | | || .  . |\n"
				+ "| |    | | | |  | |  | . ` |  `--. \\  | |  | . ` || | __   | |  | . ` || | __  |    / | | | || | | || |\\/| |\n"
				+ "| \\__/\\\\ \\_/ / _| |_ | |\\  | /\\__/ / _| |_ | |\\  || |_\\ \\ _| |_ | |\\  || |_\\ \\ | |\\ \\ \\ \\_/ /\\ \\_/ /| |  | |\n"
				+ " \\____/ \\___/  \\___/ \\_| \\_/ \\____/  \\___/ \\_| \\_/ \\____/ \\___/ \\_| \\_/ \\____/ \\_| \\_| \\___/  \\___/ \\_|  |_/\n"
				+ "                                                                                                            \n"
				+ "                                                                                                            \n"
				+ "");
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
					//System.out.println("1.회원가입 2.좌석선택 3.매점이용 4.종료");
					ch = sc.nextInt();
					
				}while(ch<1);
				switch(ch) {
				case 1: MemberMain.main(null); break;
				case 2: SeatMain.main(null); break;
				case 3:
					MenuMain.main(null); 
					break;
				case 4: 
					si.start();	
					break;
				default:
					System.out.println("다시 골라주세요!");
				}
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			break;
	}
		
	}
	
}


