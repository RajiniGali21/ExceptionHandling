package com.kn.excepttion2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramDemo {

	public static void main(String[] args) 
	{
		System.out.println("Program excution started!!!!.......");
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("enter the size of an array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter the index = ");
		int n = sc.nextInt();
		System.out.println("enter the element = ");
		int element = sc.nextInt();
		System.out.println("enter the numerator = ");
		int numerator = sc.nextInt();
		System.out.println("enter the denominator = ");
		int denominator = sc.nextInt();
		double division = numerator/denominator;
		System.out.println(division);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Denominator must be zero");
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aiobc)
		{
			System.out.println("array size is exceeded or precceded");
			aiobc.printStackTrace();
		}
		catch(InputMismatchException ime)
		{
			System.out.println("numeric values should be given");
			ime.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("exception is occured");
			e.printStackTrace();
		}
		finally
		{
		sc.close();
		System.out.println("scanner object is closed");
		}
		
	
	}

}
