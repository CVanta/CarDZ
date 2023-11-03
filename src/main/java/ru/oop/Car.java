package ru.oop;

/**
 * Машина
 */

public class Car implements Transport{

    Person person;

    public Car(Person person) {
        this.person = person;
    }

    /**
     * возвращает местоположение машины.
     * @return
     */
    @Override
    public Position getPosition() {
        return null;
    }

    /**
     * Изменяет свою позицию и позицию person.
     * @return
     */
    @Override
    public void moveTo(Person person) {

    }
}
