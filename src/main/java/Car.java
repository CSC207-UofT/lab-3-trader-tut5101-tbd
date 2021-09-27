public class Car implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Car() {this.maxSpeed = 3; }


    @Override
    public String sound() {
        return "Vroom!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")"; }
}
