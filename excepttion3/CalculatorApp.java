package com.kn.excepttion3;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args)
	{
		System.out.println("Welcome to calculator application");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number = ");
		int a = sc.nextInt();
		System.out.println("enter the second number = ");
		int b = sc.nextInt();
		multiply(a,b);
		System.out.println("*****End of main() method*****");
		sc.close();
		System.out.println("Thank you for using calculator application");
	}

	public static void multiply(int a, int b) 
	{
		System.out.println("multiply() method started");
		int product = a*b;
		System.out.println("Product = "+product);
		divide(a,b);
		System.out.println("Mutliply() method ended");
	}

	public static void divide(int a, int b)
	{
		System.out.println("divide() method started");
		double quotient = a/b;
		System.out.println("Quotient = "+quotient);
		System.out.println("divide() method ended");
	}

}
