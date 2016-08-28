package alphabetizer;

import storage.Index;

import java.util.Collections;

/**
 * Created by thientran1707 on 8/28/16
 */

public class Alphabetizer {
    private Index index;

    public Alphabetizer(Index index) {
        this.index = index;
    }

    public void sort() {
        Collections.sort(index.getIndexList());
    }
}
