package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionToArray {
	public static void main(String[] args) {
		//<String> cars = Arrays.asList("Mercedes","BMW","Maruti","Farari","tata Motars");
		List<String> cars = List.of("Mercedes","BMW","Maruti","Farari","tata Motars");

		//Object[] str = cars.toArray(String[]::new);
		
//		for(Object s: str)
//		System.out.println(s);
		
		List<String> car = cars.stream().collect(Collectors.toList());
		System.out.println(car);
		// cars.stream().forEach(System.out::println);

		//		Object[] ob = cars.toArray();		
		String[] str2 = cars.toArray(new String[cars.size()]);
		System.out.println(str2.length);
		String[] str1 = cars.toArray(new String[0]);
		System.out.println(str1[0]);
		
//		System.out.println(ob);
//		System.out.println(str1.length);
		//System.out.println(str1);
	}

}
