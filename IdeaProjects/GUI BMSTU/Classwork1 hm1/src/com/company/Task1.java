package com.company;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        if (inputNum == 0) {
            System.out.println("Такого числа нет");
        } else if (inputNum == 1) {
            System.out.println("Такого число есть");
        } else {
            int firstNum = 1;
            int secondNum = 1;
            int sumNum = 0;
            while (sumNum < inputNum) {
                sumNum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = sumNum;
            }
            if (sumNum == inputNum) {
                System.out.println("Такое число есть");
            } else {
                System.out.println("Такого числа нет");
            }
        }
    }
}
