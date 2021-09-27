/* This is a class of Anaconda that implements Tradable, Drivable, and Domesticatable interface
 */

public class Anaconda implements Tradable, Drivable, Domesticatable{
    int price;
    int speed;

    public Anaconda(){
        this.price = 10000;
        this.speed = 9999;
    }

    public String sound(){
        return "purrrrrr";
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void upgradeSpeed() {
        this.speed++;
    }

    @Override
    public void downgradeSpeed() {
        this.speed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.speed;
    }
}
