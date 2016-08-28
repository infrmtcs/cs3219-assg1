package alphabetizer;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * Created by infrmtcs on 8/28/16
 */

public class Alphabetizer {
    public static UnaryOperator<Stream<String>> sort = Stream::sorted;
}
