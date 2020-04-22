package hw_3.task_8;

import java.util.Scanner;

public class Task_8 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size butterfly");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.println(makeString(i, size));
        }
        for (int i = size - 1; i > 0; i--) {
            System.out.println(makeString(i, size));
        }
   }

    private static String makeString(int number, int size){
       int spaceCount = size * 2 - 2 * number;
       String row= "";
       for (int i = 0; i < spaceCount; i++) {
           row += " ";
       }
       for (int i = number; i > 0 ; i--) {
           row = i + row + i;
       }
       return row;
    }
}
