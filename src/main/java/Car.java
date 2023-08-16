public abstract class Car {
    abstract double getDistancePerLiter();

    abstract int addFuel();

    abstract int getTripDistance();

    abstract String inputCarName();

    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
