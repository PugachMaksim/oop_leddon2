package org.example;

public abstract class Actor implements ActorBehaviour{
    /**
     * Абстрактный класс, который хранит в себе параметры актора, включая
     * состояние готовности сделать заказ и факт получения заказа.*/
    protected String name;
    protected  boolean isMakeOrder;
    protected  boolean isTakeOrder;

    String getName() {
        return name;
    }
    public Actor(String name){
        this.name = name;
    }

}
