public class Main {

    public static void main(String[] args) {
        SimpleStack mySimpleStack = new SimpleStack();

        mySimpleStack.Push("1st Element");
        mySimpleStack.Push("2nd Element");
        mySimpleStack.Push(3);
        mySimpleStack.Push(4.0);

        System.out.println("### Stack Initialization: ");
        mySimpleStack.PrintElements();

        Object next = mySimpleStack.Peek();
        System.out.println("### PEEKING Next element: ");
        System.out.println(next);

        System.out.println("### Stack After PEEKING: ");
        mySimpleStack.PrintElements();

        Object popped = mySimpleStack.Pop();

        System.out.println("### POPPING Next element: ");
        System.out.println(popped);

        System.out.println("### Stack After POPPING: ");
        mySimpleStack.PrintElements();

    }
}
