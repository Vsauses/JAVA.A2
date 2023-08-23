
public class Main3 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println();

        Cat cat = new Cat("Whiskers");
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}
