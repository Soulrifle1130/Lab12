package lab12;

/**
* File: LabProb01.java
* Class: CSCI 1302
* Author: Andrew Shippy
* Created on: 5/2/25
* Last Modified: 5/2/25
* Description: Use a recursive method to operate a recurrence relation*/

public class Lab12Prob01 {

	public static int recursiveAbstract(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 3;
		} else if (n == 2) {
			return 4;
		} else {
			return recursiveAbstract(n - 3) * (recursiveAbstract(n - 2) - recursiveAbstract(n - 1));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(recursiveAbstract(5));
	}
}