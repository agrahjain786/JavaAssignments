package com.techlabs.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class FindPairEqualToSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = scanner.nextInt();
		int array[] = new int[n];
		System.out.print("Enter the elements: ");
		int sum = 0;
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		sum /= n;
		Arrays.sort(array);
		
		int i=0,j=n-1;
		boolean flag = false;
		
		while(i<j) {
			if(array[i] + array[j] == sum) {
				System.out.println("Required Pair: "+ array[i]+ " "+ array[j]);
				flag = true;
				break;
			}
			else if(array[i] + array[j] < sum) i++;
			else j--;
		}
		
		if(flag == true) System.out.println("Yes! There exists a pair.");
		else System.out.println("No, There does not exists a pair.");
		scanner.close();
	}

}
