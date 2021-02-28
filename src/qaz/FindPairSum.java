package qaz;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindPairSum {

	public static void main(String[] args) {
		int a[] = {1,3,4,-2,4,5,1};
		
		int sum = 7;
		Arrays.sort(a);
		for (int i : a)   
		{       
		System.out.println(i);   
		}   
		int i = 0, j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]>sum) {
				j--;
			}
			else if(a[i]+a[j]<sum) {
				i++;
			}else if(a[i]+a[j]==sum){
				System.out.println(a[i]+","+a[j]);
				i++;
				j--;
				
			}
		}

	}

}
