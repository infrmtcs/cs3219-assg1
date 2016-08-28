package output;

import java.io.*;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by infrmtcs on 8/28/16
 */

public class Output {
    private static final String OUTPUT_FILE = "output.txt";

    public static Function<Stream<String>, Object> write(Boolean isFromFile) {
        return lines -> {
            PrintStream writer = System.out;
            if (isFromFile) {
                try {
                    writer = new PrintStream(OUTPUT_FILE);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            lines.forEach(writer::println);
            return null;
        };
    }
}
