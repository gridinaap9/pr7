package com.company;
import java.util.Date;
public class Zadanie1 {
    public static void main(String[] args) {
        String lastName = "Гридина";
        Date startDate = new Date();
        Date endDate = new Date(System.currentTimeMillis());
        System.out.println("Фамилия разработчика: " + lastName);
        System.out.println("Дата и время получения задания: " + startDate);
        System.out.println("Дата и время сдачи задания: " + endDate);
    }
}

