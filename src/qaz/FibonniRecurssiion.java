package qaz;

import java.util.*;

public class FibonniRecurssiion {
	static HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
	static int r;
	public static int fib(int n) {
		if(map.containsKey(n)) {
			return map.get(n);
		}
		if(n<=2)
			return 1;
		 r= fib(n-1)+fib(n-2);
		 map.put(n, r);
		 return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(10));
		
	}

}
