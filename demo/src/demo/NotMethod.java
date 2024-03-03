package demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(213, 342,123,256,267);
		
		//Predicate<Integer> startWith2 = li-> li.intValue()==2;
		
		Predicate<Integer> startWith2 = li -> String.valueOf(li).startsWith("2");
		Predicate<Integer> notStartWith2 = Predicate.not(startWith2);
		
		List<Integer> l1 = list.stream().filter(startWith2).collect(Collectors.toList());
		List<Integer> l2 = list.stream().filter(notStartWith2).collect(Collectors.toList());
		
		System.out.println(l1);
		System.out.println(l2);

		
	}

}
