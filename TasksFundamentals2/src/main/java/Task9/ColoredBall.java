package Task9;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class ColoredBall {

    Ball ball = new Ball();

    public Ball makeColoredBall() {
        ball.setWeight(Math.round(Math.random() * 10));
        ball.getWeight();
        ball.chouseColor();
        return ball;
    }
}