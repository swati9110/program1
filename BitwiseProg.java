package org.cei.work;
import java.util.*;
public class BitwiseProg 
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number");
			int x=sc.nextInt();
			//left shift operator shift the bits of x towards left n position
			System.out.println("left shift operator x<<2="+(x<<2));
			//right shift operator shift the bits of x towards  right n position
			System.out.println("right shift operator x>>2="+(x>>2));
		}

}
