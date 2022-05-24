import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		String [] cars = new String[3];
		cars [0] = "Camero";
		cars [1] = "F150";
		cars [2] = "Mustang";
		
		//List<E> list of E, where E is the generic that will be replaced with the type of list used
		//reads list of String
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1);
		
		for(int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		for (String sport : sports) {
			System.out.println(sport);
		}
		List<Integer> numbers = new ArrayList<Integer>();
		
		
	}

}
