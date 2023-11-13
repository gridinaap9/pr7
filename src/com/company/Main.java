package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Тест операций вставки
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Время вставки в ArrayList: " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Время вставки в LinkedList: " + (endTime - startTime) + " наносекунд");

        // Тест операций удаления
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("Время удаления в ArrayList: " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("Время удаления в LinkedList: " + (endTime - startTime) + " наносекунд");

        // Тест операций поиска по образцу
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Время поиска по образцу в ArrayList: " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Время поиска по образцу в LinkedList: " + (endTime - startTime) + " наносекунд");
    }
}