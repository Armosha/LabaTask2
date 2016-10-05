
package Task9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class Basket {

    List<ColoredBall> list = new ArrayList<ColoredBall>();

    public Basket() {
    }

    ColoredBall bal = new ColoredBall();

    public List<ColoredBall> fillBasketOfBall() {
        for (int i = 1; i <= Math.round(Math.random() * 100); i++) {
            bal.makeColoredBall();
            list.add(bal);
        }
        return list;
    }

    public int countBlueBall() {
        int count = 0;
        for (ColoredBall a : list) {
            if (bal.makeColoredBall().color.equals(BallColor.BLUE)) {
                count++;
            }
        }
        return count;
    }

    public int countWeightOfBall() throws NullPointerException {
        int weightcount = 0;
        int size = list.size();
        for (ColoredBall a : list) {
            if (list.size() != 0 && (bal.makeColoredBall().getWeight()) != 0) {
                weightcount = (int) (bal.makeColoredBall().getWeight()) * list.size();
            } else new NullPointerException("Something is 0");
        }

        return weightcount;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str = str.append("Number of all balls in basket is: " + fillBasketOfBall().size())
                .append("\n")
                .append("Number of blue balls is: " + countBlueBall())
                .append("\n")
                .append("Weight basket of balls's: " + countWeightOfBall())
                .append("\n");
        return str.toString();

    }
}