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
               System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
               System.out.println("|  WELCOME        　　　　　　　　　　　　　　 　　　　　  　　　　 　               |　          　　　　　　　　　　　　　　　　　　　　　　　　　　　　 　             |");
               System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
               System.out.println("|　코인 노래방을 방문해주셔서 감사합니다. 　　　　　　　　　                       　|");
               System.out.println("|　원하시는 메뉴를 선택해주세요.　　　　　　　　　　　　　　　　　　　　　　　　　　 |");
               System.out.println("|　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿　　　|");
               System.out.println("| 　　　｜1.회원메뉴|　　　 ｜2. 좌   석｜      ｜3. 매  점 ｜ 　    |4. 종  료| 　　|");
               System.out.println("|　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣￣　　　 　￣￣￣￣￣ 　　|");
               System.out.println("￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
               System.out.print("▶메뉴를 선택해주세요! ");
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
               System.out.println();
               System.out.println("코인노래방 서비스를 종료합니다.");
               int cnt = 0;
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
