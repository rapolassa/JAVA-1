import org.joda.time.LocalDate;

import java.util.Date;

/**
 * Created by Rapolo on 2017-09-11.
 */
public class Story {
    private String title;
    private String postDate;

    public Story() {

    }

    public Story(String title, String postDate) {
        this.title = title;
        this.postDate = postDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }
}
