package input;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by infrmtcs on 8/28/16
 */

public class Input {
    static List<String> processIgnoreWords(Stream<String> input) {
        return input.flatMap(s -> Arrays.stream(s.trim().split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public static Function<Object, InputData> read(Boolean isFromFile) {
        if (isFromFile) {
            return o -> FileInput.readInputData();
        } else {
            return o -> StdinInput.readInputData();
        }
    }
}
