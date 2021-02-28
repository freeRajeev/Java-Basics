package qaz;

public class SingletonClassDemo {
	private static SingletonClassDemo singleInstance = null;
	String s ;
	private SingletonClassDemo() {
		s="insde consutructo";
	}
	public static SingletonClassDemo getInstance() {
		if(singleInstance == null) {
			singleInstance = new SingletonClassDemo();
		}
		return singleInstance;
	}
}

class Main{
	public static void main(String[] args) {
		SingletonClassDemo x =SingletonClassDemo.getInstance();
		SingletonClassDemo y =SingletonClassDemo.getInstance();
		SingletonClassDemo z =SingletonClassDemo.getInstance();
		
		
	}
}
