package com.kn.excepttion5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) 
	{
		System.out.println("program started");
		try {
			takeInput();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("program ended successfully");
	}

	public static void takeInput() throws IOException {
		System.out.println("takeinput() method started");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input=br.readLine();
		
		System.out.println("Input = "+input);
	}

}
