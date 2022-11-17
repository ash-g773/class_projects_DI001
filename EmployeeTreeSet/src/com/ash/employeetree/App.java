package com.ash.employeetree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		Set<Employee> employees = new TreeSet<Employee>();
		
		System.out.println("Size : "+employees.size());
		
		employees.add(new Employee("ID1", "A", 2, "Manager", "HR", 20.00));
		employees.add(new Employee("ID1", "A", 26, "Manager", "HR", 20.00));
		employees.add(new Employee("ID1", "A", 18, "Manager", "HR", 20.00));
		employees.add(new Employee("ID1", "A", 19, "Manager", "HR", 20.00));
		employees.add(new Employee("ID1", "A", 3, "Manager", "HR", 20.00));
		
		System.out.println("Size : "+employees.size());
		System.out.println(employees);
		
		employees.add(new Employee("ID1", "A", 26, "Manager", "HR", 20.00));
		employees.add(new Employee("ID1", "A", 25, "Manager", "HR", 20.00));
		
		System.out.println("Size : "+employees.size());
		System.out.println(employees);
		
		
		System.out.println("Traversal using for each loop");
		for(Employee element:employees) {
			System.out.println(element);
		}

		System.out.println("Traversal using Iterator");
		Iterator<Employee> iterator=employees.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
