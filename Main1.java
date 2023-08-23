public class Main1 {
    public static void main(String[] args) {
        // Create objects using constructors
        Student student1 = new Student("Alice", 20, "S123");
        Student student2 = new Student("Bob", 22, "S456");

        // Call the displayInfo method for each student
        System.out.println("Student 1:");
        student1.displayInfo();

        System.out.println("\nStudent 2:");
        student2.displayInfo();
    }
}
