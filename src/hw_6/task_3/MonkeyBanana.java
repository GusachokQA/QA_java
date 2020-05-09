package hw_6.task_3;

public class MonkeyBanana extends Monkey{
    @Override
    public int sumFruitCount(Tree tree) {
        if (tree instanceof BananaTree){ // instanceof используется в крайне редких случаях, это скорее недостаток, чем добро
            // переопредели здесь метод sumFruitCount() и этот IF можно будет убрать
            return super.sumFruitCount(tree);
        }
        else {
            return 0;
        }
    }
}
