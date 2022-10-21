public class MiniVan extends Vehicle {
    public MiniVan(double vikt) {
        super(1);
        this.vikt = vikt;
    }

    @Override
    public double getVikt() {
        return this.vikt;
    }

    @Override
    public int getTyp() {
        return typ;
    }

    @Override
    public String toString() {
        return "Skåpbil, vikt = " + vikt;
    }
}