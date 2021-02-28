package qaz;

import java.util.Scanner;

//import sun.security.util.Length;

public class zoo {
	public static void main(String[] args) {
		boolean flag = false;
		int z = 0,o = 0;
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		if(in.length() < 21 && (in.charAt(0)=='z' || in.charAt(0)=='Z')) {
			char[] ch = new char[in.length()]; 
			  
	        for (int i = 0; i < in.length(); i++) { 
	            ch[i] = in.charAt(i); 
	        }
//	        for (int i = 0; i < ch.length; i++) { 
//	        	if(ch[i] != 'z' || ch[i]!= 'o') {
//	        		break;
//	        	}
	        int i =0;
	            while(ch[i]== 'z')
	            {
	            	z+=1;
	            	i++;
	            }
	            while(ch[i] == 'o') {
	            	o+=1;
	            	i++;
	            }
	            	
//	        } 
	        if(o == (2*z) && in.length() == (o+z)){
	        	flag = true;
	        }
		}
		if(flag) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
