package hw_7.task_9;

public class Task_9 {
    public static void main(String[] args) {
        String[] words = {"Word", "Cat", "window", "fish", "House",  "window2"};

        int minSymbolCount = 5;

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > minSymbolCount){
                System.out.println(words[i]);
            }
        }
    }
}
