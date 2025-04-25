package classes;
import java.util.Scanner;


public class OneBed
{
	String Resident = null;
	int bed = 1;
	int stay = 1;
	int price = 50;
	int total;
	
	public void ShowRoom()
	{
		System.out.println("The room comes with: ");
		System.out.println(bed + " bed and access to regular pool");
		System.out.println("At " + price + " USD$ per night");
		System.out.println("(Room service included)");
	}
	
	public void GetInfo()
	{
		Scanner key = new Scanner(System.in);
		System.out.print("please enter name of resident in this room: ");
		Resident = key.nextLine();
		System.out.print("Please enter the duration of the stay (nights): ");
		stay = key.nextInt();
		total = stay * price;
		System.out.println(" OK " + Resident + ", Total is: " + total + "$. for " + stay + " nights, Enjoy!");
		
	}
}
