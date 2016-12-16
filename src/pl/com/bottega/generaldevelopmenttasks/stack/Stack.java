package pl.com.bottega.generaldevelopmenttasks.stack;

/**
 * Created by anna on 15.12.2016.
 */
public interface Stack<E> {

    void push(E element);

    E pop();

    boolean isEmpty();
}
