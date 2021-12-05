package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> stringa = new ArrayList<String>();

		// 2. Add five Strings to your list
		stringa.add("Mike");
		stringa.add("Mark");
		stringa.add("Mel");
		stringa.add("Mert");
		stringa.add("Marv");

		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < stringa.size(); i++) {
			String s = stringa.get(i);
			System.out.println(s);
		}
		
		System.out.println(" ");

		// 4. Print all the Strings using a for-each loop
		for (String s : stringa) {
			System.out.println(s);
		}
		
		System.out.println(" ");
		
		// 5. Print only the even numbered elements in the list. (coming back)
		for (int i = 0; i < stringa.size(); i++) {
			if ((i + 1) % 2 == 0) {
				String s = stringa.get(i);
				System.out.println(s);
			}
			else {
				System.out.println(" ");
			}
		}
		
		System.out.println(" ");

		// 6. Print all the Strings in reverse order.
		for (int i = stringa.size() - 1; i >= 0; i--) {
			String s = stringa.get(i);
			System.out.println(s);
		}

		System.out.println(" ");
		
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < stringa.size(); i++) {
			String s = stringa.get(i);
			
			if (s.contains("e")) {
				System.out.println(s);
			}
			
		}

	}
}