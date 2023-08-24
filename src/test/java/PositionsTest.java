import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PositionsTest {

    Positions positions;

    String input;

    @BeforeEach
    void 초기값() {
        List<Position> list = new ArrayList<>();
        list.add(new Position(10, 10));
        list.add(new Position(14, 15));
        positions = new Positions(list);
        input = "(10,10)-(14,15)";
    }

    @Test
    void 사용자_입력값_포지션들지정() {
        assertEquals(new Positions(input), positions);
    }


}