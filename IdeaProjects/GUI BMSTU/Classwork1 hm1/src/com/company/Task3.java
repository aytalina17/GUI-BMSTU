package com.company;
import java.util.Scanner;

public class Task3 {
    public static double functionF(double x, double index){
        return (Math.pow(x, index + 1))/(index + 1);
    };
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начало отрезка");
        int a = scan.nextInt();
        System.out.println("Введите конец отрезка");
        int b = scan.nextInt();
        double F_a = functionF(a, 4) + functionF(a, 2) + functionF(a, 1) -7*a;
        double F_b = functionF(b, 4) + functionF(b, 2) + functionF(b, 1) - 7*b;
        System.out.println(F_b - F_a);
    }
}
