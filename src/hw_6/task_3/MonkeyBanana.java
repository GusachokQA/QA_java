package hw_6.task_3;

public class MonkeyBanana extends Monkey{
    @Override
    public int sumFruitCount(Tree tree) {
        if (tree instanceof BananaTree){
            return super.sumFruitCount(tree);
        }
        else {
            return 0;
        }
    }
}
