public class LitenLastbil  extends Vehicle {
    public LitenLastbil(double vikt) {
        this.typ = 2;
        this.vikt = vikt;
    }


    @Override
    public String toString() {
        return "Lätt lastbil, vikt = " + vikt;
    }

}
