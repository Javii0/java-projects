package classes;
import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	    int ppl = 0;
	    int beds = 0;
	    int x=9,y=9,z=4,q=9,h=9;
	    int roomCode,roomNum,floor;
	    int EmpOption = 0,order;
	    boolean ans = true;
		OneBed one = new OneBed();
		TwoBed two = new TwoBed();
		Suite suite = new Suite();
		
		int[][] OBfloors = new int[2][10]; //One Bed Floors
		int[][] TBfloors = new int[2][10]; //Two Bed Floors
		int[] TopFloor = new int[5]; //One Bed Floors
		
		
		do
		{
			MainDisplay();
			ppl = input.nextInt();
			if (ppl== 4444)
			{
				EmployeeDisplay();
				EmpOption = input.nextInt();
				input.nextLine();
				switch(EmpOption)
				{
				case 1:System.out.println("All items: Towels (Full) / Toothpaste (Full) / Soap(Rooms 104 & 206 need)");
				break;
				case 2:System.out.print("Enter room #: ");
						roomNum = input.nextInt();
						System.out.print("Enter order total: ");
						order = input.nextInt();
						if(roomNum > 100 && roomNum< 211)
						{
							System.out.println("Guest of " + roomNum + " Has a new bill of " + (one.total + order));
						}
						else if(roomNum > 300 && roomNum< 411)
						{
							System.out.println("Guest of " + roomNum + " Has a new bill of " + (two.total + order));
						}
						else
						{
							System.out.println("Guest of " + roomNum + " Has a new bill of " + (suite.total + order));
						}
					break;
				case 3:
					System.out.print("here is a graph of all the rooms with amount of people in them: ");
					System.out.println();
							for(int k=0;k<10;k++)
								{
									System.out.print("[" + OBfloors[0][k] + "]");
								}
							System.out.println();
							for(int k=0;k<10;k++)
							{
								System.out.print("[" + OBfloors[1][k] + "]");
							}
							System.out.println();
							
							for(int i = 0;i<10;i++)
							{
								System.out.print("[" + TBfloors[0][i] + "]");
							}
							System.out.println();
							for(int i=0;i<10;i++)
							{
								System.out.print("[" + TBfloors[1][i] + "]");
							}
							System.out.println();
							for(int j = 0;j<5;j++)
							{
								System.out.print("[" + TopFloor[j] + "]");
							}
							System.out.println();
							break;
					default:System.out.print("Non-Valid input!");
				}
				}
			else if(ppl == 0)
			{
				System.out.println("Thanks for staying at Java Hotel!");
				System.out.print("Enter room number: ");
				roomCode = input.nextInt();
				floor = roomCode/100;
				roomNum = roomCode%100;
				switch(floor)
				{
				case 1: OBfloors[0][roomNum]=0;
				System.out.println("Thanks for staying! " + one.Resident);
				break;
				case 2: OBfloors[1][roomNum]=0;
				System.out.println("Thanks for staying! "+ one.Resident);
				break;
				case 3: TBfloors[0][roomNum]=0;
				System.out.println("Thanks for staying! "+ two.Resident);
				break;
				case 4: TBfloors[1][roomNum]=0;
				System.out.println("Thanks for staying! "+ two.Resident);
				break;
				case 5: TopFloor[roomNum]=0;
				System.out.println("Thanks for staying! "+ suite.Resident);
				break;
				default: System.out.println("Unable to match room with user.");
				break;
				}
			}
			else if(ppl>0)
			{
			System.out.print("How many beds would you like (1,2,3): ");
			beds = input.nextInt();
			switch(beds)
			{
				case 1: one.ShowRoom();
				break;
				case 2: two.ShowRoom();
				break;
				case 3: suite.ShowRoom();
				break;
				default: System.out.println("Not a valid input (please select 1,2,3");
			}
			if(beds == 1)
			{
				if(x>1) {
				one.GetInfo();
				OBfloors[0][x]=ppl;
				System.out.println("your room is: 10"+ x);
				x--;}
				else {
			        
			        if (y > 0) {  
			            OBfloors[1][y] = ppl;
			            System.out.println("Your room is: 20" + y);
			            y--; 
			        } else {
			            System.out.println("Full");
			        }
			}}
			else if(beds == 2)
			{
				if(q>1) {
				two.GetInfo();
				TBfloors[0][q]=ppl;
				System.out.println("your room is: 30"+ q);
				q--;}
				else {
			        
			        if (h > 0) {  
			            TBfloors[1][h] = ppl;
			            System.out.println("Your room is: 40" + h);
			            h--; 
			        } else {
			            System.out.println("Full");
			        }
			}}
			else if (beds == 3)
			{
				suite.GetInfo();
				TopFloor[z]=ppl;
				System.out.println("your room is: 50"+ z);
				z--;
				if(z==0)
				{
					System.out.print("Full");
				}
			}
			else
			{
				ans = false;
			}
			}}while(ans == true);


	}
	
	static void MainDisplay()
	{
		
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("                             WELCOME TO JAVA HOTEL!!!                                            ");
		System.out.println("                               (guest check in)                 ");
		System.out.println("                   (Enter 0 for guest check out/Room Cancel)");
		System.out.println("                        HOW MANY PEOPLE WOULD LIKE TO STAY: ");
	
	}
	
	static void EmployeeDisplay()
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("                        EMPLOYEE DISPLAY                                    ");
		System.out.println("                 PRESS THE FOLLOWING FOR OPTIONS     ");
		System.out.println("   1.INVETORY CHECK   ");
		System.out.println("   2.ROOM SERVICE TAB ");
		System.out.println("   3.GUEST INFORMATION");
	}

}
