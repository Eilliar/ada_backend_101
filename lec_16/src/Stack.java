import java.util.LinkedList;

public abstract class Stack {

    LinkedList<Object> objects = new LinkedList<Object>();

    abstract void Push(Object obj);

    abstract Object Pop();

    abstract Object Peek();

    abstract void PrintElements();
}
