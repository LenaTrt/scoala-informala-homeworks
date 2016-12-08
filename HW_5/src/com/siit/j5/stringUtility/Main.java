package com.siit.j5.stringUtility;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
	    String input;
	    Scanner keyboard = new Scanner(System.in);

	    System.out.print("Enter text: ");
	    input = keyboard.nextLine();

	    StringUtility str = new StringUtility(input);

	    System.out.println("Text with spaces removed: " + str.getNoSpaceString());
	    System.out.println("Text with digit words replaced: " + str.getNoDigitWordString());
	}
}
