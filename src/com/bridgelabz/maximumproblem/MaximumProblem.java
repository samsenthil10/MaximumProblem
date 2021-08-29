package com.bridgelabz.maximumproblem;

import java.util.Scanner;

public class MaximumProblem<E extends Comparable<E>> {

	E firstValue;
	E secondValue;
	E thirdValue;

	public MaximumProblem(E firstValue, E secondValue, E thirdValue) {

		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}

	public void findMaximum() {

		E maximum = firstValue;

		if(firstValue.compareTo(secondValue) == -1 ) {
			if(secondValue.compareTo(thirdValue) == -1) {
				maximum = thirdValue;
			}
			else {
				maximum = secondValue;
			}
		}
		else if(firstValue.compareTo(thirdValue) == -1) {
			maximum = thirdValue; 
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
		new MaximumProblem<Integer>(firstIntegerNumber, secondIntegerNumber, thirdIntegerNumber).findMaximum();
		scanner.nextLine();

		System.out.print("Enter First Float: ");
		Float firstFloatNumber = Float.valueOf(scanner.nextFloat());
		System.out.print("Enter Second Float: ");
		Float secondFloatNumber = Float.valueOf(scanner.nextFloat());
		System.out.print("Enter Third Float: ");
		Float thirdFloatNumber = Float.valueOf(scanner.nextFloat());
		new MaximumProblem<Float>(firstFloatNumber, secondFloatNumber, thirdFloatNumber).findMaximum();
		scanner.nextLine();

		System.out.print("Enter First String: ");
		String firstString = String.valueOf(scanner.nextLine());
		System.out.print("Enter Second String: ");
		String secondString = String.valueOf(scanner.nextLine());
		System.out.print("Enter Third String: ");
		String thirdString = String.valueOf(scanner.nextLine());
		new MaximumProblem<String>(firstString, secondString, thirdString).findMaximum();
		scanner.close();
	}
}