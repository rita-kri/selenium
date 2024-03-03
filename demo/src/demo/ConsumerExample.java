package demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerExample {

	public static void main(String[] args) {
		
		
		  Consumer<String> print = str -> System.out.println(str);

	        List<String> list = Arrays.asList("Java8", "Java17", "Java11");
	     

	        // Use the forEach method with the Consumer
	       list.forEach(print::accept);
	       Consumer<String> print1 = str1 -> System.out.println(str1.toUpperCase());
	       Consumer<String> result = print.andThen(print1);
	     
	       result.accept("Rita Kumari");
	       
	        
	       
	}
}
