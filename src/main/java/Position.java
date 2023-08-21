import java.util.Objects;

public class Position {
    public static final int MAX_NUMBER = 24;
    private int x;
    private int y;

    public Position(int x, int y) {
        rangeNumber(x, y);
        this.x = x;
        this.y = y;
    }

    private void rangeNumber(int x, int y) {
        if (x > MAX_NUMBER || y > MAX_NUMBER) {
            throw new IllegalArgumentException("포지션의 좌표의 최대값은 24입니다.");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
