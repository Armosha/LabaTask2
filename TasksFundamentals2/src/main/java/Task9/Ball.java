package Task9;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class Ball {

    double weight;
    BallColor color;

    public Ball() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BallColor chouseColor() throws NullPointerException {

        int i = (int) (1 + Math.random() * 4);
        switch (i) {
            case 1:
                color = BallColor.BLUE;
                break;
            case 2:
                color = BallColor.GREEN;
                break;
            case 3:
                color = BallColor.RED;
                break;
            case 4:
                color = BallColor.YELLOW;
                break;
            default:
                color = BallColor.BLUE;
        }

        return color;
    }
}