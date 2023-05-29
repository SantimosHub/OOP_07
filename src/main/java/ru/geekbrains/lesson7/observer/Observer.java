package ru.geekbrains.lesson7.observer;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {

    void receiveOffer(String vacancyName, String nameCompany, double salary);

}
