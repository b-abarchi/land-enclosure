package landAndEata;

import java.util.Scanner;

public class Bestdeal {

	public static void getBestDeal()
	{
	Scanner reader = new Scanner(System.in);
	
	
	  
	//************************PROBLEM "C" (BEST DEAL)***************************

	int amtLeft,costOfItem1,costOfItem2,costOfItem3;
	int leastAmtLeft= -1;

	//This will read the amount left in the meal card
	System.out.println("\nHow much money is left on your meal card (in dollars)? ");
	Scanner input=new Scanner(System.in);
	amtLeft=input.nextInt();

	//This will read the cost of three items
	System.out.println("\nWhat is the cost in dollars of the three items you may buy? ");
	costOfItem1=input.nextInt();
	costOfItem2=input.nextInt();
	costOfItem3=input.nextInt();

	//This will check if we can buy all the three items with the amount left
	if(costOfItem1+costOfItem2+costOfItem3 <= amtLeft)
	{
	    //if yes, calculate the least amount by using below
	    leastAmtLeft = amtLeft - (costOfItem1+costOfItem2+costOfItem3);
	}
	//This will check if we can buy first two items with the amount left
	if(costOfItem1+costOfItem2 <= amtLeft)
	{
	    //if yes, calculate the least amount by using below
	    if(leastAmtLeft<0.0 )
	        leastAmtLeft = amtLeft - (costOfItem1+costOfItem2);
	    else if (amtLeft - (costOfItem1+costOfItem2) < leastAmtLeft )
	        leastAmtLeft = amtLeft - (costOfItem1+costOfItem2);
	}
	//This will check if we can buy last two items with the amount left
	if(costOfItem2+costOfItem3 <= amtLeft)
	{
	    //if yes, calculate the least amount by using below
	    if(leastAmtLeft<0.0 )
	        leastAmtLeft = amtLeft - (costOfItem2+costOfItem3);
	    else if (amtLeft - (costOfItem2+costOfItem3) < leastAmtLeft )
	        leastAmtLeft = amtLeft - (costOfItem2+costOfItem3);
	}
	//This will check if we can buy first and last item with the amount left
	if(costOfItem1+costOfItem3 <= amtLeft)
	{
	    //if yes, calculate the least amount by using below
	    if(leastAmtLeft<0.0 )
	        leastAmtLeft = amtLeft - (costOfItem1+costOfItem3);
	    else if (amtLeft - (costOfItem1+costOfItem3) < leastAmtLeft )
	        leastAmtLeft = amtLeft - (costOfItem1+costOfItem3);
	}
	//This will check if we can buy first item with the amount left
	if(costOfItem1 <= amtLeft)
	{
	    //if yes, calculate the least amount by using below
	    if(leastAmtLeft<0.0 )
	        leastAmtLeft = amtLeft - (costOfItem1);
	    else if (amtLeft - (costOfItem1) < leastAmtLeft )
	        leastAmtLeft = amtLeft - (costOfItem1);
	}
	//This will check if we can buy second and last item with the amount left
	if(costOfItem2 <= amtLeft)
	{
	    //if yes, calculate the least amount by using below
	    if(leastAmtLeft<0.0 )
	        leastAmtLeft = amtLeft - (costOfItem2);
	    else if (amtLeft - (costOfItem2) < leastAmtLeft )
	        leastAmtLeft = amtLeft - (costOfItem2);
	}
	//This will check if we can buy last item with the amount left
	if(costOfItem3 <= amtLeft)
	{
	    //if yes, calculate the least amount by using below
	    if(leastAmtLeft<0.0 )
	        leastAmtLeft = amtLeft - (costOfItem3);
	    else if (amtLeft - (costOfItem3) < leastAmtLeft )
	        leastAmtLeft = amtLeft - (costOfItem3);
	}
	//if not, items that are purchased set least amount to amount left
	if(leastAmtLeft == -1)
	    leastAmtLeft=amtLeft;

	//Print the result here
	System.out.print("\nThe least amount of money you can leave on your card is $" + leastAmtLeft +".");

	

	
}}//end of best deal 
