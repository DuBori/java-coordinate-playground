public class Coffee extends Beverage {

    public Coffee() {
        물을끓인다();
        커피를_내린다();
        물을붓는다();
        설탕_우유_추가();
    }

    private void 커피를_내린다() {
        System.out.println("커피를 내린다.");
    }
    private void 설탕_우유_추가() {
        System.out.println("설탕과 우유를 넣는다.");
    }
}
