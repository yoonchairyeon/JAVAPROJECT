package Member;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javaminiproject.SingMain;

public class MemberImpl extends Thread implements Member{
   
      //private List<MemberVO> lists = null;
      //MemberVO vo = null;
   public List<MemberVO> lists = new ArrayList<>();
      Scanner sc = new Scanner(System.in);   
      
      public MemberImpl() {
         
      }
      
      @Override
      public void input() { //회원가입
         MemberVO vo = new MemberVO(); 
         
         //if(lists == null) {
         //   lists = new ArrayList<>();
         //}
         
         System.out.print("\n아이디: ");
         String id = sc.next();
         Iterator<MemberVO> it = lists.iterator();
         //vo.setId(sc.next());
         while(it.hasNext()) {
               MemberVO vo1 = it.next();
               if(id.equals(vo1.getId())) {
                  System.out.println("▶ 회원입니다.");
                  return;
               }
            }
            
            System.out.print("아이디: ");
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
      public void login() throws Exception {
         System.out.print("아이디: ");
         String id = sc.next();
   
         System.out.print("비밀번호: ");
         String pw = sc.next();
         
         Iterator<MemberVO> it = lists.iterator();
         while(it.hasNext()) {
         
            MemberVO vo1 = it.next();
            if(id.equals(vo1.getId())) {
               System.out.println("▶ 회원입니다.");
               break;
            }
         }
      }
   
      @Override
      public void print() {
   
         Iterator<MemberVO> it = lists.iterator();
   
         while(it.hasNext()) {
            MemberVO vo1 = it.next();
            
            System.out.println(vo1.toString());
         } 
      }
   
      @Override
      public void update() { //충전
   
         System.out.print("▶ 충전할 아이디 입력: "); 
         String id = sc.next();
   
         Iterator<MemberVO> it = lists.iterator();

         while(it.hasNext()) {
            MemberVO vo = it.next();
         if(vo.getId().equals(id)) {
            System.out.println("▶ 회원입니다.");
            System.out.print("▶ 얼마를 충전하시겠습니까? : ");
            vo.setTime(sc.nextInt());
           
            if(vo.getTime()% 5000 ==0) {
            	vo.setCoupon(1);
            }
            
            System.out.println("\n▶ 충전이 완료되었습니다.");
            System.out.printf("[ 남은 잔액"
            		+ ": %d   할인권: %d ]\n",vo.getTime(), vo.getCoupon());
            }
         }
      }
   
      @Override
      public void findId() {
         System.out.print("아이디 입력: "); 
         String id = sc.next();
         
         Iterator<MemberVO> it = lists.iterator();
         
         while(it.hasNext()) {
            MemberVO vo = it.next();  
            if(id.equals((vo.getId()))) {
               System.out.println("▶ 회원입니다.");
               System.out.printf(vo.toString());
            }
         }
      }

      @Override
      public void manager() throws Exception {
   
         int ch;
         while(true) {
            do {
               System.out.print("-------------------------------------------\n");
               System.out.print("     1.회원 조회           2.회원 찾기           3.종료");
               System.out.print("\n-------------------------------------------\n");
               System.out.print("▶  입력: ");
               ch = sc.nextInt();
            }while(ch<1);
   
            switch(ch) {
            case 1: print(); break; //회원가입, 로그인
            case 2:
               findId(); break; //시간 충전
            default:
               System.out.println("▶ 관리자 페이지 종료");
               return;
            }   
            //break;
         }
      }

	@Override
	public void memmenu() {
		Member ob = new MemberImpl();
		 while(true) { 
	    	  try {
	  	           System.out.print("-----------------------------------\n");
	  	           System.out.print("1.회원가입  2.로그인 3.시간 충전 4.관리자 5.매점입장 6.종료");
	  	           System.out.print("\n-----------------------------------\n");
	  	           System.out.print("입력: ");
	  	           int ch = sc.nextInt();
	  	           
	  	         switch(ch) {
	  	            case 1: ob.input(); break; //회원가입, 로그인
	  	            case 2:
	  	               ob.login(); break; //관리자
	  	            case 3:
	  	               ob.update(); break; //시간 충전
	  	            case 4:
	  	               ob.manager(); break; //관리자
	  	            case 5:
	  	            	//main 돌아가기 !
	  	            	
	  					break;
	  	            default:
	  	               System.out.println("충전을 종료합니다.");
	  	               SingMain si = new SingMain();
	  	               si.main(null);
	  	   
	  	         }   
			} catch (Exception e) {
				// TODO: handle exception
			}
	         
	            
	      }
	}
}