package pl.com.bottega.generaldevelopmenttasks.stack;

/**
 * Created by anna on 15.12.2016.
 */
public class ArrayStack<E> implements Stack<E> {

    private E[] stack = (E[]) new Object[1000];
    private int index = -1;

    @Override
    public void push(E element) {
        if (index + 1 >= stack.length)
            throw new IllegalStateException("Stack is overflow");
        index++;
        stack[index] = element;
    }

    @Override
    public E pop() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty.");
        E elementToPop = stack[index];
        stack[index] = null;
        index--;
        return elementToPop;
    }

    @Override
    public boolean isEmpty() {
        return index <= -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= index; i++) {
            sb.append(stack[i]).append(" ");
        }
        return sb.toString();
    }
}
