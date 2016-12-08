package com.siit.j5.stringUtilityTests;


import org.junit.Assert;
import org.junit.Test;

import com.siit.j5.stringUtility.StringUtility;

public class StringUtilityTests {

	@Test
	public void stringHasNoWhiteSpaces() {
		//given
		 String input = "Amyhasfourfriends.";
		 StringUtility str = new StringUtility(input);
		//when
		 String expected = str.getNoSpaceString ();
		//then
		String correctlyNoSpaceString = new String ("Amyhasfourfriends.");
		Assert.assertEquals(correctlyNoSpaceString, expected);
		
	}
	
	@Test
	public void stringWithDigitWordsAreChangedInDigits() {
		//given
		 String input = "Amy has four friends.";
		 StringUtility str = new StringUtility(input);
		//when
		 String expected = str.getNoDigitWordString ();
		//then
		 String correctlyNoDigitWordString = new String ("Amy has 4 friends.");
		 Assert.assertEquals(correctlyNoDigitWordString, expected);

	}
	
	@Test
	public void stringWithSpaceBeforeAndAfterWordsIsNoSpaceString() {
		//given
		 String input = "  three  four  ";
		 StringUtility str = new StringUtility(input);
		//when
		 String expected = str.getNoSpaceString ();
		//then
		 String correctlyNoSpaceString = new String ("threefour");
		 Assert.assertEquals(correctlyNoSpaceString, expected);

    }
	
	@Test
	public void stringWithUpperAndLowerCaseChanged() {
		//given
		 String input = "Amy has FOUr friends and TWO cats.";
		 StringUtility str = new StringUtility(input);
		//when
		 String expected = str.getNoDigitWordString ();
		//then
		 String correctlyNoDigitWordString = new String ("Amy has 4 friends and 2 cats.");
		 Assert.assertEquals(correctlyNoDigitWordString, expected);

	}



}
