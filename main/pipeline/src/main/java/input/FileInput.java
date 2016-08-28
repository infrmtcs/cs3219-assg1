package input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

/**
 * Created by infrmtcs on 8/28/16
 */

class FileInput extends Input {
    private static final String INPUT_FILE = "input.txt";
    private static final String IGNORE_FILE = "ignore.txt";

    private static Stream<String> readFromFile(String fileName) {
        Stream<String> lines = null;
        try {
            lines = new BufferedReader(new FileReader(fileName)).lines();
        } catch (FileNotFoundException e) {
            System.err.println("Unable to read file!");
        }
        return lines;
    }

    static InputData readInputData() {
        return new InputData(processIgnoreWords(readFromFile(IGNORE_FILE)), readFromFile(INPUT_FILE));
    }
}
