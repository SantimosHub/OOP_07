package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Vacancy {
    final String[] vacancyList = {"Intern", "Junior", "Middle", "Senior", "TeamLead"};
    Random random = new Random();
    int index = random.nextInt(vacancyList.length);
    public String vacancyName = vacancyList[index];

}
