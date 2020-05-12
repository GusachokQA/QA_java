package hw_7.task_8;

import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {
        String[] engines = {"1.4", "1.4", "1.4", "1.8", "1.8", "1.8", "1.8"};

        for (int i = 0; i < engines.length; i++) {
            if(engines[i].equals("1.4")){
                engines[i] = "2.0T";
            }
            if(engines[i].equals("1.8")){
                engines[i] = "1.8T";
            }
        }
        System.out.println(Arrays.toString(engines));
    }
}
