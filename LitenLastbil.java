public class LitenLastbil  extends Vehicle {
    public LitenLastbil(double vikt) {
        super(2);
        this.vikt = vikt;
    }

    @Override
    public int getTyp() {
        return typ;
    }
    @Override
    public String toString() {
        return "Lätt lastbil, vikt = " + vikt;
    }
    @Override
    public double getVikt() {
        return this.vikt;
    }
}