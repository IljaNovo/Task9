import java.util.HashSet;
import java.util.Set;

public class EnglishText {

    private String text;

    public EnglishText(String text) {
        this.text = text;
    }

    public Set<String> findUniqWords() {
        HashSet<String> uniqWords = new HashSet<>();
        String[] words = text.split(" ");



        int i = 0;

        return uniqWords;
    }

    private boolean checkBelongs(Set<String> uniqWords, String str) {
        char[] wordUpperCase = str.toCharArray();
        char[] wordLowerCase = str.toCharArray();

        Character.toLowerCase(wordLowerCase[0]);
        Character.toUpperCase(wordUpperCase[0]);

        if (uniqWords.contains(wordLowerCase) ||
                uniqWords.contains(wordUpperCase)) {
            return true;
        }
        else {
            return false;
        }
    }
}
