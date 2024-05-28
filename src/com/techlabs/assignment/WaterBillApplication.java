package com.techlabs.assignment;

import java.util.Scanner;

public class WaterBillApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of units consumed: ");
		int units_consumed = scanner.nextInt();
		int Meter_charge = 75;
		int charge = 0;
		if(units_consumed <= 100) {
			charge = units_consumed*5;
		}
		else {
			if(units_consumed <= 250) {
				charge = units_consumed*10;
			}
			else {
				charge = units_consumed*20;
			}
		}
		int total_water_bill = charge + Meter_charge;
		System.out.println("Total Water bill is: "+ total_water_bill);
		scanner.close();
	}

}
