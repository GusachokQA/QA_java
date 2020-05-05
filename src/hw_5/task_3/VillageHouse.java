package hw_5.task_3;

public class VillageHouse extends House{
    public VillageHouse(int floors, int tenants) {
        super(floors, tenants);
    }

    @Override
    void turnOnHeating() {
        System.out.println("нужны дрова");
    }
}
