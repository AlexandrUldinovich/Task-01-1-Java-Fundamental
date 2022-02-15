package com.company.epam.thirdtask;

import java.util.Scanner;

public class TaskInput {

        public int calcInt() {

            int catheters;

            @SuppressWarnings("resource")
            Scanner sc =new Scanner(System.in);
            System.out.println("Введите катет");
            catheters = sc.nextInt();
            if(catheters == 0){
                throw new RuntimeException("Введите позитивные катеты");
            }

            return catheters;

        }
    }

