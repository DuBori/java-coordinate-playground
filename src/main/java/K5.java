public class K5 extends Car {

    public K5(int distance) {
        super(distance);
        super.name = Carnum.K5.getDesc();
        super.perLiter = 13L;
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
