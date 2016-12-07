package pl.com.bottega.generaldevelopmenttasks.convertnumberstotext;

/**
 * Created by anna on 03.12.2016.
 */
public class ConverterApp {

    public static void main(String[] args) {
        long userInput = read();
        String result = AlmightyStringUtils.convert(userInput, Language.PL);//argument
        display(result);

        double userInput2 = readDouble();
        result = AlmightyStringUtils.convert(userInput2, Language.ENG);
        display(result);
    }

    private static double readDouble() {
        return read() / 20 / 8;
    }

    private static void display(String result) {
        System.out.println(result);
    }

    private static long read() {
        return 25000;
    }
}
