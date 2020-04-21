package hw_3.task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number " + (i + 1));
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
