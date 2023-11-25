package com.kn.excepttion6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramDemo {

	public static void main(String[] args) 
	{
	System.out.println("Program started");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the a = ");
	int a = sc.nextInt();
	System.out.println("enter the b = ");
	int b = sc.nextInt();
	add(a,b);
	sub(a,b);
	try {
		multi(a,b);
	} catch (Exception e) {
		System.out.println("exception handled in mulitplication");
		e.printStackTrace();
	}
	try {
	div(a,b);
	}
	catch(Exception e)
	{
		System.out.println("inside main()===> exception handled");
	}
	System.out.println("program ended successfully");
	sc.close();
	}

	public static void div(int a,int b) throws ArithmeticException,InputMismatchException 
	{
		System.out.println("Division method started");
		double divide=0;
		try {
		 divide = a/b;
		}
		catch(Exception e)
		{
		System.out.println("inside divide() method ===> exception handled:Denominator must not be zero");
		throw e;
		}
		finally {
		System.out.println("Division = "+divide);
		System.out.println("Division method ended successfully");
		}
	}
	

	public static void multi(int a, int b) throws Exception
	{
		System.out.println("Mutliplication method started");
		int multiply = a*b;
		System.out.println("exception handled");
		System.out.println("Multiplication = "+multiply);
		System.out.println("Multiplication method ended successfully");
	}
	

	public static void sub(int a,int b) 
	{
		System.out.println("Subtraction method started");
		try {
		int subtract = a-b;
		System.out.println("Subtraction = "+subtract);
		}
		catch (Exception e) {
			System.out.println("exception handled");
			e.printStackTrace();
		}
		System.out.println("Subtraction method ended successfully");
	}

	public static void add(int a,int b) 
	{
		System.out.println("Addition method started");
		int addition = a+b;
		System.out.println("exception not handled");
		System.out.println("Addition = "+addition);
		
		System.out.println("Addition method ended successfully");
	}

}
