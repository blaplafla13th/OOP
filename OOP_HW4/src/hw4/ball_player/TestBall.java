package hw4.ball_player;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0.5f, 0.5f, 0);
        System.out.println(ball);
        ball.setXYZ((float) Math.random(), (float) Math.random(), (float) Math.random());
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        System.out.println(ball.getZ());
    }
}
