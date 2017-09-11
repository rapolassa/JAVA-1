/**
 * Created by Rapolo on 2017-09-11.
 */
public class StringCleaner {

    public String removeParts(String titleString)
    {
        return titleString.replace("&nbsp;", " ");
    }

    public String removePartsAfter(String titleString)
    {
        return titleString.split("T")[0];
    }
}
