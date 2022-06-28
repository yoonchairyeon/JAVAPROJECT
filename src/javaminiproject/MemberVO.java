package javaminiproject;

public class MemberVO { 
   private String id, pw, name, phone;
   private int coupon;
   private int time;
   
   public String getId() {
      return id;
   }
   
   public void setId(String id) {
      this.id = id;
   }
   
   public String getPw() {
      return pw;
   }
   
   public void setPw(String pw) {
      this.pw = pw;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public String getPhone() {
      return phone;
   }
   
   public void setPhone(String phone) {
      this.phone = phone;
   }
   
   public int getTime() {
      return time;
   }
   
   public void setTime(int time) {
      this.time += time;
   }
   
   public int getCoupon() {
      return coupon;
   }
   
   public void setCoupon(int coupon) {
      this.coupon += coupon;
   }
   
   @Override
   public String toString() {
      
      String str = String.format("[ 회원정보 ]\n아이디: %s \n비밀번호: %s \n이름: %s \n전화번호: %s \n남은 시간: %d \n할인권: %d\n",
            id, pw, name, phone, time, coupon);
      
      return str;
   }
   
}