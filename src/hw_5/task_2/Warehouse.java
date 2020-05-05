package hw_5.task_2;

import java.util.Arrays;

public class Warehouse {
    private final int[] array;
    private int index;

    public Warehouse(){
        array = new int[]{1, 2, 3, 4, 5};
    }

    public int next(){
        int next = array[index];
        index = (index + 1) % array.length;
        return next;
    }

    public int[] getArray(){
        return array;
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }

}
