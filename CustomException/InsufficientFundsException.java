package com.kn.CustomException;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(){
		super();
	}
	public InsufficientFundsException(String s)
	{
		super(s);
	}

}
