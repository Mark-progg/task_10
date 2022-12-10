package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дату в формате dd.MM.yyyy:");

        String inputDate = sc.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = format.parse(inputDate);
        String inputYear = new SimpleDateFormat("yyyy").format(date);
        GregorianCalendar cal = new GregorianCalendar();

        if (cal.isLeapYear(Integer.parseInt(inputYear)))
            System.out.println("Високосный год");
        else
            System.out.println("Не високный год");
    }
}
