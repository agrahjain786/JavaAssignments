package com.techlabs.assignment;

import java.util.Scanner;

public class RideBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your height in cm: ");
		int height = scanner.nextInt();
		int total_bill=0;
		if(height > 120) {
			System.out.println("You Can ride!!");
			System.out.print("What is your Age: ");
			int age = scanner.nextInt();
			
			if(age < 12) total_bill = 5;
			else if(age >= 12 && age < 18) total_bill = 7;
			else if(age >= 18 && age < 45)total_bill = 12;
			else total_bill = 0;
			
			System.out.println("Do you want Photos: yes or no?");
			String want_photos = scanner.next();
			
			if(want_photos.equals("yes")) {
				total_bill += 3;
			}
			System.out.print("Total Bill is: " + total_bill+"$");
		}
		else {
			System.out.println("You Can't ride!!");
		}
		scanner.close();
	}

}
