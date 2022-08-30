import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> words = new HashSet<>();
        Collections.addAll(words, text.split("\\P{IsAlphabetic}+"));
        return words.contains(word);

    }
}
