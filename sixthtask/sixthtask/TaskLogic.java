package com.company.epam.sixthtask;

public class TaskLogic {

    public int calcMax (int a, int b, int c){
        int max = Math.max(a, b);

        if(max < c){
            max = c;
        }
        return max;

    }

    public int calcMin (int a, int b, int c){
        int min = Math.min(a, b);

        if(c < min){
            min = c;
        }
        return min;

    }

    public int calcSumofMinAndMax (int min, int max){

        return min + max;

    }
}
