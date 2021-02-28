package qaz;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortinga {

	public static void main(String[] args) {
		String a = "geeksforgeeks";
		String[] b = new String[20];
		b = a.split("");
		
		for(String ba: b) {
			System.out.println(ba);
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i<b.length ; i++) {
			map.putIfAbsent(b[i],0);
			map.put(b[i], map.get(b[i])+1 );
			
			
		}
		int count=0;
		char letter;
		for(Map.Entry<String, Integer> es : map.entrySet()) {
			if(es.getValue()>1) {
				count++;
				
			}
		}
		System.out.println("max occurence "+count + map.get(4));
		System.out.println(map);
	}

}
