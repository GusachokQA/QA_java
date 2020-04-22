package hw_3.task_7;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int[] array = {2, 99, 6, 42, 55, 3};

        boolean needToSort = true;

        while (needToSort) {
            needToSort = false;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needToSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] array, int left, int right) {
        int tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;
    }
}
