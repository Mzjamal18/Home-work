package mywork;

import java.util.Scanner;

public class Work02 {

	public static void main(String[] args) {
		Scanner GP = new Scanner(System.in);
		
		System.out.println("\n\n*******************Today's Invoice*******************");
		System.out.println("    ********************Publix*********************");
		System.out.println("      **(911 duluth highway,larenceville,GA)**");
		
		
		System.out.println("\nButter unit price");
		int buprice=GP.nextInt();
		System.out.println("Butter Quantity");
		int bquant=GP.nextInt();
		System.out.println("Total butter Price : " +buprice*bquant);
		
		System.out.println("Bread unit price");
		int bprice=GP.nextInt();
		System.out.println("Bread Quantity");
		int brquant=GP.nextInt();
		System.out.println("Total bread Price : " +bprice*brquant);
		
		System.out.println("Lemon Unit price");
		int Lprice=GP.nextInt();
		System.out.println("Lemon Quantity");
		int lquant=GP.nextInt();
		System.out.println("Total Lemon Price : " +Lprice*lquant);
		
		double taxrate= 0.3;
		System.out.println("\n\nTax rate : "+ taxrate);
		System.out.println("Total product price:\t" +(buprice*bquant+bprice*brquant+Lprice*lquant));
		
		double Totalpriceaftertax=(buprice*bquant+bprice*brquant+Lprice*lquant)+ (buprice*bquant+bprice*brquant+Lprice*lquant)*taxrate;
		System.out.println("Total price after tax : "+Totalpriceaftertax);
		
		
		System.out.println("\n********************************************************");
		System.out.println("*                 Thank You                            *");
		System.out.println("*                For Shopping                          *");
		System.out.println("********************************************************");
		
	
		
	}

}
