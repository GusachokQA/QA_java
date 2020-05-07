package hw_6.task_2;

public class Transmission {
    private int gear;

    public void gearUp(){
        if(gear < 7){
            gear++;
        }
    }

    public void gearDown(){
        if(gear > 0){
            gear--;
        }
    }

    public int getGear(){
        return gear;
    }
}
