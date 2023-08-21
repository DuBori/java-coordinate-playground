import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    private Position position;
    private String input;
    @BeforeEach
    void 생성자() {
        position = new Position(1,3);
        input = "(10,10)-(14,15)";
    }
    @Test
    @Disabled
    void 점에대한좌표가같는가() {
        assertEquals(new Position(1,3), position);
    }
    @Test
    void 입력값이큰게들어왔다() {
        assertThrows(IllegalArgumentException.class, () -> {
           new Position(25,24);
        });
    }
}