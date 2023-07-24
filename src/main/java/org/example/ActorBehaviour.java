package org.example;

public interface ActorBehaviour {
    /**
     * Интерфейс, который будет содержать описание возможных
     * действий актора в очереди/магазине*/
    void setMakeOrder(boolean st);
    void setTakeOrder(boolean st);
    boolean isMakeOrder();
    boolean isTakeOrder();
     }
