package hw_4.task_3;

import hw_4.task_1.Man;

public class Task_3 {
    public static void main(String[] args) {
        Man[] group = new Man[4];
        group[0] = new Man("Dima",40);
        group[1] = new Man("Masha",30);
        group[2] = new Man("Dima",20);
        group[3] = new Man("Dima",40);

        System.out.println("consilienceCount = " + getConsilienceCount(group));
    }
    private static int getConsilienceCount(Man[] group){
        int consilienceCount = 0;

        for (int i = 0; i < group.length; i++) {
            for (int j = i; j < group.length - 1; j++) {
                if(group[i].equals(group[j + 1])) {
                    consilienceCount += 1;
                }
            }
        }
        return consilienceCount;
    }
}
