package javaminiproject;

public class FinishImpl extends Thread implements Finish {

   @Override
   public void f() {
      System.out.println("코인노래방 서비스를 종료합니다.");
      int cnt = 0;
      try {
         sleep(100);
      } catch (Exception e) {
      }
      while (cnt < 1) {
         String[] bye = { "∧,,∧", "( 'ω' )つ 　다음에", "（m9 ＼ 　　   또 ", "　 ＼　 ＼ 　　만나요!", "　 　 ) ) ＼", "　 ／／ ＼ ＼",
               "　 (＿） 　 (＿)", "" };
         for (int i = 0; i < bye.length; i++) {
            System.out.println(bye[i]);
            try {
               sleep(150);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
         cnt++;
         try {
            sleep(800);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      System.exit(0);
   }

   @Override
   public void cute() {

      int cnt = 0;
      try {
         sleep(100);
      } catch (Exception e) {
      }
      while (cnt < 1) {
         String[] bye = { "안녕~", "＿＿＿＿＿＿＿＿", "|/⌒)＿＿＿＿＿／|", "|　/ 　　　　　　|\r\n", "￣￣￣￣￣￣￣￣", "퇴장합니다~", "＿＿＿＿＿＿＿＿",
               "|/⌒)＿＿＿＿＿／|", "|　/　●　　　● | 스윽ー", "￣￣￣￣￣￣￣￣", "쾅★", "|￣￣￣￣￣￣￣￣|", "|　　　　　　　　|", "￣￣￣￣￣￣￣￣" };
         for (int i = 0; i < bye.length; i++) {
            System.out.println(bye[i]);
            try {
               sleep(150);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
         cnt++;
         try {
            sleep(800);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}