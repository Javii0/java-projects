package classes;

import java.util.Scanner;

public class TwoBed extends OneBed
{
int bed = 2;
int price = 75;

public void ShowRoom()
{
	System.out.println("The room comes with: ");
	System.out.println(bed + "bed");
	System.out.println("At " + price + "$ per night");
	System.out.println("(Room service included)");
	System.out.println("Jacuzzi included & Access to V.I.P pool included");
}
public void GetInfo()
{
	Scanner key = new Scanner(System.in);
	System.out.print("please enter name of resident in this room: ");
	Resident = key.nextLine();
	System.out.print("Please enter the duration of the stay (nights): ");
	stay = key.nextInt();
	int total = stay * price;
	System.out.println(" OK " + Resident + ", Total is: " + total + "$. for " + stay + " nights, Enjoy!");
	
}

}

