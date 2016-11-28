package pl.com.bottega.generaldevelopmenttasks.convertnumberstotext;

import java.util.Scanner;

/**
 * Created by anna on 26.11.2016.
 */
public class ConverterVersion2 {

    private static StringBuilder convertNumberToText(int number) {
        int amountOfDigits = Integer.toString(number).length();
        int[] tableOfRemainders = new int[amountOfDigits];

        for (int i = 0; i < amountOfDigits; i++) {
            int remainder = number % 10;
            number /= 10;
            tableOfRemainders[i] = remainder;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = amountOfDigits - 1; i >= 0; i--) {
            switch (tableOfRemainders[i]) {
                case 0:
                    sb.append("zero ");
                    break;
                case 1:
                    sb.append("one ");
                    break;
                case 2:
                    sb.append("two ");
                    break;
                case 3:
                    sb.append("three ");
                    break;
                case 4:
                    sb.append("four ");
                    break;
                case 5:
                    sb.append("five ");
                    break;
                case 6:
                    sb.append("six ");
                    break;
                case 7:
                    sb.append("seven ");
                    break;
                case 8:
                    sb.append("eight ");
                    break;
                case 9:
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
