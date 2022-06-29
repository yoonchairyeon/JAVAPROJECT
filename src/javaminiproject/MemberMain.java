package javaminiproject;

import java.util.Scanner;

public class MemberMain {

   public static void main(String[] args) throws Exception {
      
      Scanner sc = new Scanner(System.in);
      
      Member ob = new MemberImpl();
      
      int ch;
      
      while(true) { //무한루프. 메뉴
         do {
            System.out.print("-----------------------------------\n");
            System.out.print("1.회원가입  2.로그인 3.시간 충전 4.관리자 5.매점입장 6.종료");
            System.out.print("\n-----------------------------------\n");
            System.out.print("입력: ");
            ch = sc.nextInt();
         }while(ch<1);
         
         switch(ch) {
            case 1: ob.input(); break; //회원가입, 로그인
            case 2:
               ob.login(); break; //관리자
            case 3:
               ob.update(); break; //시간 충전
            case 4:
               ob.manager(); break; //관리자
            case 5:
            	MenuMain mm = new MenuMain();
				mm.start();	  
				break;
            default:
               System.out.println("충전을 종료합니다.");
               SingMain si = new SingMain();
       			si.start();	
   
         }   
            
      }
   }
}