package Day4.ArrayList;

import java.util.*;

public class Example7 {

	/*
	* adding of values in arraylist using scanner and loops
	* run a for loop to add four cities in arraylist of string and then display all of them
	* names of cities should be received by user-input using Scanner
	*/
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		ArrayList<String> arrlist = new ArrayList<String>();
		System.out.println(" cities you have to add");
		// use differnt scanner for int and string
		
		System.out.println("Do you want to enter the cities : ");
		String accept=sc1.nextLine();
		while(accept.equalsIgnoreCase("yes"))
		{
			System.out.print("please eneter number of cities you want to add : ");
			int n =sc2.nextInt();
			
			for(int i=0;i<n;i++)
			{
				System.out.print(i+1+ " : ");
				String city = sc1.nextLine();
				arrlist.add(city);
			}
			
			System.out.println("Do you want to add more cities : ");
			String accept1=sc1.nextLine();
			if(accept1.equalsIgnoreCase("yes"))
				continue;
			else
				System.out.println("Thank you");
				break;
		}
		
				
		System.out.println("The cities you have entered are : ");
		for(String x:arrlist)
		{
			System.out.println(x);
		}
		
	}
	
}
