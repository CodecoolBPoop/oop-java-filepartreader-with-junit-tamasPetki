import java.io.IOException;
import java.lang.reflect.Array;
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

    public ArrayList wordsContainingSubString(String subString) throws IOException {
        FilePartReader file = new FilePartReader();
        ArrayList<String> theList = new ArrayList<>(Arrays.asList(file.readLines().toLowerCase().replaceAll("[.|$|,|;|']","").split("[\n| ]")));
        ArrayList<String> resultList = new ArrayList<>();
        for(String word: theList) {
            if(word.contains(subString)) {
                resultList.add(word);
            }
        }
        return resultList;
    }

    public ArrayList wordsArePalindrome() throws IOException {
        FilePartReader file = new FilePartReader();
        ArrayList<String> theList = new ArrayList<>(Arrays.asList(file.readLines().toLowerCase().replaceAll("[.|$|,|;|']","").split("[\n| ]")));
        ArrayList<String> resultList = new ArrayList<>();
        for(String word: theList) {
            if(word.equals(new StringBuilder(word).reverse().toString())) {
                resultList.add(word);
            }
        }
        return resultList;
    }
}
