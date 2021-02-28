package qaz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

//import jdk.internal.jshell.tool.resources.l10n;

public class EmployeeSortComparator implements Comparator<Object>{

	private String name;
	private int experience;

	public EmployeeSortComparator(String name, int experience) {
		this.name = name;
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}

	@Override
	public String toString() {
		return "Employee Name=" + this.name + ", Experience=" + this.experience;
	}
	@Override
	public int compare(Object o1, Object o2) {
		EmployeeSortComparator e1  = (EmployeeSortComparator) o1;
		EmployeeSortComparator e2 = (EmployeeSortComparator) o2;
		
		if(e1.getExperience() == e2.getExperience()) {
			return 0;
		}
		if(e1.getExperience() > e2.getExperience()) {
			return 1;
		}
		if(e1.getExperience() < e2.getExperience()) {
			return -1;
		}
		return 0;
	}
	
}
//
// class ComparatorByExp implements Comparator<Object>{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		EmployeeSortComparator e1  = (EmployeeSortComparator) o1;
//		EmployeeSortComparator e2 = (EmployeeSortComparator) o2;
//		
//		if(e1.getExperience() == e2.getExperience()) {
//			return 0;
//		}
//		if(e1.getExperience() > e2.getExperience()) {
//			return 1;
//		}
//		if(e1.getExperience() < e2.getExperience()) {
//			return -1;
//		}
//		return 0;
//	}
//	
//}
 
 class Test{
	 public static void main(String[] args) {
		
	
		 ArrayList<EmployeeSortComparator> li1 = new ArrayList<EmployeeSortComparator>();
		 
		 EmployeeSortComparator e1 = new EmployeeSortComparator("rajeev",2);
		 EmployeeSortComparator e2 = new EmployeeSortComparator("sureesh",3);
		 EmployeeSortComparator e3 = new EmployeeSortComparator("bhio",2);
		 EmployeeSortComparator e4 = new EmployeeSortComparator("ja",12);
		 EmployeeSortComparator e5 = new EmployeeSortComparator("sajeev",21);
		 
		 li1.add(e1);
		 li1.add(e2);
		 li1.add(e3);
		 li1.add(e4);
		 li1.add(e5);
		 
		 Collections.sort(li1, Comparator<EmployeeSortComparator>);
		 Iterator<EmployeeSortComparator> itr = li1.iterator();
		 while(itr.hasNext()) {
			 EmployeeSortComparator  emp =  (EmployeeSortComparator) itr.next();
			 System.out.println(emp.toString());
		 }
	 }
 }
	
