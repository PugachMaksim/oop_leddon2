package org.example;


import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    /**
     * Класс, который реализовывает два
     * вышеуказанных интерфейса (QueueBehaviour и MarketBehaviour) и хранит в списке
     * список людей в очереди в различных статусах*/
    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " Встал в очередь"); //Вывод человека, вставшего в очередь
        this.queue.add(actor);               //Добавили в очередь
    }
    @Override
    public void takeOrders() {              //Сделал заказ Да/Нет
        for (Actor actor: queue) {
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " Сделал заказ");
            }
        }
    }
    @Override
    public void giveOrders() {              //Получил заказ Да/Нет
        for (Actor actor: queue) {
            if (actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " Получил заказ");
            }
        }
    }
    @Override
    public void releaseFromQueue() {        //Уходит из очереди
        List<Actor>releasedActors = new ArrayList<>();
        for (Actor actor: queue) {
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " Вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }
    @Override
    public void acceptToMarket(Actor actor){
        System.out.println(actor.getName() + " Пришел в магазин");
        takeInQueue(actor);
    }
    @Override
    public void releaseFromMarket(List<Actor>actors){
        for (Actor actor:actors) {
            System.out.println(actor.getName() + " Вышел из магазина");
            queue.remove(actor);

        }
    }
    @Override
    public void update(){
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
