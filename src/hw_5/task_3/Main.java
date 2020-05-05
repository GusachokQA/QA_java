package hw_5.task_3;

// +
public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        for (int i = 0; i < catalog.houses.length; i++) {
            House house = catalog.houses[i];
            System.out.println("количество этажей = " + house.getAmountOfFloor());
            house.turnOnHeating();
            System.out.println("количество жильцов = " + house.getAmountOfTenant());
            System.out.println();
        }
    }
}
