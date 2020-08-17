package landAndEata;

import java.util.Scanner;

public class PayCalculator {
public static void payCalculator() {
	//************************PROBLEM "B" (PAY CALCULATOR)***************************
	Scanner reader = new Scanner(System.in);
		System.out.println("How many knives did you sell this month? ");
		int n= reader.nextInt();
		if(n>1000000 ||n<0)
		{
		System.out.println("Please enter valid data");
		return;
		}
		float price;
		if(n<=100)
		{
		price=n*5;
		}
		else if(n<=200)
		{
		price=5*100+10*(n-100);
		}
		else
		{
		price=5*100+10*100+15*(n-200);
		}
		System.out.println("You made $"+price+" selling knives this month.");}
}//end of class
