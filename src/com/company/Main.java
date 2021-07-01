package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //ДЗ №3
        //Домашнее задание
        //
        //Создать массив, заполнив его именами людей, элементов массива должно быть 3
        //Создать switch на каждый элемент массива (Но всего в программе должен быть только 1 свитч)
        //Первому человеку программа должна желать доброго утра, второму доброго дня, а третьему доброго вечера.
        //Программа должна поприветствовать всех



        String[] names = new String[3];

        names[0] = "Mike";
        names[1] = "Gorge";
        names[2] = "Jack";


        System.out.println("Good morning");

        Scanner scan = new Scanner(System.in);
        int hello = scan.nextInt();

        switch(hello) {

            case 1: {
                System.out.println("Good morning" + names[0]);

                break;
            }
            case 2: {
                System.out.println("Good day" + names[1]);
                break;
            }
            case 3: {
                System.out.println("Good evening" + names[2]);
                break;
            }
            case 4: {
                System.out.println("write your name:");
                Scanner scan1 = new Scanner(System.in);
                String name1 = scan1.nextLine();
                System.out.println("Good morning,"+name1);

            }
            default:{
                System.out.println("incorrect");
            }
        }
    }
}
