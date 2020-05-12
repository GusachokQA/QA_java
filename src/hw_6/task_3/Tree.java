package hw_6.task_3;

import java.util.Scanner;

// выглядит неплохо
public class Tree {
    private Branch[] branches;

    public Tree(int branchCount){
        branches = new Branch[branchCount];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < branches.length; i++) {
            System.out.println("Введите количество фруктов на ветке. Если 0, то рандомное число");
            int fruitCount = scanner.nextInt();
            branches[i] = new Branch(fruitCount);
        }
    }

    public Branch[] getBranches(){
        return branches;
    }
}
