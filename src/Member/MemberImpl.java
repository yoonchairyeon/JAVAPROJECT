package Member;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Menu.MenuImpl;
import javaminiproject.FinishImpl;
import javaminiproject.SingMain;

public class MemberImpl extends Thread implements Member {

   FinishImpl f = new FinishImpl();
  
   public List<MemberVO> lists = new ArrayList<>();
   Scanner sc = new Scanner(System.in);

   public MemberImpl() {

   }

   @Override
   public void input() { // 회원가입
      MemberVO vo = new MemberVO();

      System.out.print("\n아이디(중복확인) : ");
      String id = sc.next();
      Iterator<MemberVO> it = lists.iterator();
      while (it.hasNext()) {
         MemberVO vo1 = it.next();
         if (id.equals(vo1.getId())) {
            System.out.println("▶ 회원입니다.");
            return;
         }
      }

      System.out.print("아이디 : ");
      vo.setId(sc.next());

      System.out.print("비밀번호 : ");
      vo.setPw(sc.next());

      System.out.print("이름 : ");
      vo.setName(sc.next());

      System.out.print("전화번호 : ");
      vo.setPhone(sc.next());

      lists.add(vo);
      System.out.println("\n▶ 회원가입이 완료되었습니다.");
   }

   @Override
   public void login() throws Exception {
      System.out.print("아이디 : ");
      String id = sc.next();

      System.out.print("비밀번호 : ");
      String pw = sc.next();

      Iterator<MemberVO> it = lists.iterator();
      while (it.hasNext()) {

         MemberVO vo1 = it.next();
         if ((id.equals(vo1.getId())) && (pw.equals(vo1.getPw()))) {
            System.out.println("▶ 회원입니다.");
            break;
         }
      }
   }

   @Override
   public void print() {

      Iterator<MemberVO> it = lists.iterator();

      while (it.hasNext()) {
         MemberVO vo1 = it.next();

         System.out.println(vo1.toString());
      }
   }

   @Override
   public void update() { // 충전

      System.out.print("충전할 아이디 입력\n▶");
      String id = sc.next();

      Iterator<MemberVO> it = lists.iterator();

      while (it.hasNext()) {
         MemberVO vo = it.next();
         if (vo.getId().equals(id)) {
            System.out.println("▶ 회원입니다.");
            System.out.println();
            System.out.print("얼마를 충전하시겠습니까?\n▶");
            vo.setTime(sc.nextInt());

            if (vo.getTime() % 5000 == 0) {
               vo.setCoupon(1);
            }

            System.out.println("\n▶ 충전이 완료되었습니다.");
            System.out.printf("[ 남은 잔액" + ": %d   쿠폰: %d ]\n", vo.getTime(), vo.getCoupon());
         }
      }
   }

   @Override
   public void findId() {
      System.out.print("아이디 입력  ");
      String id = sc.next();

      Iterator<MemberVO> it = lists.iterator();

      while (it.hasNext()) {
         MemberVO vo = it.next();
         if (id.equals((vo.getId()))) {
            System.out.println("▶ 회원입니다.");
            System.out.printf(vo.toString());
         }
      }
   }

   @Override
   public void manager() throws Exception {

      int ch;
      while (true) {
         do {
            System.out.println();
            System.out.println();
            System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
            System.out.println("|  관리자 페이지    　　　　　　　　　　　　　 　　　　　  　　　　 　               |");
            System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
            System.out.println("|　회원 전체를 조회하거나 아이디로 회원을 조회할 수 있습니다.                      　|");
            System.out.println("|　하단에서 원하는 메뉴를 선택해주세요.　　　　　　　　　　　 　　　　　　　　　　　 |");
            System.out.println("|　　　　 ＿＿＿＿＿＿　　　       　＿＿＿＿＿＿　　　     　＿＿＿＿＿＿　　　　 　|");
            System.out.println("| 　　 　｜1.회원조회 |　　　       ｜2.회원찾기｜           ｜3. 종   료｜ 　     　|");
            System.out.println("|　　 　　￣￣￣￣￣￣　　　　       ￣￣￣￣￣￣　　　     　￣￣￣￣￣￣　　　 　　|");
            System.out.println("￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");

            System.out.println();
            System.out.print("입력\n▶");
            ch = sc.nextInt();
         } while (ch < 1);

         switch (ch) {
         case 1:
            print();
            break; // 회원가입, 로그인
         case 2:
            findId();
            break; // 시간 충전
         default:
            System.out.println("관리자 페이지 종료");
            return;
         }
         // break;
      }
   }

   @Override
   public void memmenu() {
      Member ob = new MemberImpl();
      MenuImpl mm1 = new MenuImpl();
      SingMain si = new SingMain();

      while (true) {
         try {
            System.out.println();
            System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
            System.out.println("|  회원 메뉴        　　　　　　　　　　　　　 　　　　　  　　　　 　               |");
            System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
            System.out.println("|　회원 가입 및 로그인, 이용 금액 충전 등을 진행하는 페이지입니다.                 　|");
            System.out.println("|　하단에서 원하는 메뉴를 선택해주세요.　　　　　　　　　　　 　　　　　　　　　　　 |");
            System.out.println("|　　　　 　　      　　       　　　           　　　      　　      　　      　 　|");
            System.out.println("|　　　　 ＿＿＿＿＿＿　　　       　＿＿＿＿＿＿　　　     　＿＿＿＿＿＿　　　　 　|");
            System.out.println("| 　　 　｜1.회원가입 |　　　       ｜2.로 그 인｜           ｜3.시간충전｜ 　     　|");
            System.out.println("|　　 　　￣￣￣￣￣￣　　　　       ￣￣￣￣￣￣　　　     　￣￣￣￣￣￣　　　 　　|");
            System.out.println("|　　　　 ＿＿＿＿＿＿　　　       　＿＿＿＿＿＿　　　     　＿＿＿＿＿＿　　　　 　|");
            System.out.println("| 　　 　｜4.관 리 자 |　　　       ｜5.매점으로｜           ｜6. 종   료｜ 　     　|");
            System.out.println("|　　 　　￣￣￣￣￣￣　　　　       ￣￣￣￣￣￣　　　     　￣￣￣￣￣￣　　　 　　|");
            System.out.println("￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
            System.out.println();
            System.out.print("입력  \n▶");
            int ch = sc.nextInt();

            switch (ch) {
            case 1:
               ob.input();
               break; // 회원가입, 로그인
            case 2:
               ob.login();
               break; // 관리자
            case 3:
               ob.update();
               break; // 시간 충전
            case 4:
               ob.manager();
               break; // 관리자
            case 5:
               mm1.mmmain();

               break;
            default:
               f.cute();
               System.out.println("회원메뉴를 종료합니다.");
               si.main(null);

            }
            FileOutputStream fos = new FileOutputStream("/Users/yoonchairyeon/doc/data.txt");	
	   	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	   	        Iterator<MemberVO> it = lists.iterator();
	   	        oos.writeObject(it);
	   			oos.close();
	   			fos.close();
         } catch (Exception e) {
            // TODO: handle exception
         }

      }
   }
}