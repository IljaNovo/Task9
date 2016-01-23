import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class EnglishTextTest {

    @Test
    public void testFrequencyWords() throws Exception {
        EnglishText et = new EnglishText("Hello hello world");

        Map<String, Integer> frequencyWords = et.frequency();

        Assert.assertEquals(frequencyWords.get("Hello").intValue(), 2);
        Assert.assertEquals(frequencyWords.get("world").intValue(), 1);
    }

    @Test
    public void testEmptyText() throws Exception {
        EnglishText et = new EnglishText("");

        Assert.assertEquals(et.findUniqWords().size(), 0);
        Assert.assertEquals(et.frequency().size(), 0);
    }
}