package hw_6.task_3;

public class Branch {
    private int fruitCount;

    public Branch(int fruitCount){
        this.fruitCount = fruitCount;
        if (fruitCount == 0){
            this.fruitCount = (int) (Math.random() * 5);
        }
    }

    public int getFruitCount() {
        return fruitCount;
    }
}
