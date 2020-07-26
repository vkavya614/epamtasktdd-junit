package com.epam.tddjunit;

public class RemoveTwoChars {

	protected String remove(String string) {
		// TODO Auto-generated method stub
		int stringLength=string.length();
		if (stringLength==0) {
			return "";
		}
		else if (stringLength==1)
		{
			return string.replace("A","");
		}
		else {
			String firstTwoChars=string.substring(0,2);
			firstTwoChars = firstTwoChars.replaceAll("A", "");
			return firstTwoChars+string.substring(2,string.length());
		}

	}

}