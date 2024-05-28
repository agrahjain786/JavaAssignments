package com.techlabs.assignment;

import java.util.Scanner;

public class SquaresOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = scanner.nextInt();
		int array[] = new int[n];
		System.out.print("Enter the elements: ");
		int split_index = 0;
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
			if(array[i] < 0) split_index = i;
		}
		
		int output[] = new int[n];
			
		int i = split_index,j=split_index+1;
		int k = 0;
		
		while(i>=0 && j<n) {
			if(Math.abs(array[i]) <= array[j]) {
				output[k++] = array[i]*array[i];
				i--;
			}
			else {
				output[k++] = array[j]*array[j];
				j++;
			}
		}
		
		while(i>=0) {
			output[k++] = array[i]*array[i];
			i--;
		}
		
		while(j<n) {
			output[k++] = array[j]*array[j];
			j++;
		}
		
		System.out.print("Output Array: ");
		for(int a=0;a<n;a++) {
			System.out.print(output[a]+ " ");
		}
		System.out.println();
		scanner.close();

	}

}
