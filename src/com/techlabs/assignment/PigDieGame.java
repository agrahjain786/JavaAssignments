package com.techlabs.assignment;

import java.util.Scanner;
import java.util.Random;

public class PigDieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int total_score = 0;
		int number_of_turns = 0;
		
		while(total_score < 20) {
			number_of_turns += 1;
			System.out.println("TURN "+ number_of_turns+"\n");
			
			int score_for_turn = 0;
			
			while(total_score < 20) {
				System.out.print("Roll or hold?: (r/h) ");
				String roll_or_hold = scanner.next();
				
				if(roll_or_hold.equals("r")) {
					int die_number = random.nextInt(6)+1;
					System.out.println("Die: "+ die_number+"\n");
					
					if(die_number == 1) {
						total_score = 0;
						System.out.println("Turn Over. No Score\n");
						break;
					}
					else {
						total_score += die_number;
						score_for_turn += die_number;
					}
				}
				else {
					System.out.println("\nScore for turn: "+ score_for_turn);
					System.out.println("Total Score: "+ total_score+"\n");
					break;
				}
			}
		}
		
		System.out.println("Total Score: "+ total_score);
		System.out.println("You finished in "+number_of_turns+ " turns.");
		System.out.println("\nGame Over!!");
		
		scanner.close();
	}

}
