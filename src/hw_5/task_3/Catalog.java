package hw_5.task_3;

public class Catalog {
    public House[] houses;

    public Catalog(){
        // дома лучше передавать через конструктор
        houses = new House[4];
        houses[0] = new VillageHouse(1,4);
        houses[1] = new VillageHouse(1,3);
        houses[2] = new CityHouse(10,31);
        houses[3] = new CityHouse(11,41);
    }
}
