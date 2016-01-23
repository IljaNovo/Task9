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

        for(String item : words) {
            if (!checkBelongs(uniqWords, item)) {
                uniqWords.add(item);
            }
        }

        int i = 0;

        return uniqWords;
    }

    private boolean checkBelongs(Set<String> uniqWords, String str) {
        char[] wordUpperCase = str.toCharArray();
        char[] wordLowerCase = str.toCharArray();

        wordLowerCase[0] = Character.toLowerCase(wordLowerCase[0]);
        wordUpperCase[0] = Character.toUpperCase(wordUpperCase[0]);

        if (uniqWords.contains(new String(wordLowerCase)) ||
                uniqWords.contains(new String(wordUpperCase))) {
            return true;
        }
        else {
            return false;
        }
    }
}
