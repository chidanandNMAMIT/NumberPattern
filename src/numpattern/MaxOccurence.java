package numpattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxOccurence {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 2, 4, 4, 5, 6, 2, 5 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length-1; i++) {

			if (map.containsKey(arr[i])) {
				
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		
		int count=0;
		int mostrepeated = 0;
		for(Entry<Integer, Integer> m:map.entrySet()) {
			if(m.getValue()>count) {
				 mostrepeated=m.getKey();
				 count=m.getValue();
			}
		}
		System.out.println("MostOccured Number :"+mostrepeated);
		System.out.println("Occured "+count+ " Times");

	}

}
