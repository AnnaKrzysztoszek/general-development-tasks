package pl.com.bottega.generaldevelopmenttasks.stack;

/**
 * Created by anna on 15.12.2016.
 */
public class StackApp {

    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>();

        stack.push("A");
        System.out.println(stack);

        stack.push("B");
        System.out.println(stack);

        stack.push("C");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        stack.push("D");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
}
