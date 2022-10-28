public class StorLastbil extends Vehicle {
    public StorLastbil(double vikt) {
        this.typ = 3;
        this.vikt = vikt;
    }


    @Override
    public String toString() {
        return "Tung lastbil, vikt = " + vikt;
    }

}
