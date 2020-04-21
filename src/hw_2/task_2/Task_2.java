package hw_2.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int ameba = 1;

        for (int i = 0; i <= 24; i += 3) {
            System.out.println("ameba = " + ameba + " hours = " + i);
            ameba *= 2;
        }
    }
}
