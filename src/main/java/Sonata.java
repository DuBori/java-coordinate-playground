public class Sonata extends Car {
    public Sonata(int distance) {
        super(distance);
        super.name = Carnum.SONATA.getDesc();
        super.perLiter = 10L;
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
