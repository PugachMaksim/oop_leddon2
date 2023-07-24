package org.example;

import java.util.List;

public interface MarketBehaviour {
    /**
     * Интерфейс, который описывает
     * логику магазина – приход/уход покупателей,
     * обновление состояния магазина*/
    void acceptToMarket(Actor actor);        //Приход покупателя
    void releaseFromMarket(List<Actor> actors);   //Уход покупателя
    void update();                          //Обновить состояние магазина
}
