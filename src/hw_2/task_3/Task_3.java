package hw_2.task_3;

public class Task_3 {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        // 256 в отдельную переменную
        while (number <= 256) {
           sum += number;
            // 2 в отдельную переменную
           number *=2;
        }
        System.out.println("sum = " + sum);
    }
}
