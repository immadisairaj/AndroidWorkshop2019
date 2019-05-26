import java.util.Stack;

public class StackExample {
    public static void main(String... args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(12);
        integerStack.push(10);
        integerStack.push(123);
        System.out.println(integerStack);
        integerStack.pop();
        System.out.println(integerStack);
    }
}