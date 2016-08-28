package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by infrmtcs on 8/28/16
 */

class StdinInput extends Input {
    private static final String READ_IGNORE_WORDS = "Please enter ignored words, ending with an empty line:";
    private static final String READ_PATTERNS = "Please enter input lines, ending with an empty line:";

    private static Stream<String> readFromStdin(String message) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> result = new ArrayList<>();
        System.out.println(message);
        try {
            String nextLine;
            while (true) {
                nextLine = reader.readLine();
                if (nextLine.trim().equals("")) break;
                result.add(nextLine);
            }
        } catch (IOException e) {
            System.err.println("Unable to read from stdin!");
        }
        return result.stream();
    }

    static InputData readInputData() {
        return new InputData(processIgnoreWords(readFromStdin(READ_IGNORE_WORDS)), readFromStdin(READ_PATTERNS));
    }
}
