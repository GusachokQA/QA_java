package hw_7.task_4;

public class Task_4 {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always add important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible plan add but without compromising add the core idea";

        int countWord;

        String alert = "alert";
        String add = "add";
        String good = "good";
        String plan = "plan";

        /*
        String[] words = {alertSearch, ...};
        for (int i = 0; i < words.length; i++ {
             countWord = findWord(alertSearch, text);
             System.out.println("Слово 'alert' содердится с тексте " + countWord + " раз");
        }
        */
        
        countWord = findWord(alert, text);
        System.out.println("alert = " + countWord);
        countWord = findWord(add, text);
        System.out.println("add = " + countWord);
        countWord = findWord(good, text);
        System.out.println("good = " + countWord);
        countWord = findWord(plan, text);
        System.out.println("plan = " + countWord);
    }

    public static int findWord(String searchWord, String text){
        int countWord = 0;
        for (int i = 0; i > -1; i++) {
            i = text.indexOf(searchWord, i);
            if (i == -1) {
                break;
            }
            countWord++;
        }
        return countWord;
    }
}
