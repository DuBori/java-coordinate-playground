import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {

    private String input;

    @BeforeEach
    void 초기값() {
        input = "(10,10)-(14,15)";
    }

    @Test
    void 입력값체크() {
        assertTrue(Validate.check(input));
    }

}