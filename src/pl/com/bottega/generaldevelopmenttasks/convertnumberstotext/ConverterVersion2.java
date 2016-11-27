package pl.com.bottega.generaldevelopmenttasks.convertnumberstotext;

import java.util.Scanner;

/**
 * Created by anna on 26.11.2016.
 */
public class ConverterVersion2 {

    private static void convertNumberToText(int number) {
        int amountOfDigits = Integer.toString(number).length();
        int[] tableOfRemainders = new int[amountOfDigits];

        for (int i = 0; i < amountOfDigits; i++) {
            int remainder = number % 10;
            number /= 10;
            tableOfRemainders[i] = remainder;
        }

        for(int i = 0; i < amountOfDigits / 2; i++) {
            int temp = tableOfRemainders[amountOfDigits - 1 - i];
            tableOfRemainders[amountOfDigits - 1 - i] = tableOfRemainders[i];
            tableOfRemainders[i] = temp;
        }

        for (int i = 0; i < amountOfDigits; i++) {
            switch (tableOfRemainders[i]) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
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
