package ru.oop;

/**
 * Автобус
 */

public class Bus implements Transport {

    String busNumber;
    Person person;

    public Bus(String busNumber, Person person) {
        this.busNumber = busNumber;
        this.person = person;
    }

    /**
     * возвращает местоположение автобуса
     * @return
     */
    @Override
    public Position getPosition() {
        return null;
    }

    /**
     * Изменяет свою позицию и позицию person
     * @return
     */
    @Override
    public void moveTo(Person person) {

    }
}
