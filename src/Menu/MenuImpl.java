package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javaminiproject.SingMain;

public class MenuImpl extends Thread implements Menu{

	private List<MenuVO> lists = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	@Override
	public void inoutput() throws Exception {
		
		MenuVO vo = new MenuVO();
		
		System.out.println(""
				+ "___  ___ _____  _   _  _   _ \n"
				+ "|  \\/  ||  ___|| \\ | || | | |\n"
				+ "| .  . || |__  |  \\| || | | |\n"
				+ "| |\\/| ||  __| | . ` || | | |\n"
				+ "| |  | || |___ | |\\  || |_| |\n"
				+ "\\_|  |_/\\____/ \\_| \\_/ \\___/ \n"
				+ "                             "
				+ "                             "
				+ "");
		
		do {
			System.out.println("1.생수 : 1,000원 \n"
					+ "2.콜라 : 1,900원\n"
					+ "3.사이다 : 2,000원\n"
					+ "4.맥주 : 5,000원 \n"
					+ "5.막걸리 : 4,000원 ");
			System.out.println("======================================");

			System.out.print("메뉴를 선택해주세요 \n▶ ");
			vo.setMenu(sc.nextInt());
			if(vo.getMenu() >=6) {
				System.out.println("다시 입력해주세요! \n▶ ");
			}
		}while(vo.getMenu()>=6);
		
		System.out.print("주문할 갯수를 적어주세요 \n▶  ");
		vo.setCount(sc.nextInt());
		int cnt = 0;
		switch(vo.getMenu()) {
			case 1 :
				try {
					sleep(200);
				} catch (Exception e) {
					System.out.println(e.toString());
				}
				while(cnt<1) {
					String[] drink = {""
							," _    _   ___   _____  _____ ______ "
							, "| |  | | / _ \\ |_   _||  ___|| ___ \\"
							, "| |  | |/ /_\\ \\  | |  | |__  | |_/ /"
							, "| |/\\| ||  _  |  | |  |  __| |    / "
							, "\\  /\\  /| | | |  | |  | |___ | |\\ \\ "
							, " \\/  \\/ \\_| |_/  \\_/  \\____/ \\_| \\_|"
							, "                                    "
							, "                                    "};
					for(int i =0; i<drink.length; i++) {
						System.out.println(drink[i]);
						sleep(150);
					} cnt++;
					sleep(800);
					System.out.println("당신이 지불해야 금액은 " + (vo.getCount()*1000) + "입니다!");
					System.out.println("======================================");
				}
				
			case 2 : 
				try {
					sleep(200);
				} catch (Exception e) {
					System.out.println(e.toString());
				}
				while(cnt<1) {
					String[] drink = {"\n"
							," _____  _____  _   __ _____ "
							, "/  __ \\|  _  || | / /|  ___|"
							, "| /  \\/| | | || |/ / | |__  "
							, "| |    | | | ||    \\ |  __| "
							, "| \\__/\\\\ \\_/ /| |\\  \\| |___ "
							, " \\____/ \\___/ \\_| \\_/\\____/ "
							, "                            "
							, "                            "
							, ""};

					for(int i =0; i<drink.length; i++) {
						System.out.println(drink[i]);
						sleep(150);
					} cnt++;
					sleep(800);
					System.out.println("당신이 지불해야 금액은 " + (vo.getCount()*1900) + "입니다!");
					System.out.println("======================================");
				}
			
			case 3 :
				try {
					sleep(200);
				} catch (Exception e) {
					System.out.println(e.toString());
				}
				while(cnt<1) {
					String[] drink = {""
							, " _____ ______ ______  _____  _____  _____ "
							, "/  ___|| ___ \\| ___ \\|_   _||_   _||  ___|"
							, "\\ `--. | |_/ /| |_/ /  | |    | |  | |__  "
							, " `--. \\|  __/ |    /   | |    | |  |  __| "
							, "/\\__/ /| |    | |\\ \\  _| |_   | |  | |___ "
							, "\\____/ \\_|    \\_| \\_| \\___/   \\_/  \\____/ "
							, "                                          "
							, "                                          "};

					for(int i =0; i<drink.length; i++) {
						System.out.println(drink[i]);
						sleep(150);
					} cnt++;
					sleep(300);
					System.out.println("당신이 지불해야 금액은 " + (vo.getCount()*2000) + "입니다!");
					System.out.println("======================================");
				}
			case 4 :
				try {
					sleep(200);
				} catch (Exception e) {
					System.out.println(e.toString());
				}
				while(cnt<1) {
					String[] drink = {""
							, "______  _____  _____ ______ "
							, "| ___ \\|  ___||  ___|| ___ \\"
							, "| |_/ /| |__  | |__  | |_/ /"
							, "| ___ \\|  __| |  __| |    / "
							, "| |_/ /| |___ | |___ | |\\ \\ "
							, "\\____/ \\____/ \\____/ \\_| \\_|"
							, "                            "
							, "                            "};

					for(int i =0; i<drink.length; i++) {
						System.out.println(drink[i]);
						sleep(150);
					} cnt++;
					sleep(600);
					System.out.println("당신이 지불해야 금액은 " + (vo.getCount()*5000) + "입니다!");
					System.out.println("======================================");
				}
			case 5 :
				try {
					sleep(200);
				} catch (Exception e) {
					System.out.println(e.toString());
				}
				while(cnt<1) {
					String[] drink = {""
							, "___  ___  ___   _   __ _____  _____  _____  _      _      _____ "
							, "|  \\/  | / _ \\ | | / /|  __ \\|  ___||  _  || |    | |    |_   _|"
							, "| .  . |/ /_\\ \\| |/ / | |  \\/| |__  | | | || |    | |      | |  "
							, "| |\\/| ||  _  ||    \\ | | __ |  __| | | | || |    | |      | |  "
							, "| |  | || | | || |\\  \\| |_\\ \\| |___ \\ \\_/ /| |____| |____ _| |_ "
							, "\\_|  |_/\\_| |_/\\_| \\_/ \\____/\\____/  \\___/ \\_____/\\_____/ \\___/ "
							, "                                                                "
							, "                                                                "};

					for(int i =0; i<drink.length; i++) {
						System.out.println(drink[i]);
						sleep(150);
					} cnt++;
					sleep(600);
					System.out.println("당신이 지불해야 금액은 " + (vo.getCount()*4000) + "입니다!");
					System.out.println("======================================");
				}
			default :
				try {
					sleep(300);
					
				} catch (Exception e) {
					System.out.println("다시 입력해주세요!");
				}
				break;
		}
}
	//할인권 이용시 천원 할인해주기 
	
