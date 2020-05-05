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
        index = (index + 1) % array.length; // я вот совсем не уверен что эта строка будет корректно работать, 
        // если попробовать дважды распечатать весь массив
        return next;
    }

    // по условию массив нельзя изменять, а ты при помощи геттера предоставил к нему доступ, теперь его можно изменить
    public int[] getArray(){
        return array;
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }

}
