package hw_7.task_6;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        String[] words = {"Word", "Cat", "window", "fish", "House"};

        int count = 0;

        // этот цикл в отдельный метод
        for (int i = 0; i < words.length; i++) {
            if (startsW(words[i])){
                count++;
            }
        }

        String[] wordsStartsW = new String[count];
        int index = 0;

        // этот цикл в отдельный метод
        for (int i = 0; i < words.length; i++) {
            if (startsW(words[i])){
                wordsStartsW[index] = words[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(wordsStartsW));
    }

    private static boolean startsW(String word){
        String firstLetter = word.substring(0, 1);
        return firstLetter.equalsIgnoreCase("W");
    }
}
