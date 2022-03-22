package com.company;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 2_147_483_647;
        int midRange = (min + max) / 2;

        String strInput;
        String equal = "=";
        String more = ">";
        String less = "<";

        System.out.println("Загадайте число от 0 до 2_147_483_647.\n" + "Введите его, чтобы не забыть:");
        strInput = scan.nextLine();

        while (!strInput.equals(equal)) {
            System.out.println("Это число больше, меньше или равно " + midRange + "? " + "Введите '>' или '<' или '=':");
            strInput = scan.nextLine();
            if (strInput.equals(more)) {
                min = midRange;
                midRange = (min + max) / 2;
            }
            if (strInput.equals(less)) {
                max = midRange;
                midRange = (min + max) / 2;
            }
            if (strInput.equals(equal)) {
                System.out.println("Отлично! Ваше число " + midRange);
            }
        }
    }
}





