package javaminiproject;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public abstract class SeatImpl extends Thread implements Seat, Runnable {

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
   

   @Override
   public int seatstart() {
      System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
      System.out.println("          좌석 선택을 위해 ");
      System.out.println("  원하시는 메뉴의 번호를 입력해주세요.");
      System.out.println("1. 좌석 선택 2. 좌석 변경 3. 좌석 사용종료");
      System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

      return ch = sc.nextInt();
   }

   @Override
   public int leftseat() {
      System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
      System.out.println("    구역을 선택해주세요.");
      System.out.println(" 1. 흡연구역, 2. 비흡연구역");
      System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

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
   public void s_choice() {
      System.out.print("현재");

      Collections.sort(vs);
      for (String s : vs) {
         System.out.print(s + " ");
      }
      System.out.println("좌석이 남아 있습니다!");
      System.out.print("어느 좌석을 선택하시겠습니까?");
      sUser = sc.next();
      int idx = vs.indexOf(sUser);
      if (idx == -1) {
         System.out.println();
         System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
         return;
      } else {
         vs.remove(sUser);
      }

      System.out.println();
      System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
      System.out.println(sUser + "좌석에서 즐거운 시간되세요.");
      System.out.print("잔여 좌석 : ");
      for (String s : vs) {
         System.out.print(s + " ");}
      System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

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
      System.out.print("어느 좌석을 선택하시겠습니까?");
      nsUser = sc.next();
      int idx = vns.indexOf(nsUser);
      if (idx == -1) {
         System.out.println();
         System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
         return;
      } else {
         vns.remove(nsUser);
      }

      System.out.println();
      System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
      System.out.println(nsUser + "번 좌석에서 즐거운 시간되세요.");
      System.out.print("잔여 좌석 : ");
      for (String ns : vns) {
         System.out.print(ns + " ");}
      System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
      } catch (Exception e) {
         System.out.println();
         System.out.println("좌석 선택 오류!! 다시 선택해주세요.");
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

}