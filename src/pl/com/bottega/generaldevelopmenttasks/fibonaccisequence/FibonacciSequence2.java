package pl.com.bottega.generaldevelopmenttasks.fibonaccisequence;

/**
 * Created by anna on 12.11.2016.
 */
public class FibonacciSequence2 {

    public static void main(String[] args) {
        int no = readNumber();
        int previous = 1;
        int prePrevious = 0;
        for (int i = 2; i <= no; i++) {
            int current = prePrevious + previous;
            prePrevious = previous;
            previous = current;
        }
        System.out.println(previous);
    }

    private static int readNumber() {
        return 20;
    }
}
