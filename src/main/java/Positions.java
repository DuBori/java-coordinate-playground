import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;

public class Positions {
    List<Position> positions;

    public Positions(List<Position> positions) {
        this.positions = positions;
    }

    public Positions(String input) {
        positions = add(input, Validate.check(input));
    }
    private static List<Position> add(String input,CalType type) {
        return list(input, type);
    }

    private static List<Position> list(String input, CalType type) {
        Matcher matcher = getMatcher(input, type);

        List<Position> list = new ArrayList<>();
        if (matcher.find()) {
            for (int i = 1; i <= type.getCount(); i++) {
                list.add(new Position(Integer.parseInt(matcher.group(i * 2 - 1)), Integer.parseInt(matcher.group(i * 2))));
            }
        }
        return list;
    }
    private static Matcher getMatcher(String input, CalType type) {
        Matcher matcher = null;
        if (type == CalType.LINE){
            return Validate.PATTERN_LINE.matcher(input);
        }
        if (type == CalType.사각형){
            return Validate.PATTERN_SQUARE.matcher(input);
        }

        return Validate.PATTERN_삼각형.matcher(input);
    }
    public double result() {
        double result = 0;
        if (positions.size() == 2) {
            for (int i = 0; i < positions.size() - 1; i++) {
                result += Math.sqrt(Math.pow(positions.get(i).getX() - positions.get(i + 1).getX(), 2) + Math.pow(positions.get(i).getY() - positions.get(i + 1).getY(), 2));
            }
            return result;
        }
        if (positions.size() == 4) {
            return Math.sqrt(Math.pow(positions.get(0).getX() - positions.get(1).getX(), 2) + Math.pow(positions.get(0).getY() - positions.get(1).getY(), 2)) * Math.sqrt(Math.pow(positions.get(1).getX() - positions.get(2).getX(), 2) + Math.pow(positions.get(1).getY() - positions.get(2).getY(), 2));
        }
        return 0;
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


}
