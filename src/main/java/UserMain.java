import java.util.Scanner;

public class UserMain {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("좌표를 입력하세요.");
        String input = sc.next();
        System.out.println(new Positions(input).result());
    }
}
