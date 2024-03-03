package demo;

public class NullPointerExceptionExample {
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
       
//        Person person1 = new Person("Rita");
//        printNameLength(person1);  

        Person person2 = new Person(null);
        System.out.println(person2.name.length());
        //printNameLength(person2);  
    }

//    static void printNameLength(Person person) {
//        try {
//            int length = person.name.length();
//            System.out.println("Name length: " + length);
//        } catch (NullPointerException e) {
//            System.out.println("Caught NullPointerException: " + e.getMessage());
//        }
//    }
}


