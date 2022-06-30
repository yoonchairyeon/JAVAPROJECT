package Seat;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

import javaminiproject.SingMain;

public class SeatImpl extends Thread implements Seat, Runnable {

   private Vector<String> vs = new Vector<String>();
   private Vector<String> vs2 = new Vector<String>();
   private static String smoke[] = { "A", "B", "C", "D", "E" };

   private Vector<String> vns = new Vector<String>();
   private Vector<String> vns2 = new Vector<String>();
   private static String nonsmoke[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

   Scanner sc = new Scanner(System.in);
   int section;
   String sUser;
   String nsUser;
   int ch;
   int times;

   @Override
   public int leftseat() {
      System.out.println();
      System.out.println("----------------------------------------------------------");
      System.out.println("        원하시는 구역을 선택해주세요.");
      System.out.println("   1. 흡연구역       2. 비흡연구역");
      System.out.println("----------------------------------------------------------");
      System.out.println();
      System.out.print("선택  \n▶");

      section = sc.nextInt();

      if (section == 1) {
         return 1;
      } else if (section == 2) {
         return 2;
      } else {
         return 3;
      }

   }

   @Override
   public void s_section() {

      for (String s : smoke) {
         vs.add(s);
      }
      for (String s2 : smoke) {
         vs2.add(s2);
      }
   }

   @Override
   public void ns_seciont() {

      for (String ns : nonsmoke) {
         vns.add(ns);
      }
      for (String ns2 : nonsmoke) {
         vns2.add(ns2);
      }
   }

   @Override
   public void run() {

      try {
         String choose[] = {"            ＿人人人人人人＿",
         "            ＞ " + sUser + "석 주세요!!＜\\",
         "            ￣Y^Y^Y^Y^Y^Y￣\\",
         "            　ハ_ハ\\",
         "            （ ‘-^　)　　n\\",
         "            ￣　　 ＼　( E)\\",
         "            ７　　/＼ / /\\",};
         for(int i = 0; i <choose.length; i++) {
            Thread.sleep(50);
            System.out.println(choose[i]);
         }
      } catch (Exception e) {
          e.printStackTrace();
      }
         
   }

   @Override
   public void s_choice() {
      System.out.println();
      System.out.print("현재");

      Collections.sort(vs);
      for (String s : vs) {
         System.out.print(s + " ");
      }
      System.out.println("좌석이 남아 있습니다!");
      System.out.print("어느 좌석을 선택하시겠습니까?\n");
      System.out.println();
      System.out.print("선택  \n▶");
      sUser = sc.next();
      int idx = vs.indexOf(sUser);
      if (idx == -1) {
         System.out.println();
         System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
         return;
      } else {
         vs.remove(sUser);
      }
      try {
         String choose[] = {"            ＿人人人人人人＿",
         "            ＞ " + sUser + "석 주세요!!＜\\",
         "            ￣Y^Y^Y^Y^Y^Y￣\\",
         "            　ハ_ハ\\",
         "            （ ‘-^　)　　n\\",
         "            ￣　　 ＼　( E)\\",
         "            ７　　/＼ / /\\",};
         for(int i = 0; i <choose.length; i++) {
            Thread.sleep(150);
            System.out.println(choose[i]);
         }
      } catch (Exception e) {
          e.printStackTrace();
      }

      System.out.println();
      System.out.println("   ");
      System.out.print("----------------------------------------------------------\n");
      System.out.println("      " + sUser + "좌석에서 즐거운 시간되세요.");
      System.out.print("      잔여 좌석 : ");
      for (String s : vs) {
         System.out.print(s + " ");
      }
      System.out.println("\n----------------------------------------------------------");

   }

   @Override
   public void ns_choice() {
      try {

         System.out.print("현재");

         Collections.sort(vns);
         for (String ns : vns) {
            System.out.print(ns + " ");
         }
         System.out.println("좌석이 남아 있습니다!");
         System.out.println("어느 좌석을 선택하시겠습니까?");
         System.out.print("선택\n▶");
         nsUser = sc.next();
         int idx = vns.indexOf(nsUser);
         if (idx == -1) {
            System.out.println();
            System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
            return;
         } else {
            vns.remove(nsUser);
         }
         try {
            String choose[] = {"            ＿人人人人人人＿",
            "            ＞ " + nsUser + "석 주세요!!＜\\",
            "            ￣Y^Y^Y^Y^Y^Y￣\\",
            "            　ハ_ハ\\",
            "            （ ‘-^　)　　n\\",
            "            ￣　　 ＼　( E)\\",
            "            ７　　/＼ / /\\",};
            for(int i = 0; i <choose.length; i++) {
               Thread.sleep(150);
               System.out.println(choose[i]);
            }
         } catch (Exception e) {
             e.printStackTrace();
         }
         System.out.println();
         System.out.println("----------------------------------------------------------");
         System.out.println("      " + nsUser + "번 좌석에서 즐거운 시간되세요.");
         System.out.print("      잔여 좌석 : ");
         for (String ns : vns) {
            System.out.print(ns + " ");
         }
         System.out.println("\n----------------------------------------------------------");
      } catch (Exception e) {
         System.out.println();
         System.out.println("      좌석 선택 오류!! 다시 선택해주세요.");
      }
   }

   @Override
   public void s_change() {
      System.out.println("좌석 변경을 선택하셨습니다.");
      System.out.println();
      System.out.println("사용중인 좌석명을 입력해주세요.");
      sUser = sc.next();
      int idx = vs.indexOf(sUser);
      int idx2 = vs2.indexOf(sUser);
      if (idx == -1 && idx2 != -1) {
         vs.add(sUser);
      } else {
         System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
         return;
      }
      System.out.println("새로운 좌석을 선택해주세요");
      sUser = sc.next();
      idx = vs.indexOf(sUser);
      if (idx == -1) {
         System.out.println();
         System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
         return;
      } else {
         vs.remove(sUser);
      }
      System.out.println("좌석이 변경되었습니다!");
      return;

   }

   @Override
   public void ns_change() {
      System.out.println("좌석 변경을 선택하셨습니다.");
      System.out.println();
      System.out.println("사용중인 좌석명을 입력해주세요.");
      nsUser = sc.next();
      int idx = vns.indexOf(nsUser);
      int idx2 = vns2.indexOf(nsUser);
      if (idx == -1 && idx2 != -1) {
         vns.add(nsUser);
      } else {
         System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
         return;
      }
      System.out.println("새로운 좌석을 선택해주세요");
      nsUser = sc.next();
      idx = vns.indexOf(nsUser);
      if (idx == -1) {
         System.out.println();
         System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
         return;
      } else {
         vns.remove(nsUser);
      }
      System.out.println("좌석이 변경되었습니다!");
      return;

   }

   @Override
   public void s_endUse() {
      System.out.println("좌석 사용이 끝나셨나요?");
      System.out.println("사용 종료할 좌석을 입력해주세요.");
      sUser = sc.next();
      int idx = vs.indexOf(sUser);
      int idx2 = vs2.indexOf(sUser);
      if (idx == -1 && idx2 != -1) {
         vs.add(sUser);
         System.out.println("좌석 사용이 종료되었습니다.");
      } else {
         System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
      }
   }

   @Override
   public void ns_endUse() {
      System.out.println("좌석 사용이 끝나셨나요?");
      System.out.println("사용 종료할 좌석을 입력해주세요.");
      nsUser = sc.next();
      int idx = vns.indexOf(nsUser);
      int idx2 = vns2.indexOf(nsUser);
      if (idx == -1 && idx2 != -1) {
         vns.add(nsUser);
         System.out.println("좌석 사용이 종료되었습니다.");
      } else {
         System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
      }
   }

@Override
public void smain() {
    Seat st = new SeatImpl();

     st.s_section(); // main 최상단
     st.ns_seciont(); // main 최상단
     
     do {
        try {
           System.out.println();
         System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
      System.out.println("|　좌   석　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　   　  |");
      System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
      System.out.println("|　신나게 노래 부를 자리를 선택해봅시다.　　　　　　　　　　                       　|");
      System.out.println("|　어떤 메뉴로 갈까요?　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　 |");
      System.out.println("|　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿　　　|");
      System.out.println("| 　　　｜1.좌석선택|　　　 ｜2.좌석변경｜      ｜3.좌석종료｜ 　   |4.처음으로| 　　|");
      System.out.println("|　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣　　　|");
      System.out.println("￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
      System.out.print("선택  \n▶");
      

      ch = sc.nextInt();
          
             switch (ch) {
             case 1:
                int smo = st.leftseat();

                switch (smo) {
                case 1:
                   st.s_choice();
                   break;
                case 2:
                   st.ns_choice();
                   break;
                case 3:
                   st.leftseat();
                   break;
                }
                break;

             case 2:
                smo = st.leftseat();

                switch (smo) {
                case 1:
                   st.s_change();
                   break;
                case 2:
                   st.ns_change();
                   break;
                }
                break;
             case 3:
                smo = st.leftseat();

                switch (smo) {
                case 1:
                   st.s_endUse();
                   break;
                case 2:
                   st.ns_endUse();
                   break;
                }
                break;
             case 4:
               SingMain.main(null);
               break;
             }
      } catch (Exception e) {
         System.out.println(e.toString());
      }
     }while(ch !=4);
}

}