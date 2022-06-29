package javaminiproject;

import java.util.Scanner;

public class SeatMain extends Thread{

	public SeatMain() {
		
	}
	
	@Override
	public void run() {
		 Scanner sc = new Scanner(System.in);
	      Seat st = new SeatImpl() {};

	      int ch;
	      st.s_section(); // main 최상단
	      st.ns_seciont(); // main 최상단

	      while (true) {
	    	  try {
	    		  do {
	    			  System.out.println("      ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
	    		      System.out.println("      |　좌석선택창　　　　　　　　　　　　　　　　　　　　[－][口][×] |");
	    		      System.out.println("      |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
	    		      System.out.println("      |　신나게 노래 부를 자리를 선택해봅시다.                      　 |");
	    		      System.out.println("      |　어떤 메뉴로 갈까요?　　　　　　　　　　　　　　　　　　　　 　|");
	    		      System.out.println("      |　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿　　　|");
	    		      System.out.println("      | 　　　｜1.좌석선택|　　　 ｜2.좌석변경｜ 　    |3.좌석종료|　　|");
	    		      System.out.println("      |　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣　　　|");
	    		      System.out.println("      ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
	    		      System.out.print("      ▶선택?  ");
	    		      ch =sc.nextInt();
	    		  
	    		  } while (ch < 1);

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
				// TODO: handle exception
			}
	        
	      }
	}
	
	
   public static void main(String[] args) {
	   SeatMain sm = new SeatMain();
	   sm.start();
     
   }
   
}