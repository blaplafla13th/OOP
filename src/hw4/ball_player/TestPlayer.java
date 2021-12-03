package hw4.part1.ball_player;

public class TestPlayer {
    public static void main(String[] args) {
        Player a = new Player(2, 0.5f, 5f);
        System.out.println(a);
        Ball ball = new Ball(5f, 5f, 5);
        System.out.println(ball);
        a.move(3,3);
        a.jump(3);
        System.out.println(a);
        if (a.near(ball)) a.kick(ball);
        System.out.println(ball);
    }
}
