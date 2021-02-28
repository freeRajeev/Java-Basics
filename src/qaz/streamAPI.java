package qaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.*;

public class streamAPI {
	public static void main(String args[]) {
		
		Stream <Integer> s = Stream.of(9,99,99,999,9999);
		
		
		Integer[] j = {12,21,43};
		
		
		var x = 'a';
		System.out.println();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(2);
		ar.add(4);
		ar.add(36);
		
		//List<Integer> l =ar.stream().filter(i->i%2==0).collect(Collectors.toList()); //filter on some basis
		//Set<Integer> l =ar.stream().map(i->i+5).collect(Collectors.toSet()); //for every element some operation
		//Long l =ar.stream().filter(m->m<35).count();
		//List<Integer> l = ar.parallelStream().sorted().collect(Collectors.toList());
		//List<Integer> l = ar.parallelStream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		//List<Integer> l = ar.parallelStream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList()); //above alternative desc sorting
		//List<Integer> l = ar.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList()); //above alternative desc sorting
		//Integer l = ar.stream().max((i1,i2)->i1.compareTo(i2)).get(); //min element
		
		ar.parallelStream().forEach(System.out::println);
		Integer[] arr = ar.stream().toArray(Integer[]::new);
		System.out.println("//////");
		Stream.of(arr).forEach(System.out::println);
		
		List<Integer> la = Arrays.asList(2,3,4,5);
		Integer aa = (int) la.stream().filter(m->m%2!=0).mapToInt(m->m).sum();
		System.out.println(aa+"==================");
		
		
		
		Consumer<Integer> f=i->{
			System.out.println(i*i);
		};
		ar.parallelStream().forEach(f);
				

		//System.out.println(l);
		
//		ArrayList<String> s = new ArrayList<String>();
//		s.add("Aad");
//		s.add("Bdf");
//		s.add("Cfdf");
//		s.add("Zf");
//		s.add("M");
//		
//		Comparator<String> c = (s1,s2) ->{
//			if(s1.length() < s2.length()) return -1;
//			else if(s1.length() < s2.length()) return 1;
//			else return s1.compareTo(s2);
//		};
//		List<String> sa =  s.stream().sorted(c).collect(Collectors.toList());
//		System.out.println(sa);
	}
	
}