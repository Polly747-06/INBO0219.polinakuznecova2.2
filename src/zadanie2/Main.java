package zadanie2;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Ball ball1 = new Ball(1.0D, 2.0D);
        Ball ball2 = new Ball(6.0D, 7.0D);
        Ball ball3 = new Ball(123.0D, 412.0D);
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        ball1.move(14.0D, 4356.0D);
        ball2.move(887.0D, 2235.0D);
        ball3.move(996.0D, 5.0D);
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
