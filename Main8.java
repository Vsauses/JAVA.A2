
public class Main7 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 10);
        double sum2 = calculator.add(2.5, 3.7);
        int sum3 = calculator.add(1, 2, 3);

        System.out.println("Sum 1: " + sum1); // Output: Sum 1: 15
        System.out.println("Sum 2: " + sum2); // Output: Sum 2: 6.2
        System.out.println("Sum 3: " + sum3); // Output: Sum 3: 6
    }
}
