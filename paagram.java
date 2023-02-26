package com.contest3;

import java.util.HashSet;
import java.util.Set;
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
public class pannagramcheck {

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		String sentence1 = "naveenkumar";
		
	System.out.println(checkIfPangram(sentence1));

	}
	

	    public static boolean checkIfPangram(String sentence) {
	        int n = sentence.length();
	        
	        Set<Character> set = new HashSet<>();
	        for (int idx = 0; idx < n; idx++) {
	            Character c = sentence.charAt(idx);
	            set.add(c);
	        }
	        
	        return set.size() == 26;
	    }


}
