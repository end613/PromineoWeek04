//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(i);
			if (i != 9) {
				sb.append("-");
			}
		}
		
		System.out.println("---1---");
		System.out.println();
		System.out.println(sb);
		System.out.println(); 
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length

		List<String> list = new ArrayList<String>();
		list.add("Everett");
		list.add("Edward");
		list.add("Chadwick");
		list.add("Jody");
		list.add("Jessalyn");
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println("---2---");
		System.out.println();
		shortString(list);
		System.out.println();
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched

		System.out.println("---3---");
		System.out.println();
		System.out.println(elementSwap(list));
		System.out.println();
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma

		System.out.println("---4---");
		System.out.println();
		System.out.println(withCommas(list));
		System.out.println();
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)

		System.out.println("---5---");
		System.out.println();
		
		String name = "Paul";
		System.out.println(addToList(list, name));
		System.out.println();
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

		System.out.println("---6---");
		System.out.println();
		
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < 16; i++) {
			numList.add(i * 7);
		}
		System.out.println(factorTable(numList));
		System.out.println();
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string

		System.out.println("---7---");
		System.out.println();
		System.out.println(list);
		System.out.println(numOfLetters(list));
		System.out.println();
		
		// 9. Create a set of strings and add 5 values

		HashSet<String> set = new HashSet<String>();
		set.add("Julius Caesar");
		set.add("Constantine");
		set.add("Justinian");
		set.add("Antinious Pious");
		set.add("Theodosius");
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		
		System.out.println("---8---");
		System.out.println();	
		CharSequence nameIncludes = "o";
		System.out.println(withChar(set, nameIncludes));
		System.out.println();
		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
	
		System.out.println("---9---");
		System.out.println();
		System.out.println(setToList(set));
		System.out.println();
		
		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set

		System.out.println("---10---");
		System.out.println();
		HashSet<Integer> numSet = new HashSet<Integer>();
		for (int i = 0; i < 11; i++) {
			numSet.add(i * 117);
		}
		System.out.println(numSet);
		System.out.println(onlyEvens(numSet));
		System.out.println();
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Gladius", "The sword for Ancient Roman foot soldiers.");
		dictionary.put("Scutum", "The shield for Ancient Roman foot soldiers");
		dictionary.put("Lorica Segmentata", "The plated armor for Ancient Roman officers.");
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		
		System.out.println("---11---");
		System.out.println();
		String key = "Gladius";
		System.out.println(lookUp(dictionary, key));
		System.out.println();
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		
		System.out.println("---12---");
		System.out.println();
		Map<Character, Integer> startingLetterCount = beginsWith(list);
		for (Character character : startingLetterCount.keySet()) {
			System.out.println(character + ": " + startingLetterCount.get(character));
		}
		System.out.println();

	}
	
	
	// Method 15:
	
	public static Map<Character, Integer> beginsWith(List<String> list) {
		Map<Character, Integer> firstLetter = new HashMap<Character, Integer>();
		for (String name : list) {
				char e = name.charAt(0);
				if (firstLetter.get(e) == null) {
					firstLetter.put(e,  1);
				} else {
					firstLetter.put(e,  firstLetter.get(e) + 1);
				}
			
		}
		return firstLetter;
	}
	
	// Method 14:
	
	public static String lookUp(HashMap<String, String> search, String key) {
		for (String word : search.keySet()) {
			if (word.equals(key)) {
				return search.get(word);
			}
		}
		return "";
	}
	
	
	// Method 12:
	
	public static HashSet<Integer> onlyEvens(HashSet<Integer> numSet) {
		HashSet<Integer> evenSet = new HashSet<Integer>();
		for (Integer num : numSet) {
			if (num % 2 == 0) {
				evenSet.add(num);
			}
		}
		return evenSet;
	}
	
	// Method 11:
	
	public static List<String> setToList(HashSet<String> set) {
		List<String> list = new ArrayList<String>();
		for (String name : set) {
			list.add(name);
		}
		return list;
	}

	// Method 10:
	
	public static HashSet<String> withChar(HashSet<String> set, CharSequence nameIncludes) {
		HashSet<String> newSet = new HashSet<String>();
		for (String name : set) {
			if (name.contains(nameIncludes)) {
				newSet.add(name);
			}
		}
		return newSet;
	}
	
	// Method 8:
	
	public static List<Integer> numOfLetters(List<String> names) {
		List<Integer> charCount = new ArrayList<Integer>();
		for (String name : names) {
			charCount.add(name.length());
		}
		return charCount;
	}
	
	// Method 7:
	
	public static List<List<Integer>> factorTable(List<Integer> numList) {
		List<List<Integer>> newList = new ArrayList<List<Integer>>();
		newList.add(new ArrayList<>());		// Adding 4 
		newList.add(new ArrayList<>());
		newList.add(new ArrayList<>());
		newList.add(new ArrayList<>());
		for (Integer element: numList) {
			if (element % 2 == 0) {
				newList.get(0).add(element);
			} else if (element % 3 == 0) {
				newList.get(1).add(element);
			} else if (element % 5 == 0) {
				newList.get(2).add(element);
			} else if (!(element % 2 == 0 || element % 3 == 0 || element % 5 == 0)) {
				newList.get(3).add(element);
			}
		}
		return newList;
	}
	
	// Method 6:
	
	public static List<String> addToList(List<String> list, String add) {
		list.add(add);
		return list;
	}
	
	// Method 5:
	
	public static String withCommas(List<String> list) {
		StringBuilder build = new StringBuilder();
		for (String name : list) {
			build.append(name);
			if (!name.equals(list.get(list.size() - 1))) {
				build.append(", ");
			}
		}
		String commas = build.toString();
		return commas;
	}
	
	// Method 4:
	
	public static List<String> elementSwap(List<String> list) {
		String holder = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, holder);
		return list;
	}
	
	// Method 3:
	
	public static String shortString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
		}
		System.out.println(shortest);
		return shortest;
		
	}

}