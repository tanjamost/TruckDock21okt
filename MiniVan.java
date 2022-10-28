public class MiniVan extends Vehicle {
    public MiniVan(double vikt) {
        this.typ = 1;
        this.vikt = vikt;
    }

    @Override
    public String toString() {              //metod att skriva ut obj
        return "Skåpbil, vikt = " + vikt;  // i
    }
}
