package tasks.task1;

import java.util.ArrayList;
import java.util.List;

public class MyListChanged<T extends Comparable<T>> {
    List<T> array2;
    MyListChanged(){
        array2 = new ArrayList<>();
    }
    public void add(T element){
        array2.add(element);
    }

    @Override
    public String toString() {
        return "MyListChanged{" +
                "array2=" + array2 +
                '}';
    }
}
