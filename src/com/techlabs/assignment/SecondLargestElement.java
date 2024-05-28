package com.techlabs.assignment;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = scanner.nextInt();
		int array[] = new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		
		int largest_element = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(largest_element < array[i]) {
				largest_element = array[i];
			}
		}
		
		int second_largest = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if((array[i] != largest_element) && (second_largest < array[i])) {
				second_largest = array[i];
			}
		}
		
		if(second_largest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element in the array.");
		}
		else {
			System.out.println("Second Largest element in the array is: "+ second_largest);
		}
		scanner.close();
	}

}
