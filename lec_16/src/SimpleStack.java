import java.util.LinkedList;

public class SimpleStack extends  Stack{


    void Push(Object obj){
        this.objects.add(obj);
    };

    Object Pop(){
        Object obj = this.objects.get(this.objects.size() -1);
        this.objects.remove(obj);
        return obj;
    };

    Object Peek(){
        return this.objects.get(this.objects.size() -1);
    }

    @Override
    void PrintElements(){
        for(Object obj: this.objects){
            System.out.println(obj);
        }
    }
}
