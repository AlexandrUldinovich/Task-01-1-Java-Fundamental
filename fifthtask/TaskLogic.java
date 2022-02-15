package com.company.epam.fifthtask;

public class TaskLogic {

    public int calcNum(int num) {

        if (num >= 0) {
            num = (int) Math.pow(num, 2);
        } else {
            num = (int) Math.pow(num, 4);
        }

        return num;

    }
}
