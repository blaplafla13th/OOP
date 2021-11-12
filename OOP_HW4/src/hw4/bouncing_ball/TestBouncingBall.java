package hw4.bouncing_ball;

public class TestBouncingBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; step++) {
            ball.move();
            System.out.println("collidesWith: " + box.collidesWith(ball));
            System.out.println(ball); // manual check the position of the ball

        }
    }
}
