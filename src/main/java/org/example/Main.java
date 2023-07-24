package org.example;

public class Main {
    public static void main(String[] args) {
        Market shop = new Market();
        Human human1 = new Human("Olga");
        Human human2 = new Human("Denis");
        Human human3 = new Human("Viktoriya");
        Human human4 = new Human("Ivan");
        shop.acceptToMarket(human1);
        shop.acceptToMarket(human2);
        shop.acceptToMarket(human3);
        shop.acceptToMarket(human4);
        shop.update();
    }
}