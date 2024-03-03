package demo;

interface Demo{
	 static void method() {
		 System.out.println("First Interface method");
		 
	 }
	 private void privateMethod() {
	        System.out.println("This is a private method");
	    }
	 
	 default void method1() {
		 System.out.println("default method");
		 privateMethod();
		 
	 }
	 
	 void info();
	 
}

public class InterfaceExample implements Demo {
	
	@Override
	public void info() {
		System.out.println("Asbtract method");
	}
	public static void main(String[] args) {
		InterfaceExample ex = new InterfaceExample();
		ex.info();
		ex.method1();
		Demo.method();
		

	}

	

}
