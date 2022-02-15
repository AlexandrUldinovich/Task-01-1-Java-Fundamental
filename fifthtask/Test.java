package com.company.epam.fifthtask;

public class Test {

    public static void main(String[] args) {

        TaskInput input = new TaskInput();
        TaskLogic logic = new TaskLogic();
        TaskView view = new TaskView();

        System.out.println("Введите первое");
        int a = input.getInput();
        System.out.println("Введите второе");
        int b = input.getInput();
        System.out.println("Введите третье");
        int c = input.getInput();

        view.getInfo(logic.calcNum(a), logic.calcNum(b), logic.calcNum(c));
    }
}
