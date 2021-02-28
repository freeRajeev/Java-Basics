package qaz;

import java.util.HashMap;

public class StringCount {

	public static void main(String[] args) {
		String str= "Rajeev is an idiot idiot";
		String[] split = str.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0; i<split.length; i++) {
			if(hm.containsKey(split[i])) {
				int count = hm.get(split[i]);
				hm.put(split[i], count+1);
			} else {
				hm.put(split[i], 1);
			}
		}
		System.out.println(hm);
	}

}
