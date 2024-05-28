package com.techlabs.assignment;

import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Treasure Island! Your mission is to find the treasure");
		System.out.print("Enter a direction: ");
		String chosen_direction = scanner.nextLine();
		chosen_direction = chosen_direction.trim().toLowerCase();
		if(chosen_direction.equals("left")) {
			System.out.print("Want to swin or wait?");
			String chosen_action = scanner.nextLine();
			chosen_action = chosen_action.trim().toLowerCase();
			if(chosen_action.equals("wait")) {
				System.out.print("Enter the color of the door which you want to enter: ");
				String chosen_color = scanner.nextLine();
				chosen_color = chosen_color.trim().toLowerCase();
				if(chosen_color.equals("yellow")) {
					System.out.println("You win!!");
				}
				else if(chosen_color.equals("red")) {
					System.out.println("You are Burned by fire!!");
					System.out.println("Game Over!");
				}
				else {
					System.out.println("You are eaten by beasts!!");
					System.out.println("Game Over!");
				}
			}
			else {
				System.out.println("You are attacked by the trout!!");
				System.out.println("Game Over!");
			}
		}
		else {
			System.out.println("You Fell into the hole!!");
			System.out.println("Game Over!");
		}
		scanner.close();
	}
}