	@Override
	public void halin() throws Exception {
		
		MenuVO vo = new MenuVO();
		
		String[] drink = {"\n"
				+ " _    _   ___   _____  _____ ______ \n"
				+ "| |  | | / _ \\ |_   _||  ___|| ___ \\\n"
				+ "| |  | |/ /_\\ \\  | |  | |__  | |_/ /\n"
				+ "| |/\\| ||  _  |  | |  |  __| |    / \n"
				+ "\\  /\\  /| | | |  | |  | |___ | |\\ \\ \n"
				+ " \\/  \\/ \\_| |_/  \\_/  \\____/ \\_| \\_|\n"
				+ "                                    \n"
				+ "                                    \n"
				+ "", "\n"
				+ " _____  _____  _   __ _____ \n"
				+ "/  __ \\|  _  || | / /|  ___|\n"
				+ "| /  \\/| | | || |/ / | |__  \n"
				+ "| |    | | | ||    \\ |  __| \n"
				+ "| \\__/\\\\ \\_/ /| |\\  \\| |___ \n"
				+ " \\____/ \\___/ \\_| \\_/\\____/ \n"
				+ "                            \n"
				+ "                            \n"
				+ "", 
				"\n"
				+ " _____ ______ ______  _____  _____  _____ \n"
				+ "/  ___|| ___ \\| ___ \\|_   _||_   _||  ___|\n"
				+ "\\ `--. | |_/ /| |_/ /  | |    | |  | |__  \n"
				+ " `--. \\|  __/ |    /   | |    | |  |  __| \n"
				+ "/\\__/ /| |    | |\\ \\  _| |_   | |  | |___ \n"
				+ "\\____/ \\_|    \\_| \\_| \\___/   \\_/  \\____/ \n"
				+ "                                          \n"
				+ "                                          \n"
				+ "", 
				"\n"
				+ "______  _____  _____ ______ \n"
				+ "| ___ \\|  ___||  ___|| ___ \\\n"
				+ "| |_/ /| |__  | |__  | |_/ /\n"
				+ "| ___ \\|  __| |  __| |    / \n"
				+ "| |_/ /| |___ | |___ | |\\ \\ \n"
				+ "\\____/ \\____/ \\____/ \\_| \\_|\n"
				+ "                            \n"
				+ "                            \n"
				+ "",
				"\n"
				+ "___  ___  ___   _   __ _____  _____  _____  _      _      _____ \n"
				+ "|  \\/  | / _ \\ | | / /|  __ \\|  ___||  _  || |    | |    |_   _|\n"
				+ "| .  . |/ /_\\ \\| |/ / | |  \\/| |__  | | | || |    | |      | |  \n"
				+ "| |\\/| ||  _  ||    \\ | | __ |  __| | | | || |    | |      | |  \n"
				+ "| |  | || | | || |\\  \\| |_\\ \\| |___ \\ \\_/ /| |____| |____ _| |_ \n"
				+ "\\_|  |_/\\_| |_/\\_| \\_/ \\____/\\____/  \\___/ \\_____/\\_____/ \\___/ \n"
				+ "                                                                \n"
				+ "                                                                \n"
				+ ""};
		int rand = drink.length;
		int num[] = {0};
		do {
			System.out.print("할인권을 사용하시겠습니까? \n▶ [Yes/No] "); //YES,NO
			vo.setCoupon(sc.next());
		
			if(vo.getCoupon().equals("Yes")) {
				sleep(400);
				num[0] = rd.nextInt(rand);
				try {
					sleep(500);
					System.out.println(".　　　우\n"
							+ "　　 아\n"
							+ "　　　아\n"
							+ "　　　　아\n"
							+ "　　　　 ㅇ\n"
							+ "　　　　⋌\n"
							+ "　　　 ㅇ\n"
							+ "　　　⋌\n"
							+ "　　　.\n"
							+ "　　　 .\n"
							+ "　 ヽ＼　 /／\n"
							+ "　　　 ,､,､　ﾟ｡\n"
							+ "　 ﾟ　(ﾟﾛﾟ)っ\n"
							+ "　　　(っﾉ\n"
							+ "　　　 `Ｊ\n"
							+ "");
					sleep(500);
					for(int su : num)
						System.out.println(drink[su]);
					sleep(300);
					System.out.println("음료 나왔습니다!");
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			} else if(vo.getCoupon().equals("No")) {
				System.out.println("음료 구매 창으로 넘어가겠습니다.");
				try {
					sleep(800);
					inoutput();
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}else {
				System.out.println("다시 입력해주세요!");
			}
		}while(!vo.getCoupon().equals("Yes"));
		
		
	}

	@Override
	public void mmmain() {
		Menu ob = new MenuImpl();
		int ch = 0;
		do {
			try {
				
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
				
				
				switch(ch) {
				case 1: ob.inoutput(); break;
				case 2: ob.halin(); break;
				case 3: 
					SingMain.main(null);
					break;
				default:
					System.out.println("다시 골라주세요!");
				}
			} catch (Exception e) {
				
			}
			
		}while(ch != 3);
	}
}

