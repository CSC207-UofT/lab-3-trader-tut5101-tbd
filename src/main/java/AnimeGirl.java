public class AnimeGirl implements Domesticatable, Tradable{
    public AnimeGirl() {

    }

    @Override
    public String sound() {
        return "Biubiubiu";
    }

    @Override
    public int getPrice() {
        return 80;
    }


    @Override
    public String toString(){
        String id = super.toString();
        return id + "kwawiiiiiii";
    }
}
