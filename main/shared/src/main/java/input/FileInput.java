package input;

import storage.Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by thientran1707 on 8/28/16
 */

public class FileInput extends Input {
    private static final String INPUT_FILE = "input.txt";
    private static final String IGNORE_FILE = "ignore.txt";

    public FileInput(Data data) {
        super(data);
    }

    @Override
    protected void readInputLines() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));
            String nextLine;
            while (true) {
                nextLine = reader.readLine();
                if (nextLine == null) {
                    break;
                }
                storeInputLine(nextLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Unable to read file!");
        } catch (IOException e) {
            System.err.println("I/O error!");
        }
    }

    @Override
    protected void readIgnoreWords() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(IGNORE_FILE));
            String nextLine;
            while (true) {
                nextLine = reader.readLine();
                if (nextLine == null) {
                    break;
                }
                storeIgnoreWord(nextLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Unable to read file!");
        } catch (IOException e) {
            System.err.println("I/O error!");
        }
    }
}
