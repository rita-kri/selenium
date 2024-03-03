package demo;

public class ReverString {
	public static void main(String[] args) {
		//String s = "Tommorrow will be Advance JAVA training";
		String s = "madam";
		System.out.println(s);
		String str = "";
		for(int i=s.length()-1;i>=0;i--) {
			str = str + s.charAt(i);
		}
		System.out.println(str);
		if(s.equals(str)) {
			System.out.println("palindrom");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
