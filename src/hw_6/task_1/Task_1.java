package hw_6.task_1;

// +
public class Task_1 {
    private final static int[] array = {1, 2, 3};

    public static void main(String[] args) {
        printElement(0);
    }

    private static void printElement(int index){
        if (index < array.length){
            System.out.println(array[index]);
            printElement(index + 1);
        }
    }
}
