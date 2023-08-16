public class Tea extends Beverage {
    public Tea() {
        물을끓인다();
        뭘넣거나내린다();
        물을붓는다();
        추가로뭘넣는다();
    }
    @Override
    void 뭘넣거나내린다() {
        System.out.println("티백을 뜯는다.");
    }

    @Override
    void 추가로뭘넣는다() {
        System.out.println("레몬을 추가한다.");
    }
}
