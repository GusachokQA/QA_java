package hw_5.task_2;

public class MainWarehouse {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        /*
        а что если вместо кучи строк System.out.println(warehouse.next()); сделать вот так:
        for(int i = 0; i < 10; i++) {
            System.out.println(warehouse.next());
        }
        */
        System.out.println(warehouse.toString()); // System.out.println(warehouse);
    }
}
