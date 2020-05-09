package hw_6.task_2;

public class Car {
    private Transmission transmission = new Transmission();
    private Engine engine = new Engine();
    // Transmission, Engine передавай через конструктор класса Car

    public void drive(){
        engine.on();
        if (transmission.getGear() == 0){
            transmission.gearUp();
        }

        // я думаю повышение передач должен иметь возможность пользователь в методе main
        while (transmission.getGear() > 1){
            transmission.gearDown();
        } 
        pushGas();

        System.out.println(getSpeed());
    }

    private void pushGas(){ // пустой газ получился
    }

    private int getSpeed(){
        return transmission.getGear() * 20;
    }

}
