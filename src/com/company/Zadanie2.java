package com.company;
import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату и время (в формате dd.MM.yyyyHH:mm): ");
        String userInput = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyyHH:mm");
        Date userDate = null;
        try{ userDate = dateFormat.parse(userInput);
        }
        catch (Exception e) {
            System.out.println("Некорректный формат даты или времени.");
            return;
        }
        Date currentDate = new Date();
        if (currentDate.compareTo(userDate) < 0) {
            System.out.println("Текущая дата и время меньше введенной.");
        }
        else if (currentDate.compareTo(userDate) > 0) {
            System.out.println("Текущая дата и время больше введенной.");
        }
else{ System.out.println("Текущая дата и время равны введенной.");
        }
    }
}

