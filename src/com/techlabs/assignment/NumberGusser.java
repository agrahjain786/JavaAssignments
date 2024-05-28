package com.techlabs.assignment;

import java.util.Scanner;
import java.util.Random;

public class NumberGusser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean want_to_play = true;
		while(want_to_play) {
			int system_generated_number = random.nextInt(100)+1;
			int number_of_attempts = 0;
			boolean correct_guess = false;
			while(!correct_guess) {
				System.out.print("Guess a number: ");
				int guess_number = scanner.nextInt();
				number_of_attempts++;
				if(guess_number == system_generated_number) {
					correct_guess = true;
					System.out.println("You have guessed the number!! \nYou won in: "+number_of_attempts+ " attempts");
					break;
				}
				else if(guess_number > system_generated_number) {
					if(guess_number - system_generated_number > 10) System.out.println("Sorry Too High!");
					else System.out.println("High!");
				}
				else {
					if(system_generated_number - guess_number > 10) System.out.println("Sorry Too Low!");
					else System.out.println("Low!");
				}
				if(number_of_attempts == 10) {
					System.out.println("You have exceed the maximum guessing limit!");
					break;
				}
			}
			System.out.print("Do you want to play the game again: yes or no? ");
			String play_again = scanner.next();
			if(play_again.equals("no")) want_to_play = false;
		}
		scanner.close();
	}
}
