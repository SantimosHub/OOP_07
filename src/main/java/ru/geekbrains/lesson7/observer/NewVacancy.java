package ru.geekbrains.lesson7.observer;

public interface NewVacancy {
    public default String newVacancy(){
        Vacancy vacancy = new Vacancy();
        return vacancy.vacancyName;
    }
}
