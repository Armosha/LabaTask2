package Task12Comparator;

import java.util.Comparator;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class PriceComparator implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        return price1 - price2;
    }

}