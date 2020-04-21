package hw_2.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int ameba = 1;
        // 24 в отдельную переменную
        // 3 в отдельную переменную
        for (int i = 0; i <= 24; i += 3) {
            System.out.println("ameba = " + ameba + " hours = " + i);
            // 2 в отдельную переменную
            ameba *= 2;
        }
    }
}
