package hw_2.task_7;

public class Task_7 {
    public static void main(String[] args) {
        int sum = 0;
        // 99 в отдельную переменную
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
