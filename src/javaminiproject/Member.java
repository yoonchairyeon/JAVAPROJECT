package javaminiproject;

public interface Member {
   
   public void input(); //회원가입
   public void print(); //회원정보
   //public void delete(); //회원 삭제
   public void update(); //수정 -> 시간 추가
   public void findId(); //아이디검색
   public void coupon();
   public void manager(); //관리자
   public void login();
   
   //입력, 회원 출력, 수정(시간권, 할인권여부 추가), 회원 삭제, 회원검색
}