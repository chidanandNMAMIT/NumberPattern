package numpattern;

import java.util.HashSet;
import java.util.Set;

public class VowelContains {

	public static void main(String[] args) {

		String str = "chidanand";
		String temp = "aeiou";

		Set set = new HashSet();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				set.add(i);
			}
		}

		if (set.size() == temp.length()) {
			System.out.println("String contains Vowels");
		} else {
			System.out.println("String Not contains Vowels");
		}

	}

}
