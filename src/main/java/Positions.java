import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Positions {
    public static final Pattern PATTERN_LINE = Pattern.compile("\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)");
    public static final Pattern PATTERN_SQUARE = Pattern.compile("\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)");
    public static final Pattern PATTERN_삼각형 = Pattern.compile("\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)");
    List<Position> positions;

    public Positions(List<Position> positions) {
        this.positions = positions;
    }

    public Positions(String input) {
        positions = add(input, check(input));
    }

    private List<Position> add(String input, CalType type) {
        return list(input, type);
    }

    private List<Position> list(String input, CalType type) {
        Matcher matcher = getMatcher(input, type);

        List<Position> list = new ArrayList<>();
        if (matcher.find()) {
            for (int i = 1; i <= type.getCount(); i++) {
                list.add(new Position(Integer.parseInt(matcher.group(i * 2 - 1)), Integer.parseInt(matcher.group(i * 2))));
            }
        }
        return list;
    }

    private CalType check(String input) {
        if (PATTERN_LINE.matcher(input).matches()) {
            return CalType.LINE;
        }
        if (PATTERN_SQUARE.matcher(input).matches()) {
            return CalType.사각형;
        }
        if (PATTERN_삼각형.matcher(input).matches()) {
            return CalType.삼각형;
        }
        throw new IllegalArgumentException("입력값 패턴이 잘못되었습니다.");
    }

    private Matcher getMatcher(String input, CalType type) {
        Matcher matcher = null;
        if (type == CalType.LINE) {
            return PATTERN_LINE.matcher(input);
        }
        if (type == CalType.사각형) {
            return PATTERN_SQUARE.matcher(input);
        }

        return PATTERN_삼각형.matcher(input);
    }

    public double result() {
        if (positions.size() == 2) {
            return getSqrt(0, 0);
        }
        if (positions.size() == 4) {
            return getSqrt(0, 0) * getSqrt(1, 0);
        }
        //헤론 공식
        double s = (getSqrt(0, 0) + getSqrt(1, 0) + getSqrt(2, 1)) / 2;
        return Math.sqrt(s * (s - getSqrt(0, 0)) * (s - getSqrt(1, 0)) * (s - getSqrt(2, 1)));
    }

    private double getSqrt(int number, int reverse) {
        if (reverse > 0) {
            return Math.sqrt(Math.pow(positions.get(number).getX() - positions.get(number - 2).getX(), 2) + Math.pow(positions.get(number).getY() - positions.get(number -2).getY(), 2));
        }
        return Math.sqrt(Math.pow(positions.get(number).getX() - positions.get(number + 1).getX(), 2) + Math.pow(positions.get(number).getY() - positions.get(number + 1).getY(), 2));
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
