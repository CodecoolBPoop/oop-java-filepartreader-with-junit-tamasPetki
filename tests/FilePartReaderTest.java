import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

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
        assertThrows(IOException.class, () -> {
            file.read();
        });
    }
}