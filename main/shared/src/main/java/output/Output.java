package output;

import storage.Index;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by thientran1707 on 8/28/16
 */

public class Output {
    private static final String OUTPUT_FILE = "output.txt";

    private PrintStream writer;
    private Index index;

    public Output(Index index, boolean isFromFile) {
        this.index = index;
        if (isFromFile) {
            try {
                this.writer = new PrintStream(OUTPUT_FILE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            this.writer = System.out;
        }
    }

    public void write() {
        for (String result : index.getIndexList()) {
            writer.println(result);
        }
        writer.close();
    }
}
