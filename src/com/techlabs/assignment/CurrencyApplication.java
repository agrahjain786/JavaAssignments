package com.techlabs.assignment;

import java.util.Scanner;

public class CurrencyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the withdrawal amount: ");
		int withdrawal_amount = scanner.nextInt();
		if(withdrawal_amount > 50000) {
			System.out.println("Amount exceeds withdrwal limit of 50000");
		}
		else if(withdrawal_amount%100 != 0) {
			System.out.println("Amount should be in multiples of 100");
		}
		else {
			int two_thousand_notes = withdrawal_amount/2000;
			if(two_thousand_notes > 0) {
				System.out.println("Two Thousand: "+ two_thousand_notes);
				withdrawal_amount -= 2000*two_thousand_notes; 
			}
			int five_hundred_notes = withdrawal_amount/500;
			if(five_hundred_notes > 0) {
				System.out.println("Five Hundred: "+ five_hundred_notes);
				withdrawal_amount -= 500*five_hundred_notes; 
			}
			int two_hundred_notes = withdrawal_amount/200;
			if(two_hundred_notes > 0) {
				System.out.println("Two Hundred: "+ two_hundred_notes);
				withdrawal_amount -= 200*two_hundred_notes; 
			}
			int one_hundred_notes = withdrawal_amount/100;
			if(one_hundred_notes > 0) {
				System.out.println("One Hundred: "+ one_hundred_notes);
				withdrawal_amount -= 100*one_hundred_notes; 
			}
		}
		scanner.close();
	}

}
