package javaminiproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberImpl implements Member{
   
   private List<MemberVO> lists = null;
  
   Scanner sc = new Scanner(System.in);
   String id, pw; 
   
   @Override
   public void input() { //회원가입
	  
	   if(lists == null) {
			lists = new ArrayList<>();
		}
	  
	  MemberVO vo = new MemberVO();  
      Iterator<MemberVO> it = lists.iterator();
     
      System.out.print("\n아이디: ");
      id = sc.next();
      //vo.setId(sc.next());
      while(it.hasNext()) {
    	  vo = it.next();
    	  if(id.equals(vo.getId())) {
              System.out.println("▶ 회원입니다.");
              return;
           }
           else {
              System.out.println("▶ 비회원 입니다.  \n▶ 회원가입하십시오.");
              break;
           }
      }
      System.out.print("\n아이디: ");
      vo.setId(sc.next());
      //id = vo.getId();
      
      System.out.print("비밀번호: ");
      vo.setPw(sc.next());
      //pw = vo.getPw();
      
      System.out.print("이름: ");
      vo.setName(sc.next());
      
      System.out.print("전화번호: ");
      vo.setPhone(sc.next());
      
      lists.add(vo); 
      System.out.println("\n▶ 회원가입이 완료되었습니다.");
        
   }
   
   @Override
   public void login() {
      
      Iterator<MemberVO> it = lists.iterator();
      
      System.out.print("아이디: ");
      id = sc.next();
      
      System.out.print("비밀번호: ");
      pw = sc.next();
      
      while(it.hasNext()) {
         MemberVO vo = it.next();
         if(vo.getPw().equals(pw)) {
               System.out.println("▶ 회원입니다.");
             }
             else{
                System.out.println("▶ 비회원 입니다.  \n▶ 회원가입하십시오.");
             }
      }
      
   }
   
   @Override
   public void print() {
      
      Iterator<MemberVO> it = lists.iterator();
      
      while(it.hasNext()) {
    	  MemberVO vo = it.next();
          
          System.out.println();
          System.out.println(vo.toString());
          
      }
        
      
   }

   @Override
   public void update() { //충전
      
         System.out.print("▶ 충전할 아이디 입력: "); 
         id = sc.next();
         
         Iterator<MemberVO> it = lists.iterator();
         MemberVO vo = it.next();
         
         lists.add(vo);

         if(vo.getId().equals(id)) {
            System.out.println("▶ 회원입니다.");
               
         }
         else {
            System.out.println("▶ 비회원 입니다.  \n▶ 회원가입하십시오.");
         }
         
      System.out.print("▶ 얼마를 충전하시겠습니까? : ");
      vo.setTime(sc.nextInt());
      
      lists.add(vo);
         
      System.out.println("\n▶ 충전이 완료되었습니다.");
      
      //충전 완료->얼마 이상 시 할인권 추가
      if(vo.getTime() >= 5000) {
         
         vo.setCoupon(1);
         
      }
      System.out.printf("[ 남은 시간: %d   할인권: %d ]\n",vo.getTime(), vo.getCoupon());
      //할인권 사용? -> 3번으로 이동
      
   
   }
   
   @Override
   public void findId() {
      
      System.out.print("아이디 입력: "); 
      id = sc.next();
      
      Iterator<MemberVO> it = lists.iterator();
      MemberVO vo = new MemberVO();  
      
    	  
    	  if(vo.getId().equals((id))) {
    	         System.out.println("▶ 회원입니다.");
    	         System.out.printf(vo.toString());
    	          //System.out.print("\n-------------------------------------------\n");
    	            
    	      }
    	      else {
    	         System.out.println("▶ 비회원 입니다.  \n▶ 회원가입하십시오.");
    	        
    	      }
      
   }
   
   @Override
   public void manager() {
      
      int ch;
      while(true) {
      do {
         System.out.print("------------------------------\n");
         System.out.print("1.회원 조회 2.회원 찾기 3.종료");
         System.out.print("\n------------------------------\n");
         System.out.print("▶  입력: ");
         ch = sc.nextInt();
      }while(ch<1);
      
      switch(ch) {
         case 1: print(); break; //회원가입, 로그인
         case 2:
            findId(); break; //시간 충전
         //case 3:
         //   delete(); break; //관리자 페이지

         default:
            System.out.println("▶ 관리자 페이지 종료");
            return;
         }   
      //break;
      }
   }
   
   //3번으로 이동
   @Override
   public void coupon() {
	   MenuMain ob = new MenuMain();
	   
	   
   }
}
