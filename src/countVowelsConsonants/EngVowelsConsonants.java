/**
 * 
 */
package countVowelsConsonants;

/**
 * @author NathanClarke
 *
 */

import java.util.*;

public class EngVowelsConsonants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please input a sentence");
		
		Scanner scan = new Scanner(System.in);
		String search = "";
		
		if(scan.hasNextLine()) {
			search = scan.nextLine();
		}
		checkVowels(search);
		checkConsonants(search);
		
		scan.close();
	}
	
	public static void checkVowels(String str) {
		
		String test = str;
		String rgx = "^[AaEeIiOoUu]*$";
		int count = 0;
		
		for(int a = 0; a < test.length(); a++) {
			if(String.valueOf(test.charAt(a)).matches(rgx)) {
				count++;
			}
		}
		System.out.println("There are " + count + " vowels in your sentence");
	}
	
	public static void checkConsonants(String str) {
		String test = str;
		String rgx = "^((?i)[a-z&&[^aeiou]]*)$";
		int count = 0;
		
		for(int a = 0; a < test.length(); a++) {
			if(String.valueOf(test.charAt(a)).matches(rgx)) {
				count++;
			}
		}
		System.out.println("There are " + count + " consonants in your sentence");
	}

}
