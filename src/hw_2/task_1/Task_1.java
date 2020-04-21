package hw_2.task_1;

public class Task_1 {
    public static void main(String[] args)  {
        double dayDistance = 10;
        double sum = 0;
        for (int i = 0; i < 7; i++) {
            sum += dayDistance;
            dayDistance *= 1.1;
        }
        System.out.println("sum = " + sum);
    }
}
