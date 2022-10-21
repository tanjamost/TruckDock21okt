public abstract class Vehicle {
    protected double vikt;
    protected int typ;

    Vehicle(int typ){

        this.typ = typ;
    }

    public abstract double getVikt();

    public abstract int getTyp();
}