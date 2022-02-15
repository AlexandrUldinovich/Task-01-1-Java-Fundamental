package com.company.epam.thirdtask;

public class TaskLogic {

    public int caclPerimeter(int a, int b){

        int c;
        c = (int)Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

            return a + b + c;
    }

    public int calcArea (int a, int b){

        int area;
        area = (a * b)/2;

            return area;

    }
}
