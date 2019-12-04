package co.interleap.courses.tdd;

public class VowelCounter {
	 public int count(String string) {
		 	String regEx = "(?i)[^aeiuo]+";
	        return string.replaceAll(regEx, "").length();
	    }
	 
}