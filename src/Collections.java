import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		/*
		 * List
		 * 
		 * Allows Duplicates
		 * Keeps elements ordered by index
		 * Allows null values
		 * common implementations: ArrayList, LinkedList, Vector
		*/
		
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
		
		
		for (String student : students) {
			System.out.println(students.get(2));
			System.out.println(students.get(0));
		}
		
		/*Set
		 * 
		 * No duplicates
		 * Unordered
		 * Allows null value
		 * Common implimentations: HashSet, LinkedSet, TreeSet
		 */
		
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Missouri");
		states.add("Arakansas");
		states.add("California");
		
		System.out.println(states.size());
		System.out.println(states.contains("Missouri"));
		if (states.contains("Alabama")) {
			states.remove("Alabama");
		}
		
		for (String state : states) {
			System.out.println(state);
		}
		
		/*
		 * Map
		 * 
		 * Map <K, V> K is the key, V is the value
		 * Key value pairs [dictionary]
		 * values can be duplicate, but not keys
		 * Common implementations: HashMap, LinkedHashMap, TreeMap, hashTable
		*/
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "tommy");
		racerPlacements.put(2, "sally");
		racerPlacements.put(3, "john");
		
		System.out.println(racerPlacements.get(1));
		
		racerPlacements.remove(1);
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key: racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augument", "To make something greater by addign to it");
		dictionary.put("Diminish", "To make something less");
		dictionary.put("ostentation", "characterized by vulgar or pretentious");
		
		
		
	}

}
