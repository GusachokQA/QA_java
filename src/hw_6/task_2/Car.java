package hw_6.task_2;

public class Car {
    private Transmission transmission = new Transmission();
    private Engine engine = new Engine();

    public void drive(){
        engine.on();
        if (transmission.getGear() == 0){
            transmission.gearUp();
        }

        while (transmission.getGear() > 1){
            transmission.gearDown();
        }
        pushGas();

        System.out.println(getSpeed());
    }

    private void pushGas(){
    }

    private int getSpeed(){
        return transmission.getGear() * 20;
    }

}
