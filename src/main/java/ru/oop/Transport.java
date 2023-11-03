package ru.oop;

/**
 * Любой транспорт
 */


public interface Transport extends Positioned{

    /**
     * Перемещает person, до точки, которая ближе всего к месту назначения.
     * @param person
     */

    void moveTo(Person person);

    /**
     * возвращает местоположение транспорта.
     * @return
     */
    Position getPosition();

}
