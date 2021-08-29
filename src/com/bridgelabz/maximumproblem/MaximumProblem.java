package com.bridgelabz.maximumproblem;

import java.util.Scanner;

public class MaximumProblem {
	
	public static <E extends Comparable<E>> void findMaximum(E first, E second, E third) {
		
		E maximum = first;
		
		if(first.compareTo(second) == -1 ) {
			if(second.compareTo(third) == -1) {
				maximum = third;
			}
			else {
				maximum = second;
			}
		}
		else if(first.compareTo(third) == -1) {
			maximum = third; 
		}
		System.out.println("Maximum: "+maximum);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Float: ");
		Float firstFloatNumber = Float.valueOf(scanner.nextFloat());
		System.out.print("Enter Second Float: ");
		Float secondFloatNumber = Float.valueOf(scanner.nextFloat());
		System.out.print("Enter Third Float: ");
		Float thirdFloatNumber = Float.valueOf(scanner.nextFloat());
		findMaximum(firstFloatNumber, secondFloatNumber, thirdFloatNumber);
		scanner.close();
	}
}