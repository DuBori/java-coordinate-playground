import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {
    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        if (beverage  instanceof Coffee) {
            Coffee coffee = (Coffee)beverage;
        }
        // 인스턴스가 실제로 어떤 타입인지를 확인할 때 사용하는 자바 keyword
    }
}