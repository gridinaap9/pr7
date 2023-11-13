package com.company;
        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;
        import java.util.Date;
        import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения (ГГГГММДД): ");
        String birthDateStr = scanner.nextLine();
        System.out.println("Введите время (ЧЧММ): ");
        String timeStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        Date birthDate = null;
        try {
            birthDate = dateFormat.parse(birthDateStr + timeStr);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthDate);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Год: " + calendar.get(Calendar.YEAR)); System.out.println("Месяц: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Число: " + calendar.get(Calendar.DAY_OF_MONTH)); System.out.println("Часы: " + calendar.get(Calendar.HOUR_OF_DAY)); System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
    }
}


