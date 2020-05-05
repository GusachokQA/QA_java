package hw_5.task_3;

public abstract class House {
    private int amountOfFloor;
    private int amountOfTenant;

    public House(int floors, int tenants){
        this.amountOfFloor = floors;
        this.amountOfTenant = tenants;
    }

    int getAmountOfFloor() {
        return amountOfFloor;
    }

    int getAmountOfTenant() {
        return amountOfTenant;
    }

    abstract void turnOnHeating();
}
