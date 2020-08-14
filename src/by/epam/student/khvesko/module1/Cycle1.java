package by.epam.student.khvesko.module1;

//1. Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Cycle1 {
    public static void main(String[] args) {
        long number;
        Scanner console=new Scanner(System.in);
        System.out.print("Введите число >> ");

        while (!console.hasNextLong()){
            console.next();
            System.out.print("Введите число >> ");
        }
        long check;
        check= console.nextLong();
        while(check<=0){
            System.out.print("Введите число >> ");
            check= console.nextLong();
        }
        number= check;
        int sum=0;
        for (int i = 1; i < number; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
