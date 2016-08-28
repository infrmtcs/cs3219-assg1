package input;

import storage.Data;

/**
 * Created by thientran1707 on 8/28/16
 */

public abstract class Input {
    Data data;

    Input(Data data) {
        this.data = data;
    }

    Input() {}

    protected void storeInputLine(String inputLine) {
        data.getPatternList().add(inputLine);
    }

    protected void storeIgnoreWord(String ignoreWordInput) {
        String[] ignoreWords = ignoreWordInput.trim().split("\\s+");
        for (String word : ignoreWords) {
            data.getIgnoreWords().add(word.toLowerCase());
        }
    }

    protected abstract void readInputLines();
    protected abstract void readIgnoreWords();

    public void read() {
        readIgnoreWords();
        readInputLines();
    }
}
