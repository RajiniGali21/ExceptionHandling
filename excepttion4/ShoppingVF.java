package com.kn.excepttion4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingVF {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to shopping allpication");
		shop();
		System.out.println("*******main() method ended********");
	}

	public static void shop() 
	{
		System.out.println("Shop() method started");
		try {
		pay();
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Shapping is failed to inappropraite input!!!");
		}
		System.out.println("Shop() method ended");
	}

	public static void pay() throws InputMismatchException
//	throws===== show warning to caller method
	{
		System.out.println("pay() method started");
		Scanner sc = null;
		System.out.println("Enter the amount to be paid = ");
		try
		{
			sc=new Scanner(System.in);
			double amount = sc.nextDouble();
			System.out.println("Amount paid = "+amount);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Exception handled in pay()");
			throw ime; //re-throwing exception
		}
		sc.close();
		System.out.println("PAy() method ended");
	}

}
