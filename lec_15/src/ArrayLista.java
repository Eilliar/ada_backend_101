import java.util.ArrayList;
import java.util.List;

public class ArrayLista extends Lista {

    private int size;
    private Object[] array;

    public void ArrayLista(){
        this.size = 0;
        this.array = new Object[10];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int idx) {
        if(idx >= 0 || idx < size ) {
            return this.array[idx];
        }
        return null;
    }

    @Override
    public void add(Object obj) {
        this.array[this.size] = obj;
    }
}
