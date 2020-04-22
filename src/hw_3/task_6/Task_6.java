package hw_3.task_6;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = 0;

        for (int i = 0; i <array.length; i++) {
            if (array[i] % 2 == 0){
                evenCount++;
            }
        }
        int[] arrayEven = new int[evenCount];
        int lastIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                arrayEven[lastIndex] = array[i];
                lastIndex++;
            }
        }
        System.out.println(Arrays.toString(arrayEven));
    }
}
