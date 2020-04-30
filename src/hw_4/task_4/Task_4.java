package hw_4.task_4;

import hw_4.task_1.Man;

public class Task_4 {
    public static void main(String[] args) {
        Man dima = new Man();
        Man alex = new Man();
        Man oleg = new Man();

        oleg.setText("new text");
        System.out.println(dima.getText());
        System.out.println(alex.getText());
        System.out.println(oleg.getText());
    }
}
