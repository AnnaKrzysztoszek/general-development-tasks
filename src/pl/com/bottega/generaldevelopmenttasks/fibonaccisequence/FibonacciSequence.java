package pl.com.bottega.generaldevelopmenttasks.fibonaccisequence;

/**
 * Created by anna on 09.11.2016.
 */
public class FibonacciSequence {

    public static void main(String[] args) {

        int sequence[] = new int[10];

        sequence[0] = 0;

        if (sequence.length == 1)
            System.out.print(sequence[0]);

        if (sequence.length > 1) {
            sequence[1] = 1;
            System.out.print(sequence[0] + " " + sequence[1] + " ");

            for (int i = 2; i < sequence.length; i++) {
                sequence[i] = sequence[i - 2] + sequence[i - 1];
                System.out.print(sequence[i] + " ");
            }
        }

    }

}
