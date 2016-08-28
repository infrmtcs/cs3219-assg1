package circularshift;

import storage.Data;
import storage.Index;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by thientran1707 on 8/28/16
 */

public class CircularShift {
    private Data data;
    private Index index;

    public CircularShift(Data data, Index index) {
        this.data = data;
        this.index = index;
    }

    public void buildIndex() {
        for (String pattern : data.getPatternList()) {
            LinkedList<String> tokenizedPattern = new LinkedList<>();
            tokenizedPattern.addAll(Arrays.asList(pattern.split("\\s+")));
            for (int i = 0; i < tokenizedPattern.size(); ++i) {
                if (!data.getIgnoreWords().contains(tokenizedPattern.peekFirst().toLowerCase())) {
                    index.getIndexList().add(String.join(" ", tokenizedPattern));
                }
                tokenizedPattern.add(tokenizedPattern.pollFirst());
            }
        }
    }
}
