package com.company.epam.sixthtask;

import java.util.Scanner;

public class TaskInput {

    public int getNumber(){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");

        return sc.nextInt();

    }
}
