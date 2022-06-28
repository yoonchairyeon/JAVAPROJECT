package javaminiproject;

import java.util.Scanner;

public class SeatMain {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      Seat st = new SeatImpl() {};

      int ch;
      st.s_section(); // main 최상단
      st.ns_seciont(); // main 최상단

      while (true) {

         do {
            ch = st.seatstart();
         } while (ch < 1 && ch > 3);

         switch (ch) {

         case 1:
            int smo = st.leftseat();

            switch (smo) {
            case 1:
               st.run();
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
         }
      }
   }

}