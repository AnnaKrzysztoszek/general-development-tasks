package pl.com.bottega.generaldevelopmenttasks.convertnumberstotext;

import java.util.Scanner;

/**
 * Created by anna on 26.11.2016.
 */
public class ConverterVersion1 {

    private static void convertNumberToText(int number) {

        String text = Integer.toString(number);
        char[] arrayOfChar = text.toCharArray();

        for (char c : arrayOfChar) {
            switch (c) {
                case '0':
                    System.out.print("zero");
                    break;
                case '1':
                    System.out.print("one");
                    break;
                case '2':
                    System.out.print("two");
                    break;
                case '3':
                    System.out.print("three");
                    break;
                case '4':
                    System.out.print("four");
                    break;
                case '5':
                    System.out.print("five");
                    break;
                case '6':
                    System.out.print("six");
                    break;
                case '7':
                    System.out.print("seven");
                    break;
                case '8':
                    System.out.print("eight");
                    break;
                case '9':
                    System.out.print("nine");
                    break;
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter some number: ");
        int number = Integer.valueOf(new Scanner(System.in).nextLine());

        System.out.println("Given number " + number + " converted into text: ");
        convertNumberToText(number);
    }
}
