public class Main5 {
    static void performStart(Vehicle vehicle) {
        vehicle.start();
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Motorcycle();

        performStart(vehicle1); 
        performStart(vehicle2); 
    }
}
