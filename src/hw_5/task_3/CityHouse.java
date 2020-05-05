package hw_5.task_3;

public class CityHouse extends House{
    public CityHouse(int floors, int tenants) {
        super(floors, tenants);
    }

    @Override
    void turnOnHeating() {
        System.out.println("теплая батарея");
    }
}