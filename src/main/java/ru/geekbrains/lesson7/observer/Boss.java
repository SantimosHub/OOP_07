package ru.geekbrains.lesson7.observer;

public class Boss implements Observer {
    private final String name;
    private double salary;

    public Boss(String name) {
        this.name = name;
        salary = 150000;
    }

    @Override
    public void receiveOffer(String vacancyName, String companyName, double salary) {
        if (this.salary < salary) {
            System.out.printf("Босс %s >>> Мне нужна эта работа %s! [%s - %f]\n", name, vacancyName, companyName, salary);
            this.salary = salary;
        } else {
            System.out.printf("Босс %s >>> Я найду работу получше %s! [%s - %f]\n", name, vacancyName, companyName, salary);
        }
    }
}
