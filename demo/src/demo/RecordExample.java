package demo;

public class RecordExample {
    public static void main(String[] args) {
      
        Person person = new Person("Rita", 24, "Jharkhand");
        Person person2 = new Person("Rita", 24, "Jharkhand");
        RecordTest test = new RecordTest("CSE");
        
        System.out.println(test.department());

//        System.out.println("Name: " + person.name());
//        System.out.println("Age: " + person.age());
//        System.out.println("Address :"+ person.address);

        System.out.println("Person details: " + person);
        System.out.println(person.equals(person2));
        System.out.println(person==person2);
        person.print();
    }

   
    public record Person(String name, int age, String address) {
    	public void print() {
    		System.out.println("My name is "+ name+ " and age is "+age);
    		
    	}
    }
}

