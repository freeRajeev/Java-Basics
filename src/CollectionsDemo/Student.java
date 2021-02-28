package CollectionsDemo;

//Java program to demonstrate working of Comparator
//interface more than one field

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

class Student {

	// instance member variables
	String Name;
	int Age;

	// parameterized constructor
	public Student(String Name, Integer Age) {
		this.Name = Name;
		this.Age = Age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer Age) {
		this.Age = Age;
	}

	// overriding toString() method
	@Override
	public String toString() {
		return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
	}

	static class CustomerSortingComparator implements Comparator<Student> {

		@Override
		public int compare(Student customer1, Student customer2) {

			// for comparison
			int NameCompare = customer1.getName().compareTo(customer2.getName());
			int AgeCompare = customer1.getAge().compareTo(customer2.getAge());

			// 2-level comparison using if-else block
			if (NameCompare == 0) {
				return ((AgeCompare == 0) ? NameCompare : AgeCompare);
			} else {
				return NameCompare;
			}
		}
	}

	public static void main(String[] args) {

		// create ArrayList to store Student
		List<Student> al = new ArrayList<>();

		// create customer objects using constructor initialization
		Student obj1 = new Student("Ajay", 27);
		Student obj2 = new Student("Sneha", 23);
		Student obj3 = new Student("Simran", 37);
		Student obj4 = new Student("Ajay", 22);
		Student obj5 = new Student("Ajay", 29);
		Student obj6 = new Student("Sneha", 22);

		// add customer objects to ArrayList
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);
		//List<Student> s = al.stream().sorted((e1,e2)->e1.Name.compareTo(e2.Name)).collect(Collectors.toList());
		//List<Student> s = al.stream().sorted(c).collect(Collectors.toList());

		Comparator<Student> c = (a,b) -> {
			if(a.Name.compareTo(b.Name) == 0) {
				if(a.Age > b.Age) {
					return 1;
				}
				if(a.Age == b.Age) {
					return 0;
				}
				if(a.Age < b.Age) {
					return -1;
				}
			}
			return a.Name.compareTo(b.Name);
		};
		//List<Student> s2 = al.stream().sorted(c).collect(Collectors.toList());
		
		List<Student> s2 = al.stream().sorted(c).collect(Collectors.toList());
		s2.parallelStream().forEachOrdered(System.out::println);
		
		System.out.println("--before---" + al);
		System.out.println("--after---" + s2);
		
		// before Sorting arraylist: iterate using Iterator
		Iterator<Student> custIterator = al.iterator();

		System.out.println("Before Sorting:\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}
		
		// sorting using Collections.sort(al, comparator);
		Collections.sort(al, new CustomerSortingComparator());

		// after Sorting arraylist: iterate using enhanced for-loop
		System.out.println("\n\nAfter Sorting:\n");
		for (Student customer : al) {
			System.out.println(customer);
		}
	}
}


