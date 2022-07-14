public class Bicycle implements Vehicle {
    private int currentSpeed;
    private int currentGear;
    public static final int NUMBER_OF_WHEELS = 2;

    public Bicycle(int currentSpeed, int currentGear) {
        this.currentSpeed = currentSpeed;
        this.currentGear = currentGear;
    }

    @Override
    public void accelerate(int speed) {
        currentSpeed += speed;
    }

    @Override
    public void upGear() {
        if (currentGear < 21) {
            currentGear++;
        }
    }

    @Override
    public void downGear() {
        if (currentGear > 1) {
            currentGear--;
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
