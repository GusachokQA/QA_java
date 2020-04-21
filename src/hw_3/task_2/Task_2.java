package hw_3.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = {11, 20, 32, 5};

        double sum = 0;
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;

        System.out.println(average);
    }
}
