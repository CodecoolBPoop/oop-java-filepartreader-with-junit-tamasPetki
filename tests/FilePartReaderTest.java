import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {
    @Test
    public void testIsToLineSmallerThanFromLine() {
        FilePartReader file = new FilePartReader();
        assertThrows(IllegalArgumentException.class, () -> {
            file.setup("", 15,5);
        });
    }

    @Test
    public void testIfFileNotFound() {
        FilePartReader file = new FilePartReader();
        file.setup("badpath/bad.txt", 5, 10);
        assertThrows(IOException.class, () -> {
            file.read();
        });
    }

    @Test
    public void testWordsArePalindromeMethod() throws IOException {
        FileWordAnalyzer file = new FileWordAnalyzer();
        ArrayList<String> testList = new ArrayList<>(Arrays.asList("non","a","non"));
        assertEquals(file.wordsArePalindrome(), testList);
    }

    @Test
    @Disabled
    public void testWordsABCMethod() throws IOException {
        FileWordAnalyzer file = new FileWordAnalyzer();
        ArrayList<String> testList = new ArrayList<>(Arrays.asList("")); //TODO Fill in the list
        assertEquals(file.wordsbyABC(), testList);
    }

    @Test
    @Disabled
    public void testWordsContaininSubStringMethod() throws IOException {
        FileWordAnalyzer file = new FileWordAnalyzer();
        ArrayList<String> testList = new ArrayList<>(Arrays.asList("")); //TODO Fill in the list
        assertEquals(file.wordsContainingSubString(""), testList); //TODO Fill in the testString
    }
}