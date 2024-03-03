package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Use var key word in lambda

interface Example{
	public static void print() {
		System.out.println("hello");
	}
	public void print1();
}

public class Employee implements Example {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java8","Java11","Java12","Java14","Java17");
		words.forEach((var word) -> System.out.println(word));
		 var anotherWord = "Java";
		 //words.forEach(word -> System.out.println(anotherWord + " " +word));
		List<String> print = words.stream().collect(Collectors.toList());
		System.out.println(print);
		
		Example.print();
		
	Employee emp = new Employee();
	emp.print1();
	}

	@Override
	public void print1() {
		System.out.println("abstract method");
		
	}

}
