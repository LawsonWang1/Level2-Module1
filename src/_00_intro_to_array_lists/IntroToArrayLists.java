package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String>letters = new ArrayList<String>();
		//   Don't forget to import the ArrayList (java.util) class

		//2. Add five Strings to your list
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");
		letters.add("E");
		//3. Print all the Strings using a standard for-loop
		for (int x = 0; x < letters.size(); x++) {
			System.out.println(letters.get(x));
		}
		//4. Print all the Strings using a for-each loop
		for (String n: letters) {
			System.out.println(n);
		}
		//5. Print only the even numbered elements in the list.
		for(int x = 0; x < letters.size(); x++) {
			if (x % 2 == 0) {
				System.out.println(letters.get(x));
			}
		}
		
		//6. Print all the Strings in reverse order.
		for (int x = letters.size()-1; x >= 0; x--) {
			System.out.println(letters.get(x));
		}
		
		//7. Print only the Strings that have the letter 'e' in them.
		for(int x = 0; x < letters.size(); x++) {
			if (letters.contains("E")) {
				System.out.println(letters.get(x));
			}
		}
	}
}
