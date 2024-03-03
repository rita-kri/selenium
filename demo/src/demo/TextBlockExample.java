package demo;

public class TextBlockExample {
	public static void main(String[] args) {
		String s1 = "Hello Synechron!";
		
		String s2 = """
				Hello Synechron!""";
		
		System.out.println("String literals :" +s1);
		System.out.println("text block :" +s2);
		System.out.println(s1.equals(s2));
		
		String text = """
				hello......
				synechron.....
				Welcome.....
				""";
		text.lines().map(line-> "|" +line +"|").forEachOrdered(System.out::println);
		
		String text1 = """
				Hello Synechron  Welcome \
				Advance Java Training \
				""";
		System.out.println(text1);
	}

}
