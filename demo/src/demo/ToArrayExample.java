package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//convert a Collection to an array
public class ToArrayExample {
	public static void main(String[] args) {
		List<String> str = List.of("Hello!", "Welcome", "to", "Advance", "Java", "Training");
		List<String> list = str.stream().collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("**********************");
		
		String[] arrayList = str.toArray(new String[0]);
		System.out.println(arrayList[0]);
		System.out.println("**************************");
		
		for(String element : arrayList) {
			System.out.println(element);
		}
		
		//System.out.println(Arrays.toString(arrayList));
	}
	
	
	
	

}
