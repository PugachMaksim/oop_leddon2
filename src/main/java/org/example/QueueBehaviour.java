package org.example;

public interface QueueBehaviour {
    /**
     * Интерфейс, который описывает
     * логику очереди – помещение в/освобождение из
     * очереди, принятие/отдача заказа*/
    void takeInQueue(Actor actor);   //Вход в очередь
    void takeOrders();              //Заказ
    void giveOrders();              //Получение заказа
    void releaseFromQueue();        //Выход их очереди

}
