
 package org.cei.TicketBooking;
import java.util.Scanner;

public class SeatingArrangement {
	
	private static int[] seats;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int age=0;
		String gender=" ",name=" ";
		
		System.out.println("Enter no of seats you need to allocate"); //for allocating the seats
		int seats=sc.nextInt();
		
		// for collecting the information form passenger 
		for(int i=0;i<seats;i++)
		{
			System.out.println("Enter your Name");
			name=sc.next();
			
			System.out.println("Enter your gender 'f' or 'm'");
			gender=sc.next();
			
			System.out.println("Enter Age");
			age=sc.nextInt();
			int seatnumber = 0;
			seatnumber = special();
			printBoardingPass(seatnumber);
		} 

		/*creating a bus structure*/
		int busStuc[][]=new int[10][10];
		int s=0;
		for(int j=0;j<=6;j++)
		{
			for(int k=0;k<=2;k++)
			{
					busStuc[j][k]=s;
					s++;
			}
		
		}
	}
	//bus seat layout
		public static void printRow(int[] row) {
	         for (int i : row) {
	            System.out.print(i);
	            System.out.print("\t");
	        }
	        System.out.println();
	    
	     Scanner sc=new Scanner(System.in);   
	     int twoDm[][]= new int[10][2];
	        int i,j,k=1;
	        int ans;

	        for(i=0;i<10;i++) {
	            for(j=0;j<2;j++) {
	                twoDm[i][j]=k;
	                k++;
	            }
	        }

	        for(int[] row1 : twoDm) {
	            printRow(row1);
	        }

	        //this loop repeats the reserving process (and printing seats) 5 times
	        for (int l = 0; l < 10; l++) {
	            System.out.print("Enter a Seat number to reserve: ");
	            ans = Integer.parseInt(sc.next());
	            k = 1;
	            for(i=0;i<10;i++) {
	                for(j=0;j<2;j++) {
	                    if (k == ans) {
	                        //here we check if the seat has already been reserved
	                        if (twoDm[i][j]== 0) {
	                            System.out.println("That seat has already been reserved");
	                        }
	                        //if its not reserved then reserve it
	                        else {
	                             twoDm[i][j]= 0;
	                        }
	                    }
	                    k++;
	                }
	            }
	            //print updated array of seats
	            for(int[] row1 : twoDm) {
	                printRow(row1);
	            }
	       }

			
	} 
	
	/* allocating a seat to passenger*/
	static int seatBooking(String gender,int age,int noOfSeats)
	{
		int seatNo=0;
		if(gender=="f" || age>=60) 
		{
			for(int sn=1;sn<=5;sn++)
			{
				seatNo=sn;

			}
		}
		else if(age<12)
		{
			for(int sn=6;sn>=14;sn++)
			{
				seatNo=sn;
			}
		}
		else
		{
			for(int sn=15;sn>=20;sn++)
			{
				seatNo=sn;
			}
		}
		return seatNo;
	}
	//end of allocating seats
	
	
	private static void printSeating(int[][] seating) {
		for (int i = 0; i < seating.length; i++) {
			// Don't print a newline, since you want to continue printing on this line
			//					System.out.print(i + 1);
			for (int k = 0; k < seating[i].length; k++) {
				// Don't print a newline, since you want to continue printing on this line
				System.out.print(" " + seating[i][k]);
			}
			// now you print a newline
			System.out.println();
		}
	}
	private static int special() {

		for (int i = 0; i < 6; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}

		return -1;
	}
	private static void printBoardingPass(int seatnumber) {
	
		System.out.println("Boarding pass for seat number: " + seatnumber);
		System.out.println("This ticket is non-refundable and non-transferable.");
		System.out.println("Please be curteous, do not smoke. Enjoy your trip.");
		System.out.println();
	}
}

 //end of class
