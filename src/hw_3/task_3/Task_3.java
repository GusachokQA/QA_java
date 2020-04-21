package hw_3.task_3;

public class Task_3 {
    public static void main(String[] args) {
        int[] array = {11, 20, 32, 5};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }
}
