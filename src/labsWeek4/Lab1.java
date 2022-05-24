package labsWeek4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lab1 {

	public static void main(String[] args) {

	//instantiate a new StringBuilder and append the characters 0 - 9 to it seperated by dashes
	//make sure no dash appears at the end of the StringBuilder
		
		StringBuilder characters = new StringBuilder ("0");
		
		for(int i = 1; i < 10; i++) {
			characters.append("-" +i);
		}System.out.println(characters);
	
		//create a list of strings, and add 5 strings to it, each with a different length
		
		List<String> lengthList = new ArrayList<String>();
		//List<String> strings = Arrays.asList ("Tom", "Sammy", "Bill")
		
		lengthList.add("Phil");
		lengthList.add("Brielle");
		lengthList.add("Minnie");
		lengthList.add("Mom");
		lengthList.add("MabrinaMom");
		
		//write and test a method that takes a list of strings and returns the shortest string
		System.out.println(shortestString(lengthList));
		
		//write and test a method that takes a list of strings and returns the list withthe first and last element switched.
		
		List<String> swapped = switcheroo(lengthList);
		
		//write and test a method that takes a list of strings and returns a string with all the elements concatenated together, separated by a comma

		System.out.println(stringListConcat(lengthList));
		
		//write and test a method that takes a list of string and a string and returns a new list 
		//with all the strings from the original list containing the second string parameter (i.e. like a search method)
				//PB showing me code: lengthList.stream().anyMatch(f -> f.contains("value"));
		System.out.println(search(lengthList, "om"));
		
		//write and test a method that takes a list of integers and returns a List<list<Integer>> where the first list in the returned value
		//contains any number from the input list that is divisible by 2. The second list contains any values from the input list that are divisible
		//by 3, the third divisible by 5 and the fourth all numbers from the input list not divisible by 2,3,or 5.
		
		List<Integer> inputNumbers = new ArrayList<Integer>();
		inputNumbers.add(2);
		inputNumbers.add(12);
		inputNumbers.add(34);
		inputNumbers.add(50);
		inputNumbers.add(7);
		inputNumbers.add(14);
		inputNumbers.add(18);
		
		System.out.println(valueMultiplesLists(inputNumbers));
		
		// write and test a method that takes a list of strings and returns a  list of integers but returns thhe length
		
		//create a set of strings and add 5 values.
		Set<String> fruit = new HashSet<String>();
			fruit.add("Banana");
			fruit.add("Cherry");
			fruit.add("Strawberry");
			fruit.add("Grape");
			fruit.add("Watermelon");
			
		//write and test a method that takes a set of strings and a character and returns a set of strings consisting of all the strings in the  character parameter.
		
		System.out.println(doesThisStartWith(fruit, 'S'));
		
		//write adn test a method that takes a set of strings and returns a list of strings
			
		System.out.println(setToList(fruit));
			
		//write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the origial set
		Set<Integer> numberList = new HashSet<Integer>();
		numberList.add(1);
		numberList.add(12);
		numberList.add(13);
		numberList.add(14);
		numberList.add(15);
		numberList.add(16);
		numberList.add(17);
		numberList.add(18);
		numberList.add(19); 
				
		System.out.println(returnEvenIntegers(numberList));
		
		//create a map of string and string and add 3 items to it where the key and od each is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<String, String>();
		
	dictionary.put("Golf", "A sport where you use a club to hit a ball toward the hole");
	dictionary.put("Birdy", "When you get the ball in the hole one less than par");
	dictionary.put("Par", "When you get the ball in the hole, the amount of times the average pro does; this is what they set to par");
		
	
	//write and test a method that takes a Map<String, String> and a string and returns a value for a key in the map that matches the 
	//string parameter (i.e. like a language dictionary lookup)
	
	System.out.println(mapLookUp(dictionary, "Banana"	));
	
	//write and test a method that takes a List<String> and returns a Map<Character, Integer> containing a count of all the strings that start
	//with a given character
	
	System.out.println(findStringStartingWith(lengthList));
	
	
		}

	public static Map<Character, Integer> findStringStartingWith(List<String> listStrings) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		int i = 0;
		for(String string : listStrings) {
			char a = string.charAt(0);
			if (results.get(a) == null) {
			results.put(a, 1);
			} else {
				results.put(a, results.get(a)+1);
			}
		}
		
		return results;
	}
	

	public static String mapLookUp(Map<String, String> map, String parameter) {
		
		for(String key: map.keySet()) {
			if (key.equals(parameter)) {
				return map.get(key);
			}
		}
		return "There was no match to " + parameter;
	}

	public static Set<Integer> returnEvenIntegers(Set<Integer> numberList) {
		Set<Integer> results = new HashSet<Integer>();
		for (int number : numberList) {
			if (number % 2 == 0){
				results.add(number);
			}
			
		}return results;
		
	}

	public static List<String> setToList(Set<String> changeToList) {
		List<String> results = new ArrayList<String>();
		for (String change : changeToList) {
			results.add(change);
			
		}return results;
		
		
	}

	public static Set<String> doesThisStartWith(Set<String> strings, char a) {
		Set<String> startsWith = new HashSet<String>();
		for (String str : strings) {
			if (str.charAt(0) == a ) {
				startsWith.add(str);
			}
		}
		return startsWith;
	}

	public static List<List<Integer>> valueMultiplesLists(List<Integer> inputList) {
			List<List<Integer>> results = new ArrayList<List<Integer>>();
			List<Integer> multipleOfTwo = new ArrayList<Integer>();
			List<Integer> multipleOfThree = new ArrayList<Integer>();
			List<Integer> multipleOfFive = new ArrayList<Integer>();
			List<Integer> notAMultiple = new ArrayList<Integer>();
			for(int input : inputList) {
				if (input % 2 == 0){
					multipleOfTwo.add(input);
				}if (input % 3 ==0) {
					multipleOfThree.add(input);
				}if (input % 5 == 0) {
					multipleOfFive.add(input);
				}if (input % 2 != 0 && input % 3 !=0 && input %5 !=0)
					notAMultiple.add(input);
				}
			results.add(multipleOfTwo);
			results.add(multipleOfThree);
			results.add(multipleOfFive);
			results.add(notAMultiple);
			return results;
			}
	
	

	public static List<String> search(List<String> stringList, String parameter) {
		List<String> resultOfSearch = new ArrayList<String>();
		for(String str : stringList) {
			if (str.contains(parameter)) {
				resultOfSearch.add(str);
			}
		}
		return resultOfSearch;
	}
	

	public static String stringListConcat(List<String> stringList) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i< stringList.size(); i++) {
		result.append(stringList.get(i));
		result.append(", ");}
		result.deleteCharAt(result.length()-2);
		return result.toString();
		
	}

	public static List<String> switcheroo(List<String> makeDifferentList) {
		String change = makeDifferentList.get(0);
		makeDifferentList.set(0, makeDifferentList.get(makeDifferentList.size()-1));
		makeDifferentList.set(makeDifferentList.size()-1, change);
		return makeDifferentList;
		
	}

	public static String shortestString(List<String> differentLengths) {
			String shortest = differentLengths.get(0);
			for (String list : differentLengths) {
				if(list.length() < shortest.length()) {
					shortest = list;
				}
			}return shortest;
			
		
		
	}

}
