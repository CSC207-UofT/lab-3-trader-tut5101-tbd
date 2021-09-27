public class Car implements Drivable, Tradable{
    private int speed = 0;

    @Override
    public int getPrice(){
        return 50;
    }

    @Override
    public void upgradeSpeed(){
        this.speed ++;
    }

    @Override
    public void downgradeSpeed(){
        this.speed --;
    }

    @Override
    public int getMaxSpeed(){
        return this.speed;
    }
}
