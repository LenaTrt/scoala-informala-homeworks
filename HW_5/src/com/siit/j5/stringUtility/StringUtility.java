package com.siit.j5.stringUtility;


public class StringUtility {
	private String noSpaces;
	private int digitWords = 0;
	private String noDigitWords;
	private String [] wordDigits = {"zero","one", "two", "three","four",
	        "five", "six", "seven", "eight", "nine"};
	private String [] digits = {"0", "1", "2", "3", "4",
	        "5", "6", "7", "8", "9"};



	public StringUtility(String s)
	{
	    String [] strSplit = s.split(" ");
	    for(int i = 0; i < strSplit.length; i++)
	    {
	        for (int j = 0; j < wordDigits.length; j++)
	        {
	            if (strSplit[i].equalsIgnoreCase(wordDigits[j]))
	                    digitWords++;
	        }
	    }


	    noSpaces = s.replace(" ","");
	    
	    noDigitWords = s;
	    
	    for(int i = 0; i < strSplit.length; i++)
	    {
	        for (int j = 0; j < wordDigits.length; j++)
	        {
	            if (strSplit[i].equalsIgnoreCase(wordDigits[j])){
	                noDigitWords = noDigitWords.replace(strSplit[i], digits[j]);
	                break;
	            }
	        }
	    }
	}

	public String getNoSpaceString()
	{
	    return noSpaces;
	}

	
	public String getNoDigitWordString()
	{
	    return noDigitWords;
	}

	
	}
