// Main class
public class Main
 {
    public static void main(String[] args) 
	{
        // Create objects of the Person class
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Call the displayInfo method for each person
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}