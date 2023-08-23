//Concept of constructors and Initialization

class Student 
{
    private String name;
    private int age;
    private String studentId;

    // Constructor with parameters
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}

