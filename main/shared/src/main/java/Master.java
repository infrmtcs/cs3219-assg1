import alphabetizer.Alphabetizer;
import circularshift.CircularShift;
import input.FileInput;
import input.Input;
import input.StdinInput;
import output.Output;
import storage.Data;
import storage.Index;

import java.util.Arrays;

/**
 * Created by thientran1707 on 8/28/16
 */

public class Master {
    private Data data = new Data();
    private Index index = new Index();

    private Input input;
    private CircularShift circularShift = new CircularShift(data, index);
    private Alphabetizer alphabetizer = new Alphabetizer(index);
    private Output output;

    public Master(boolean isFromFile) {
        if (isFromFile) {
            this.input = new FileInput(data);
        } else {
            this.input = new StdinInput(data);
        }
        this.output = new Output(index, isFromFile);
    }

    public void run() {
        input.read();
        circularShift.buildIndex();
        alphabetizer.sort();
        output.write();
    }

    public static void main(String args[]) {
        boolean isFromFile = Arrays.asList(args).contains("-f");
        Master master = new Master(isFromFile);
        master.run();
    }
}
