package com.kn.excepttion1;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("welcome to bank Application");
		System.out.println("enter the pin = ");
		int pin = sc.nextInt();
		if(pin==9999)
		{
			System.out.println("continue with further transcation");
		}
		else
		{
			System.out.println("invalid pin");
		}
		}
		catch(Exception e)
		{
			System.out.println("Pin should be numeric value");
		}
		finally
		{
			sc.close();
//			System.out.println("Scanner object closed successfully");
		}
		System.out.println("Bank application completed successfully");
	}

}
