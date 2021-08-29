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
		System.out.print("Enter First Integer: ");
		Integer firstIntegerNumber = Integer.valueOf(scanner.nextInt());
		System.out.print("Enter Second Integer: ");
		Integer secondIntegerNumber = Integer.valueOf(scanner.nextInt());
		System.out.print("Enter Third Integer: ");
		Integer thirdIntegerNumber = Integer.valueOf(scanner.nextInt());
		findMaximum(firstIntegerNumber, secondIntegerNumber, thirdIntegerNumber);
		scanner.close();
	}
}