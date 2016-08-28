package storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thientran1707 on 8/28/16
 */

public class Data {
    private List<String> patternList = new ArrayList<>();
    private List<String> ignoreWords = new ArrayList<>();

    public List<String> getPatternList() {
        return patternList;
    }

    public List<String> getIgnoreWords() {
        return ignoreWords;
    }
}
