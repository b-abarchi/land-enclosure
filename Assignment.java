//*********************************
//*****Bello Abarchi**************
//****Alarm Clock****************
//***2/25/2018******************
//*****************************
package landAndEata;

import java.util.Scanner;
public class Assignment {
	 public static void main(String[] args) {
		 int choice = 0;
			do {
				choice = getChoice();
				switch (choice) {
				case 1:
					LandEnclosure.LandEnclosure();
					break;
				case 2:
				PayCalculator.payCalculator();
					break;
				case 3:
					Bestdeal.getBestDeal();
					break;
				case 4:
					System.out.println("Thanks for playing!");
					break;
				default:
					System.out.println("Invalid choice entered!");
					break;
				}
			} while (choice != 4);
	}//end of main
	 public static void displayMenu() {
		 String line = "1. Land Enclosure\n";
		 line += "2. Pay Calculator\n";
		 line += "3. Best Deal\n";
		 line += "4. QUIT\n";
		 System.out.println(line);
	}//end of displayMenu
	 public static int getChoice() {
		 int result;
		 displayMenu();
		 Scanner input = new Scanner(System.in);
		 	System.out.println("enter choice: \n");
			result = input.nextInt();
		 return result;
	 }//end of getChoice
}//end of class

