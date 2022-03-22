package com.company;

public class Task2 {
    public static double someFunction(double x) {
        return Math.pow(x, 3.0) - Math.pow(x, 2.5) + x - 1.0;
    }

    public static void main(String[] args) {
        boolean isFound = false;
        double maxRange = Double.MAX_VALUE;
        double x = 0;
        for (double i = 0; i < 2; i +=0.001) {
            x = i;
            System.out.println(x);
            if (someFunction(x) == 0) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println(x);
        } else {
            System.out.println("Корней нет");
        }
    }
}