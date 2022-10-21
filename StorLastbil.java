public class StorLastbil extends Vehicle {
    public StorLastbil(double vikt) {
        super(3);
        this.vikt = vikt;
    }

    @Override
    public int getTyp() {
        return typ;
    }
    @Override
    public String toString() {
        return "Tung lastbil, vikt = " + vikt;
    }

    @Override
    public double getVikt() {
        return this.vikt;
    }
}