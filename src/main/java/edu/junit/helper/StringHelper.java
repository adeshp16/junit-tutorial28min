package edu.junit.helper;

public class StringHelper {

	/**
	 * 
	 * @author ashish_admin
	 * This method truncates letter A from first to positions if any.
	 * @param str: input string
	 * @return
	 */
	public String truncateAInFirst2Positions(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") 
				+ stringMinusFirst2Chars;
	}
	
	
	/**
	 * @author ashish_admin
	 * This method checks if first and last 2 characters are same, if yes returns true
	 * @param str
	 * @return
	 */
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}
	
}
