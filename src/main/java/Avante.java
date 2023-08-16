public class Avante extends Car {

    public Avante(int distance) {
        super(distance);
        super.name = Carnum.AVANTAE.getDesc();
        super.perLiter = 15L;
    }

    @Override
    double getDistancePerLiter() {
        return perLiter;
    }
    @Override
    int getTripDistance() {
        return distance;
    }
    @Override
    String getName() {
        return name;
    }
}
