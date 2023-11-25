package com.kn.excepttion;

import java.util.Scanner;

public class CalculatorApp 
{
public static void main(String[] args) {
	System.out.println("welcome to calculator application");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the numerator value = ");
	int n = sc.nextInt();
	System.out.println("enter the denominator value = ");
	int d = sc.nextInt();
	double division=0;
	try {
	 division = n/d;
	}
	catch(ArithmeticException ae)
	{
		System.out.println("denominator must be not be zero ");
	}
	System.out.println("division = "+division);
	System.out.println("thank you for using calculator app");
	sc.close();
}
}
