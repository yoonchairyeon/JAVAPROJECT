package javaminiproject;

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		Menu ob = new MenuImpl();
		
		int ch;
		
		while(true) {
			do {
				System.out.print("1. 음료 구매 \t 2. 할인권으로 구매 : ");
				ch =sc.nextInt();
				System.out.println("======================================");
			}while(ch<1);
			
			switch(ch) {
			case 1: ob.inoutput(); break;
			case 2: ob.halin(); break;
			default:
				System.out.println("다시 골라주세요!");
				
			}
		}

	}

}
