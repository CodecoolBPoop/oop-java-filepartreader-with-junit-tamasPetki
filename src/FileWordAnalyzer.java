import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FileWordAnalyzer{

    public ArrayList wordsbyABC() throws IOException {
        FilePartReader file = new FilePartReader();
        ArrayList<String> theList = new ArrayList<>(Arrays.asList(file.readLines().toLowerCase().replaceAll("[.|$|,|;|']","").split("[\n| ]")));
        Collections.sort(theList);
        return theList;
    }


}
