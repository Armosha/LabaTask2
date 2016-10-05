package Task9;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.fillBasketOfBall();
        basket.countBlueBall();
        basket.countWeightOfBall();
        System.out.println(basket.toString());
    }
}
