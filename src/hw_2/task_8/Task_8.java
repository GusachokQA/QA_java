package hw_2.task_8;

public class Task_8 {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumUneven = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else if (i % 2 != 0) {
                sumUneven += i;
            }
        }
        System.out.println("sumEven = " + sumEven);
        System.out.println("sumUneven = " + sumUneven);
        System.out.println("totalSum = " + (sumEven + sumUneven));
    }
}
