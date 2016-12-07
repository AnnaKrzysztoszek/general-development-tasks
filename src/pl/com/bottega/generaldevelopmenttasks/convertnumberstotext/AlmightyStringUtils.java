package pl.com.bottega.generaldevelopmenttasks.convertnumberstotext;

/**
 * Created by anna on 03.12.2016.
 */
public class AlmightyStringUtils {

    public static String convert(long number, Language language) {//parametr
        StringBuilder result = new StringBuilder();
        boolean first = true;
        do {
            long digit = number % 10;

            if (first)
                first = false;
            else
                result.insert(0, " ");

            result.insert(0, digitToWord((char) ('0' + digit), language));
            number /= 10;
        } while (number != 0);
        return result.toString();
    }

    public static String convert(double value, Language language) {
        String stringValue = String.valueOf(value);
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (char character : stringValue.toCharArray()) {
            String word = digitToWord(character, language);

            if (first)
                first = false;
            else
                result.append(" ");

            result.append(word);
        }
        return result.toString();
    }

    private static String digitToWord(char character, Language language) {
        return language.getText(character);
    }
}
