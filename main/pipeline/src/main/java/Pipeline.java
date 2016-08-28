import alphabetizer.Alphabetizer;
import circularshift.CircularShift;
import input.Input;
import output.Output;

import java.util.Arrays;

/**
 * Created by infrmtcs on 8/28/16
 */

public class Pipeline {
    public static void main(String args[]) {
        boolean isFromFile = Arrays.asList(args).contains("-f");
        Input.read(isFromFile)
                .andThen(CircularShift.permute)
                .andThen(Alphabetizer.sort)
                .andThen(Output.write(isFromFile))
                .apply(null);
    }
}
