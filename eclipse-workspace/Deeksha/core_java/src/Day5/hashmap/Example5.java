package Day5.hashmap;

import java.util.*;

public class Example5 {
	
	public static void main(String[] args) {
		
	//	HashMap<String, String> mapOfSatesCities = new HashMap<String, String>();
		Map<String, String> mapOfSatesCities = new HashMap<String, String>();
		
		mapOfSatesCities.put("Pune","Maharashtra");
		mapOfSatesCities.put("Bangaluru", "Karnataka");
		mapOfSatesCities.put("Mumbai","Maharashtra");
		mapOfSatesCities.put("Nagpur","Maharashtra");
		mapOfSatesCities.put("Udupi", "Karnataka");
		
		Set<String> keyset = mapOfSatesCities.keySet();
		
			
		for(String x:keyset)
		{
			String city = mapOfSatesCities.get(x);
			System.out.println(x+" : "+city);
		}
		
	}

}
