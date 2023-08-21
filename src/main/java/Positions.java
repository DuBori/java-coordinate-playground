import java.util.List;
import java.util.Objects;

public class Positions {
    List<Position> positions;

    public Positions(List<Position> positions) {
        this.positions = positions;
    }

    public Positions(String input) {
        if (Validate.check(input)) {
            positions = add(input);
        }
    }
    private List<Position> add(String input) {
        return Validate.list(input);
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
        return Math.pow(Math.sqrt(positions.get(0).getX() - positions.get(1).getX()),2) + Math.pow(positions.get(0).getY() - positions.get(1).getY(),2);
    }
}
