package ru.oop;

import java.util.List;

/**
 * <b>Задача 2:</b><br>
 * Добраться человеку до заданного места.<br>
 * Притом он может поехать не только на машине, а на автобусе,
 * метро, велосипеде или любом другом виде транспорта.<br>
 * Стоит учесть, что может понадобится до транспорта дойти пешком.<br>
 * И не всегда можно подъехать прямо к нужному месту, может понадобиться дойти пешком.<br>
 * Человек знает своё текущее местоположение (у него есть метод {@link Person#getPosition()}<br>
 * Подсказка: появился интерфейс {@link Positioned}, его можно использовать для чего-то ещё<br>
 * <ul>
 *   <li>Код не должен превышать 7 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 * <br>
 * <b>Задача 3:</b><br>
 * То же самое, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code Arrays.asList(new Car(person), new Bus("43", person),
 *        new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class Main {

    /**
     *Добраться до заданной точки на любом виде транспорта
     */

    public static void moveTo2(Person person, Position destination, Transport transport) {
        if(person.getPosition() != transport.getPosition())
            person.walk(transport.getPosition());
        transport.moveTo(person);
        if(person.getPosition() != destination)
            person.walk(destination);
    }

    /**
     * Мы получаем список транспорта на котором нам<br>
     * необходимо доехать до конечной точки.<br>
     * Проверяем нужно ли нам идти пешком до 1 в списке транспорта,<br>
     * Если нужно, то идем<br>
     * Дальше мы едем на транспорте пока это возможно<br>
     * Потом проверяем, доехали ли мы до нужной нам точки,<br>
     * Если нет, то идем до конца пешком.<br>
     *
     */
    public static void moveTo3(Person person, Position destination) {
        Transfers transfers = new Transfers();
        List<Transport> path = transfers.getPathList(person, destination);
        if(path.get(0).getPosition() != person.getPosition())
            person.walk(path.get(0).getPosition());
        for(Transport transport: path){
            transport.moveTo(person);
        }
        if(person.getPosition() != destination)
            person.walk(destination);
        assert person.getPosition() == destination;
    }
}
