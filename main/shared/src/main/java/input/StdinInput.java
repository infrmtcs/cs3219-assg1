package input;

import storage.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by thientran1707 on 8/28/16
 */

public class StdinInput extends Input {
    private static final String READ_IGNORE_WORDS = "Please enter ignored words, ending with an empty line:";
    private static final String READ_INPUT_LINES = "Please enter input lines, ending with an empty line:";

    public StdinInput(Data data) {
        super(data);
    }

    @Override
    protected void readInputLines() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nextLine;
        try {
            System.out.println(READ_INPUT_LINES);
            while (true) {
                nextLine = reader.readLine();
                if (nextLine.isEmpty()) {
                    break;
                }
                storeInputLine(nextLine);
            }
        } catch (IOException e) {
            System.err.println("I/O error!");
        }
    }

    @Override
    protected void readIgnoreWords() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nextLine;
        try {
            System.out.println(READ_IGNORE_WORDS);
            while (true) {
                nextLine = reader.readLine();
                if (nextLine.isEmpty()) {
                    break;
                }
                storeIgnoreWord(nextLine);
            }
        } catch (IOException e) {
            System.err.println("I/O error!");
        }
    }
}
