package inheritance;

public class Employees {
	String Name;
	int Age;

	// parameterized constructor
	public Employees(String Name, Integer Age) {
		this.Name = Name;
		this.Age = Age;
	}
	public Employees() {
	}

	public String getName() {
		return "get employee name";
	}

	

	public static Integer getAge() {
		return 10;
	}

	
}
