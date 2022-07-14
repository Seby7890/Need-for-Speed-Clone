public class Drive {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(0, 0);
        Car Wv = new Car(0,0);

        accelerate(bike, 12);
        accelerate(Wv, 50);

        System.out.println("Bicycle's speed is: " + bike.getCurrentSpeed());
        System.out.println("Car's speed is: " + Wv.getCurrentSpeed());
    }

    public static void accelerate(Vehicle vehicle, int speed) {
        vehicle.accelerate(speed);
    }
}
