package hw_3.task_5;

import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[] arrayToInvert = {0, 1, 2, 3, 4};
        int[] invertArray = new int[arrayToInvert.length];

        for (int i = 0; i < arrayToInvert.length; i++) {
            invertArray[i] = arrayToInvert [arrayToInvert.length - i - 1];
        }
        System.out.println(Arrays.toString(invertArray));
    }
}
