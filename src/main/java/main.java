import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.*;

/**
 * Created by Rapolo on 2017-09-09.
 */
public class main {

    public static void main(String[] args) throws IOException {

        String[] listOfTitles;
        String[] listOfTime;
        List<Story> listOfStories = new ArrayList<Story>();
        Document doc = null;

        try {
            doc = Jsoup.connect("https://medium.com/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Extract extract = new Extract();
        listOfTitles = extract.getDocument(doc); // The titles
        listOfTime = new String[listOfTitles.length];


        StringCleaner stringCleaner = new StringCleaner();
        for (int i = 0; i < listOfTitles.length; i++) {
            listOfTitles[i] = stringCleaner.removeParts(listOfTitles[i]);
        }

        extract.getPostTime(doc, listOfTime);

        for (int i = 0; i < listOfTime.length; i++) {
            Story story = new Story(listOfTitles[i], stringCleaner.removePartsAfter(listOfTime[i]));
            listOfStories.add(story);
        }

        PostDateDifference postDateDifference = new PostDateDifference();
        CountMoney countMoney = new CountMoney();
        for (Story story: listOfStories) {
            System.out.println(story.getTitle() + " " + story.getPostDate() + " Days since post - " + postDateDifference.getDifference(story.getPostDate())
                    +" "+ countMoney.salary(postDateDifference.getDifference(story.getPostDate()), story.getPostDate()));
        }



    }

}

