package ru.scypro;

public class Main {

    public static void main(String[] args) {

        // Задача 1

        int i = 1;
        while (i <= 10) {
            System.out.print(i++);
        }
        System.out.print("\n");
        for (int a = 10; a >= 0; a--) {
            System.out.print(a);

        }

        // Задача 2

        System.out.print("\n");
        for (int firstFriday = 1; firstFriday < 31; firstFriday = firstFriday + 7)  {
            System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет.");
        }

        // Задача 3

        for (int year = 0; year < 2100; year = year + 79) {
            if (year > 1817)  {
                System.out.println(year);
            }
        }


        }

    }

