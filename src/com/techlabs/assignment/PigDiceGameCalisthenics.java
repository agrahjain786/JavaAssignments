package com.techlabs.assignment;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGameCalisthenics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int total_score = 0;
		int number_of_turns = 0;
		int score_for_current_turn = 0;
		boolean isNewTurn = true;
		
		while(total_score < 20) {
			play(number_of_turns, total_score, isNewTurn, score_for_current_turn, scanner, random);
		}
		
		System.out.println("Total Score: "+ total_score);
		System.out.println("You finished in "+number_of_turns+ " turns.");
		System.out.println("\nGame Over!!");
		
		scanner.close();
	}

	private static void play(int number_of_turns, int total_score, boolean isNewTurn, int score_for_current_turn, Scanner scanner, Random random) {

			if(isNewTurn == true) newTurn(number_of_turns, score_for_current_turn, isNewTurn, scanner);
			
			String choice = rollOrHold(scanner);
			
			if(choice.equals("h")) {
				hold(total_score, score_for_current_turn, isNewTurn, scanner);
				return;
			}
				
			roll(total_score, score_for_current_turn, isNewTurn, scanner, random);
	}

	private static void hold(int total_score, int score_for_current_turn, boolean isNewTurn, Scanner scanner) {
		
				System.out.println("\nScore for turn: "+ score_for_current_turn);
				System.out.println("Total Score: "+ total_score+"\n");
				
				isNewTurn = true;
		
	}

	private static void roll(int total_score, int score_for_current_turn, boolean isNewTurn, Scanner scanner, Random random) {
		
				int die_number = random.nextInt(6)+1;
				System.out.println("Die: "+ die_number+"\n");
				
				if(die_number == 1) {
					endGame(total_score, isNewTurn, scanner);
					return; 
				}
				addScore(die_number, total_score, score_for_current_turn);
	}

	private static void addScore(int die_number, int total_score, int score_for_current_turn) {
		
				total_score += die_number;
				score_for_current_turn += die_number;
	}

	private static void endGame(int total_score, boolean isNewTurn, Scanner scanner) {
		
					total_score = 0;
					System.out.println("Turn Over. No Score\n");
					
					isNewTurn = true;
	}

	private static String rollOrHold(Scanner scanner) {
		
				System.out.print("Roll or hold?: (r/h) ");
				String roll_or_hold = scanner.next();
				return roll_or_hold;
		
	}

	private static void newTurn(int number_of_turns, int score_for_current_turn, boolean isNewTurn, Scanner scanner) {
		
				number_of_turns += 1;
				System.out.println("TURN "+ number_of_turns+"\n");
				score_for_current_turn = 0;
				
				isNewTurn = false;
	}

}
