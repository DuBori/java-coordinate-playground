public abstract class Car {
    public int distance;
    public String name;
    public double perLiter;

    public Car(int distance) {
        this.distance = distance;
    }

    abstract double getDistancePerLiter();

    abstract int getTripDistance();

    abstract String getName();

     double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
