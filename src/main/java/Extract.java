import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

/**
 * Created by Rapolo on 2017-09-11.
 */
public class Extract {

    public String[] getDocument(Document doc)
    {
            Elements newsHeadlines = doc.select("h3");
            String html = newsHeadlines.html();
            return html.split("\\n");
    }

    }

