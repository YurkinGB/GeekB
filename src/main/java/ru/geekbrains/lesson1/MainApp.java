package ru.geekbrains.lesson1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        byte bt = 5;
        short sht = -2001;
        int it = 355;
        long lg = 5_000_000;
        float flt = 5.2f;
        double dbl = 200.5;
        char chr = 'A';
        boolean bln = true;

        System.out.println("Домашнее задание п.3: ответ = " + calc(1.2f, 3.74f, 5.21f, 3.0f));

        System.out.println("Домашнее задание п.4: ответ = " + compare(3, 4));

        compare1(0);

        System.out.println("Домашнее задание п.6: ответ = " + compare2(7));

        greeting("Андрей");

        System.out.println("\nДомашнее задание п.8:");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год в формате yyyy чтобы узнать является ли он високосным");
        int s = scan.nextInt();

        leapYear(s);
    }

    //    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//    где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float calc(float a, float b, float c, float d) {
        return (float) a * (b + (c / d));
    }

    //    Написать метод, принимающий на вход два целых числа и проверяющий,
//    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean compare(int vol1, int vol2) {
        if ((vol1 + vol2) > 10 && (vol1 + vol2) < 20) {
            return true;
        } else {
            return false;
        }
    }

    //    Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void compare1(int vol) {
        if (vol >= 0) {
            System.out.println("Домашнее задание п.5: ответ = положительное");
        } else {
            System.out.println("Домашнее задание п.5: ответ = отрицательное");
        }
    }

    //    Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean compare2(int vol3) {
        if (vol3 >= 0) {
            return false;
        } else return true;
    }

    //    Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void greeting(String name) {
        System.out.println("Домашнее задание п.7: ответ \"Привет, " + name + "!\"");
    }

//    Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void leapYear(int year) {
        if ((year % 100) == 0) {
            if ((year % 400) == 0) {
                System.out.println(year + " год високосный");
            } else {
                System.out.println(year + " год не високосный");
            }
        } else if ((year % 4) == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }

    }

}

