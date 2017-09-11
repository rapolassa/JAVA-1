import org.joda.money.Money;

/**
 * Created by Rapolo on 2017-09-11.
 */
public class CountMoney {
    public Money salary(Integer difference, String postDate)
    {
        return Money.parse("USD " + (difference * Integer.parseInt(postDate.split("-")[2])));
    }

}
