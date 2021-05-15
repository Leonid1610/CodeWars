import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * sort by desc a digits from a num
 */
public class DescSort {
    public static int descSort(final int num) {
        var stringNum = String.valueOf(num);
        List<Integer> digits = new ArrayList<>();
        var result = "";

        for (int i = 0; i < stringNum.length(); i++) {
            digits.add(Character.getNumericValue(stringNum.charAt(i)));

            if (i == stringNum.length() - 1) {
                digits.sort(Collections.reverseOrder());
                result = digits.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining());
            }
        }

        return Integer.parseInt(result);
    }
}
