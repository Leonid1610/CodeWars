import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence
 * "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
 *
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */
public class PangramChecker {
    private boolean check(String sentence) {
        String upperCaseSentence = sentence.toUpperCase();

        List<Character> alphabet = IntStream.rangeClosed('A', 'Z')
            .mapToObj(letter -> (char) letter)
            .collect(Collectors.toList());

        for (int i = 0; i < alphabet.size(); i++) {
            alphabet.removeIf(letter -> upperCaseSentence.indexOf(letter) != -1);
            i++;
        }

        return alphabet.isEmpty();
    }
}
