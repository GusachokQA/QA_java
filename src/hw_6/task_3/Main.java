package hw_6.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите количество веток на банановой пальме");
        Scanner scanner = new Scanner(System.in);

        int branchCount = scanner.nextInt();
        BananaTree bananaTree = new BananaTree(branchCount);

        System.out.println("Введите количество веток на кокосовой пальме");

        branchCount = scanner.nextInt();
        CoconutTree coconutTree = new CoconutTree(branchCount);

        MonkeyBanana monkeyBanana = new MonkeyBanana();
        MonkeyCoconut monkeyCoconut = new MonkeyCoconut();
        MonkeyClever monkeyClever = new MonkeyClever();
        MonkeyManager monkeyManager = new MonkeyManager();

        System.out.println("Банановая обезьяна посчитала бананы на банановой пальме = " + monkeyManager.getFruitCount(monkeyBanana, bananaTree));
        System.out.println("Кокосовая обезьяна посчитала кокосы на кокосовой пальме = " + monkeyManager.getFruitCount(monkeyCoconut, coconutTree));
        System.out.println("Умная обезьяна посчитала бананы на банановой пальме = " + monkeyManager.getFruitCount(monkeyClever, bananaTree));
        System.out.println("Умная обезьяна посчитала кокосы на кокосовой пальме = " + monkeyManager.getFruitCount(monkeyClever, coconutTree));
        System.out.println("Банановая обезьяна посчитала кокосы на кокосовой пальме = " + monkeyManager.getFruitCount(monkeyBanana, coconutTree));
        System.out.println("Кокосовая обезьяна посчитала бананы на банановой пальме = " + monkeyManager.getFruitCount(monkeyCoconut, bananaTree));
    }
}
