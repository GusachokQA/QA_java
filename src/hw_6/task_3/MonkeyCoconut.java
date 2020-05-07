package hw_6.task_3;

public class MonkeyCoconut extends Monkey{
    @Override
    public int sumFruitCount(Tree tree) {
        if (tree instanceof CoconutTree){
            return super.sumFruitCount(tree);
        }
        else {
            return 0;
        }
    }
}
