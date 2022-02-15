package com.company.epam.fifthtask;

import java.util.Scanner;

public class TaskInput {

    public int getInput(){

        @SuppressWarnings("resource")
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        return num;
    }

}
