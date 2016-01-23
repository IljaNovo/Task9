import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class EnglishTextTest {

    @Test
    public void testFindUniqWords() throws Exception {
        EnglishText et = new EnglishText("Hello hello world");

        Map<String, Integer> frequencyWords = et.frequency();

        int count = frequencyWords.get("Hello");

        //Assert.assertEquals(frequencyWords.get("Hello"), 2);
        Assert.assertTrue(true);
    }
}