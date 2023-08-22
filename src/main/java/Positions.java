import java.util.List;
import java.util.Objects;

public class Positions {
    List<Position> positions;
    CalType type;
    public Positions(List<Position> positions) {
        this.positions = positions;
    }

    public Positions(String input) {
        type = Validate.check(input);
        positions = add(input, type);
    }
    private List<Position> add(String input, CalType type) {
        return Validate.list(input, type);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Positions)) return false;
        Positions positions1 = (Positions) o;
        return Objects.equals(positions, positions1.positions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positions);
    }

    public double result() {
        if (type == CalType.LINE) {
            return Math.sqrt(Math.pow(positions.get(0).getX() - positions.get(1).getX(),2) + Math.pow(positions.get(0).getY() - positions.get(1).getY(), 2));
        }
        if (type == CalType.사각형){
            double result = 1;
            for (int i=0; i < positions.size(); i+=2){
                result *=Math.sqrt(Math.pow(positions.get(i).getX() - positions.get(i+1).getX(),2) + Math.pow(positions.get(i).getY() - positions.get(i+1).getY(), 2));
            }
            return result;
        }
        return 0;
    }
}
