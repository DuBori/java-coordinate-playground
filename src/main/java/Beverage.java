public abstract class Beverage {

    abstract void 뭘넣거나내린다();
    abstract void 추가로뭘넣는다();

    protected void 물을끓인다() {
        System.out.println("물을 끓인다.");
    }
    protected void 물을붓는다() {
        System.out.println("물을 붓는다.");
    }

}
