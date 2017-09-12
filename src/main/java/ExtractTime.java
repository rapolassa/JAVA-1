import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by Rapolo on 2017-09-12.
 */
public class ExtractTime {
    public String[] getPostTime(Document doc, String[] listOfTime)
    {
        Elements times = doc.select("time");
        int i = 0;
        for (Element element: times) {
            listOfTime[i] = element.attr("datetime");
            i++;
        }
        return listOfTime;
    }
}
