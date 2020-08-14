package by.epam.student.khvesko.module1;

//7. Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Cycle7 {
    public static void main(String[] args) {
        int m;
        int n;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        m= cons.enterIntFromConsole("m >> ");
        n= cons.enterIntFromConsole("n >> ");
        while(m<=n){
            int a=2;
            System.out.printf(m+" : ");
            while(a<=m/2){
                if(m%a==0) {
                    System.out.printf(a+" ");
                }
                a++;
            }
            System.out.printf("\n");
            m++;
        }
    }
}
