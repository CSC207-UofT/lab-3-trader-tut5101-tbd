public class BadmintonRackets implements Tradable, Domesticatable {

    @Override
    public String sound() {
        return "What? Badminton rackets don't make sounds!";
    }

    @Override
    public int getPrice() {
        return 250;
    }
}
