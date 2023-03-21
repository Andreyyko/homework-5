package tasks.task1;

import java.util.ArrayList;
import java.util.List;
public class MyList<T extends Number> {
    List<T> array;

    MyList() {
        array = new ArrayList<>();
    }

    public void add(T element) {
        array.add(element);
    }

    public T theLargest() {
        if (array.size() < 1) {
            return null;
        }
        T theLargestElement = array.get(0);
        for (T element : array) {
            if (theLargestElement.doubleValue() < element.doubleValue()) {
                theLargestElement = element;
            }
        }
        return theLargestElement;
    }

    public T theSmallest() {
        if (array.size() < 1) {
            return null;
        }
        T theSmallest = array.get(0);
        for (T element : array) {
            if (theSmallest.doubleValue() > element.doubleValue()) {
                theSmallest = element;
            }
        }
        return theSmallest;
    }
}