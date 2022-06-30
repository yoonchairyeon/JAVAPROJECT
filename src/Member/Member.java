package Member;

public interface Member {
	public void memmenu();
   public void input(); //회원가입
   public void print() throws Exception; //회원정보
   //public void delete(); //회원 삭제
   public void update() throws Exception; //수정 -> 시간 추가
   public void findId(); //아이디검색
   public void manager() throws Exception; //관리자
   public void login() throws Exception;
  
   //입력, 회원 출력, 수정(시간권, 할인권여부 추가), 회원 삭제, 회원검색
}