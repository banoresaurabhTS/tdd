package co.interleap.courses.tdd;

public class VowelCounter {
	 public int count(String string) {
		 int ans = 0;
	        for(int i = 0; i < string.length(); i++) {
	        	if(isVowel(string.substring(i, i+1))) ans++;
	        }
	        return ans;
	    }
	 boolean isVowel(String ch) {
		 return "aeiouAEIOU".contains(ch);
	 }
}