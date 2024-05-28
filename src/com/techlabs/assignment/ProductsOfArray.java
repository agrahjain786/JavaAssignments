package com.techlabs.assignment;

import java.util.Scanner;

public class ProductsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = scanner.nextInt();
		int array[] = new int[n];
		System.out.print("Enter the elements: ");
		
		int no_of_zeros = 0;
		int total_product = 1;
		int zero_index = 0;
		
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
			if(array[i] == 0) {
				no_of_zeros += 1;
				zero_index = i;
			}
			else total_product *= array[i];
		}
		
		int output[] = new int[n];
		
		if(no_of_zeros == 0) {
			for(int i=0;i<n;i++) {
				output[i] = total_product/array[i];
			}
		}
		
		else if(no_of_zeros == 1) output[zero_index] = total_product;
		
		System.out.print("Output Array: ");
		for(int i=0;i<n;i++) {
			System.out.print(output[i]+ " ");
		}
		System.out.println();
		
		scanner.close();
	}

}
