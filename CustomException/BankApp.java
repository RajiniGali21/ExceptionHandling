package com.kn.CustomException;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("Bank Application started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount to be withdraw = ");
		double withdrawalamount = sc.nextDouble();
		try {
			withdraw(withdrawalamount);
		} catch (Exception e) {
			System.out.println("Exception handled in ");
			e.printStackTrace();
		}
		sc.close();
	}

	public static void withdraw(double withdrawalamount) throws Exception 
	{
		double accountBalance = 15000.00;
		System.out.println("withdrawal process started");
		if(withdrawalamount<=accountBalance)
		{
			System.out.println(withdrawalamount+" has dedited from account");
			System.out.println("withdrawal process ended successfully");
		}
		else
		{
			System.out.println("Insufficient balance");
			throw new InsufficientFundsException();
		}
	}

}
