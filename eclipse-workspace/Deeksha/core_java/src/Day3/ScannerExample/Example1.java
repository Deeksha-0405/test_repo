package Day3.ScannerExample;

import java.util.Scanner;

public class Example1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter your name : ");
		String name= sc.nextLine();
		System.out.print("Enter your Age : ");
		int age= sc.nextInt();
		System.out.println("Your name is : " +name+ " age is : " +age);
	}

}
