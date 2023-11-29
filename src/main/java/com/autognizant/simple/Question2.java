//		Q. Write a java program to print the sum of all integers until it becomes single digit. 
//
//		Input/Expected Output:
//		int a = 1234567890; // Output : 9
//		int a = 1234567894; // Output : 4
//		int a = 234567894; // Output : 3

package com.autognizant.simple;

public class Question2 {

	public static void main(String[] args) {
		int a1 = 1234567890; // Output : 45 => (4+5) => 9
		int a2 = 1234567894; // Output : 49 => (4+9) => 13 => (1+3) => 4
		int a3 = 234567894; // Output : 48 => (4+8) => 12 => (1+2) => 3
		
//		int a = 123;
		// r = a%10 => 3 => 2
		// sum = sum + r => 0+3 => 3 => 3+2 => 5 = 6
		// a = a/10; => 12
		
		int sum1 = calculateSumOfAllIntegers(a1);
		System.out.println("Output for a1 = " + sum1);
		
		int sum2 = calculateSumOfAllIntegers(a2);
		System.out.println("Output for a2 = " + sum2);
		
		int sum3 = calculateSumOfAllIntegers(a3);
		System.out.println("Output for a3 = " + sum3);

	}

	/*
	private static int calculateSumOfAllIntegers(int a) {
		int sum = 0;
		int r = 0;
		while(a>0) {
			r = a%10;
			sum = sum + r;
			a = a/10;
		}
		System.out.println("Sum = "+ sum);
		return sum;
	}*/
	
	//Using recursive function
	private static int calculateSumOfAllIntegers(int a) {
		if(a < 10) {
			return a;
		}
		int sum = 0;
		int r = 0;
		while(a>0) {
			r = a%10;
			sum = sum + r;
			a = a/10;
		}
//		System.out.println("Sum = "+ sum);
		return calculateSumOfAllIntegers(sum);
	}
}
