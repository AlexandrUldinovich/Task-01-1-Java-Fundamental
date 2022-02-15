package com.company.epam.sixthtask;

public class Test {
    public static void main(String[] args) {

        TaskInput input = new TaskInput();
        TaskLogic logic = new TaskLogic();
        TaskView view = new TaskView();

        int a = input.getNumber();
        int b = input.getNumber();
        int c = input.getNumber();

        int min =logic.calcMin(a, b, c);
        int max = logic.calcMax(a, b, c);
        int sum = logic.calcSumofMinAndMax(min, max);

        view.showInfo(sum);

    }
}
