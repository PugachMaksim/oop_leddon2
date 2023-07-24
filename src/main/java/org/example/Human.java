package org.example;

public class Human extends Actor{
/**
 * Класс Human, который наследуется от Actor и реализовывает ActorBehavoir*/
    public Human(String name) {
        super(name);
    }
    @Override
    public void setMakeOrder(boolean st) {
    }
    @Override
    public void setTakeOrder(boolean st) {
    }
    @Override
    public boolean isMakeOrder() {
        return false;
    }
    @Override
    public boolean isTakeOrder() {
        return false;
    }
    @Override
    String getName() {
        return super.getName();
    }
}
