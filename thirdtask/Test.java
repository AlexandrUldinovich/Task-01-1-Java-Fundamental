package com.company.epam.thirdtask;

public class Test {

    public static void main(String[] args) {

        TaskInput input = new TaskInput();
        TaskLogic logic = new TaskLogic();
        TaskView view = new TaskView();

        int a = input.calcInt();
        int b = input.calcInt();

        view.showResult(logic.caclPerimeter(a, b), logic.calcArea(a, b));
    }
}
