package com.techlabs.assignment;

import java.util.Scanner;

public class IsSubstringOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the string 1: ");
		String str1 = scanner.next();
		System.out.print("Enter the string 2: ");
		String str2 = scanner.next();
		// in O(N) Time Complexity
		
		int lps[]= new int[str2.length()];
		
		int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < str2.length()) {
            if (str2.charAt(i) == str2.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0) len = lps[len - 1];
                else{
                    lps[i] = len;
                    i++;
                }
            }
        }
        i = 0;
        int j=0;
        boolean flag = false;
        while ((str1.length() - j) >= (str2.length() - i)) {
            if (str2.charAt(i) == str1.charAt(j)) {
                j++;
                i++;
            }
            if (i == str2.length()) {
            	System.out.println("Found pattern at index: "+ (j-i));
            	flag = true;
                break;
            }
            else if (j < str1.length() && str2.charAt(i) != str1.charAt(j)) {
                if (i != 0) i = lps[i - 1];
                else j += 1;
            }
        }
        if (flag == true) System.out.println("Yes! Second string is substring of First");
        else System.out.println("No! Second string is not substring of First");
        scanner.close();
	}

}
