package pl.com.bottega.generaldevelopmenttasks.convertnumberstotext;

import java.util.Scanner;

/**
 * Created by anna on 26.11.2016.
 */
public class ConverterVersion1 {

    private static StringBuilder convertNumberToText(int number) {

        String text = Integer.toString(number);
        char[] arrayOfChar = text.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char c : arrayOfChar) {
            switch (c) {
                case '0':
                    sb.append("zero ");
                    break;
                case '1':
                    sb.append("one ");
                    break;
                case '2':
                    sb.append("two ");
                    break;
                case '3':
                    sb.append("three ");
                    break;
                case '4':
                    sb.append("four ");
                    break;
                case '5':
                    sb.append("five ");
                    break;
                case '6':
                    sb.append("six ");
                    break;
                case '7':
                    sb.append("seven ");
                    break;
                case '8':
                    sb.append("eight ");
                    break;
                case '9':
                    sb.append("nine ");
                    break;
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println("Enter some number: ");
        int number = Integer.valueOf(new Scanner(System.in).nextLine());

        System.out.println("Given number " + number + " converted into text: " + convertNumberToText(number));
    }
}
