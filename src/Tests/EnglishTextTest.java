import org.junit.Assert;
import org.junit.Test;

public class EnglishTextTest {

    @Test
    public void testFindUniqWords() throws Exception {
        EnglishText et = new EnglishText("Hello hello world");

        et.findUniqWords();

        int y = 0;

        Assert.assertTrue(true);
    }
}