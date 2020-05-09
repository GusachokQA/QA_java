package hw_6.task_3;

// я бы предложил сделать этот класс интерфейсом
public abstract class Monkey {

    public int sumFruitCount(Tree tree) {
        int sumFruit = 0;

        for (int i = 0; i < tree.getBranches().length; i++) {
            sumFruit += tree.getBranches()[i].getFruitCount();
        }
        return sumFruit;
    }
}
