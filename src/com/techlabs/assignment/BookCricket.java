package com.techlabs.assignment;

import java.util.Random;
import java.util.Scanner;

public class BookCricket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Enter the name of player1: ");
		String player1_name = scanner.next();
		System.out.print("Enter the name of player2: ");
		String player2_name = scanner.next();
		System.out.println("\nTotal Number of Pages in a book is 1-300");
		
		int player1_score = play(player1_name, scanner, random);
		int player2_score = play(player2_name, scanner, random);
		
		if(player1_score < player2_score) {
			System.out.println("\n"+player2_name+" is winner");
		}
		else if(player1_score > player2_score) {
			System.out.println("\n"+player1_name+" is winner");
		}
		else System.out.println("\nIts a Tie!");
		
		scanner.close();
	}
	
	public static int play(String player, Scanner scanner, Random random) {
		System.out.println("\n"+player + " starts playing -> \n");
		int number_of_turns = 0;
		char want_to_play = 'y';
		int total_score = 0;
		
		while(want_to_play == 'y'  && number_of_turns < 300) {
			number_of_turns++;
			System.out.println("Turn -> "+number_of_turns);
			
			int page_number = random.nextInt(300)+1;
			System.out.println("Page Number Generated: "+page_number);
			int score = page_number%7;
			total_score += score;
			System.out.println("Score: "+score);
			System.out.println("Total Score: "+total_score);
			
			if(score == 0) break;
			System.out.print("\nContinue playing -> y/n -> ");
			want_to_play = scanner.next().charAt(0);
		} 
		
		System.out.println("\n"+player+"'s Total Score is "+ total_score+" in "+ number_of_turns+ " turns.");
		return total_score;
	}
}
