package demo;
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(); // Abstract method
    
    
}

public class Main {
	final static int a =20;
    public static void main(String[] args) {
        // Using lambda expression to implement the interface
        MyFunctionalInterface functionalInterface = () -> {
            System.out.println("Executing myMethod");
        };
        System.out.println(a); //20
        functionalInterface.myMethod(); // Output: Executing myMethod
   
        Main obj = new Main();
    System.out.println(obj.main(20));
    System.out.println(a); //20
    }
    public int main(int a) {
		//System.out.println("new main method");
		a = 10;
		 //this.a = a;
		a = this.a;
		System.out.println(a);
		return this.a;
	}
    
}