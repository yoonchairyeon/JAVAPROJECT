package javaminiproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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

			System.out.print("메뉴를 선택해주세요 : ");
			vo.setMenu(sc.nextInt());
			if(vo.getMenu() >=6) {
				System.out.println("다시 입력해주세요!");
			}
		}while(vo.getMenu()>=6);
		
		System.out.print("주문할 갯수를 적어주세요 : ");
		vo.setCount(sc.nextInt());
		int cnt = 0;
		switch(vo.getMenu()) {
			case 1 :
				try {
					sleep(200);
				} catch (Exception e) {
					
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
					System.out.println("당신이 지불해야 금액은 " + (vo.getCount()*10000) + "입니다!");
					System.out.println("======================================");
				}
				
			case 2 : 
				try {
					sleep(200);
				} catch (Exception e) {
					
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
					System.out.println("당신이 지불해야 금액은 " + (vo.getCount()*15000) + "입니다!");
					System.out.println("======================================");
				}
			
			case 3 :
				try {
					sleep(200);
				} catch (Exception e) {
					
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
					System.out.println("당신이 지불해야 금액은 " + (vo.getCount()*15000) + "입니다!");
					System.out.println("======================================");
				}
			case 4 :
				try {
					sleep(200);
				} catch (Exception e) {
					
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
					System.out.println("당신이 지불해야 금액은 " + (vo.getCount()*6000) + "입니다!");
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
	public void halin() {
		
		MenuVO vo = new MenuVO();
		
		String[] drink = {"생수", "콜라", "사이다", "맥주", "막걸리"};
		int rand = drink.length;
		int num[] = {0};
		System.out.println("할인권을 사용하시겠습니까? [Yes/No] "); //YES,NO
		vo.setCoupon(sc.next());
	
		if(vo.getCoupon().equals("Yes")) {
			num[0] = rd.nextInt(rand);
			for(int su : num)
			System.out.println(drink[su]);
		} else if(vo.getCoupon().equals("No")) {
			//음료를 구매하실?
		}else {
			System.out.println("다시 입력해주세요!");
		}
		
	}

}

/*3. 메뉴(매점) -> 배열 / 스레드 (준비중입니다... )    윤
1) 메뉴 준비
 생수, 콜라, 사이다, 맥주,막걸리
2) 할인권 -> 음료(랜덤)
1번에서 넘어온 사람만 랜덤으로
*/
