package hw_6.task_2;

public class Engine {
    private boolean engineOn;

    public void on(){
        if(!engineOn){
            engineOn = true;
        }
        else {
            System.out.println("двигатель уже работает");
        }
    } // абзац между методами
    public void off(){
        if(engineOn){
            engineOn = false;
        }
        else {
            System.out.println("двигатель уже не работает");
        }
    }
}
