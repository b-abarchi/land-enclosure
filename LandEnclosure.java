package landAndEata;

import java.util.Scanner;

public class LandEnclosure {
	public static void LandEnclosure()
	{
	//************************PROBLEM "A" (LAND ENCLOSURE)***************************
		Scanner reader = new Scanner(System.in);
		System.out.println("What area do you need for your enclosure in square feet?: ");
		float area=reader.nextFloat();
		System.out.println("What is the ratio of the length to the width of your enclosure?: ");
		int lr=reader.nextInt();
		int wr=reader.nextInt();
		int x;
		x=(int)(area/(lr*wr));
		//x=(int) sqrt(x);
		if(area>1000000000 || area<0 || lr>100 || lr<0 || wr>100||wr<0)
		{
		System.out.println("Please enter valid data");
		return;
		}
		System.out.println("Your enclosure has dimensions "+(lr*x)+"feet by "+(wr*x)+" feet.");
		System.out.println("You will need "+(2*lr*x+2*wr*x)+" feet of total fence.");}
	}