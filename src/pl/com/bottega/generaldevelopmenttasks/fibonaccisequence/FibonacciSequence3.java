package pl.com.bottega.generaldevelopmenttasks.fibonaccisequence;

/**
 * Created by anna on 12.11.2016.
 */
public class FibonacciSequence3 {
//rekursja/rekurencja
    public static void main(String[] args) {
        long value = fib(30);
        System.out.println(value);
    }

    public static long fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n-1) + fib(n-2);
    }
}
