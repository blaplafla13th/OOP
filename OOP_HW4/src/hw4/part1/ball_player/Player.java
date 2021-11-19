package hw4.part1.ball_player;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }

    public boolean near(Ball ball) {
        double dis = Math.sqrt(Math.pow((x - ball.getX()), 2) + Math.pow((y - ball.getY()), 2) + Math.pow((z - ball.getZ()), 2));
        if (dis < 8) return true;
        return false;
    }

    public void kick(Ball ball) {
        ball.setXYZ((float) Math.random() * 10, (float) Math.random() * 10, (float) Math.random() * 10);
    }

    public String toString() {
        return String.format("(%f,%f,%f)", x, y, z);
    }
}
