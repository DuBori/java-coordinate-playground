public class Coffee extends Beverage {

    public Coffee() {
        물을끓인다();
        뭘넣거나내린다();
        물을붓는다();
        추가로뭘넣는다();
    }
    @Override
    void 뭘넣거나내린다() {
        System.out.println("커피를 내린다.");
    }

    @Override
    void 추가로뭘넣는다() {
        System.out.println("설탕과 우유를 넣는다.");
    }
}
