import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rapolo on 2017-09-12.
 */
public class FindWord {
    public void getLineWithWord(String title, String search, List<String> list)
    {

        if(title.contains(search))
        {
            list.add(title);
        }

    }
}
