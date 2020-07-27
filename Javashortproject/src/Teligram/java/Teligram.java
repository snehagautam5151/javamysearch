package Teligram.java;

import java.util.Scanner;


	public class Teligram {
		 
	public static void main(String[] args) {
			 Scanner s = new Scanner(System.in);  // Create a Scanner object for user to get input
			 Client k = new Client();
			 

			
			    System.out.println("Enter username");

				 k.setFirstName(s.nextLine());
				 
				 System.out.println("Enter Phone number");
				 
				 k.setPhoneNum(s.nextLong());
				 
				 System.out.println("Enter Age");

				 k.setAge(s.nextInt());
				 
			    System.out.println("First name is: " + k.getFirstName());  // Output user input 
			    System.out.println("Phone number is: " + k.getPhoneNum()); 
			    System.out.println("enter your age: " + k.getAge());
			    
			
		 }


}
