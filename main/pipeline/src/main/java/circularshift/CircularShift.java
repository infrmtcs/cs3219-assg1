package circularshift;

import input.InputData;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by infrmtcs on 8/28/16
 */

public class CircularShift {
    private static Stream<String> permute(String pattern, List<String> ignoreWords) {
        List<String> tokens = Arrays.asList(pattern.split("\\s+"));
        return IntStream.range(0, tokens.size())
                .filter(i -> !ignoreWords.contains(tokens.get(i).toLowerCase()))
                .mapToObj(i -> Stream.concat(
                                tokens.subList(i, tokens.size()).stream(),
                                tokens.subList(0, i).stream())
                        .map(s -> ignoreWords.contains(s.toLowerCase()) ? s.toLowerCase() : s)
                        .collect(Collectors.joining(" ")));
    }

    public static Function<InputData, Stream<String>> permute =
            data -> data.patterns.flatMap(pattern -> permute(pattern, data.ignoreWords));
}
