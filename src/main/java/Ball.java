
public class Ball implements Tradable, Drivable{
    @Override
    public int getPrice(){
        return 100;
    }

    @Override
    public void upgradeSpeed(){
        this.speed++;
    }

    @Override
    public void downgradeSpeed(){
        this.speed--;
    }

    @Override
    public int getMaxSpeed(){
        return this.speed;
    }
}
