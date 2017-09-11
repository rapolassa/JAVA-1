import org.joda.time.Days;
import org.joda.time.LocalDate;

/**
 * Created by Rapolo on 2017-09-11.
 */
public class PostDateDifference {
    public Integer getDifference(String postDate)
    {
        LocalDate date = new LocalDate().now();
        LocalDate postDateLD = LocalDate.parse(postDate);
        return Days.daysBetween(postDateLD , date ).getDays();
    }
}
