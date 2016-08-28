package input;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by infrmtcs on 8/28/16
 */

public class InputData {
    public final List<String> ignoreWords;
    public final Stream<String> patterns;

    InputData(List<String> ignoreWords, Stream<String> patterns) {
        this.ignoreWords = ignoreWords;
        this.patterns = patterns;
    }
}
