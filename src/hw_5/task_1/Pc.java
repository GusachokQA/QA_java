package hw_5.task_1;

// +
public class Pc implements Computer{
    @Override
    public void on(){
        System.out.println("PC on");
    }

    @Override
    public void off(){
        System.out.println("PC off");
    }

    @Override
    public void reset(){
        System.out.println("PC reset");
    }

}
