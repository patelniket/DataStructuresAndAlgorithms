package me.niketpatel.common;

public class Factorial {
	
	public static int factorial(int n){
		
		if (n == 0) return 1;
		return n * factorial(n-1);
	}
	
	
	public static int sumSquares(int n){
		if (n == 1) return 1;
		return n * n + sumSquares(n-1);
	}
	public static void main (String[] args){
		
		System.out.println(sumSquares(3));
	}

}
