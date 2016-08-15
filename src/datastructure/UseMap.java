package datastructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Map<String, String> map = new LinkedHashMap<String,String>();

		map.put("USA", "NY,AR,LA");
		map.put("UK", "London");
		map.put("Canada", "Ontario");
		map.put("Japan", "Tokeyo");
		map.put("Bangladesh", "Dhaka");

		for(Map.Entry<String,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" : " + entry.getValue());
		}

	}

}
