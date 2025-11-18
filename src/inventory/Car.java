package inventory;

public class Car {
    public String make;
    public String model;
    public int year;

    public Car(String mk, String md, int yr) {
        this.make = mk;
        this.model = md;
        this.year = yr;
    }

    public Object[] toRow() {

        return new Object[] {this.make, this.model, this.year};
    }

    @Override
    public String toString() {
        return this.make + ", " + this.model + ", " + this.year;
    }
}
