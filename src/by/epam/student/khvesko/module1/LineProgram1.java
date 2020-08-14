package by.epam.student.khvesko.module1;

//1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.Scanner;

public class LineProgram1 {
    public static void main(String[] args) {
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        int a;
        int b;
        int c;
        a=cons.enterIntFromConsole("a >> ");
        b=cons.enterIntFromConsole("b >> ");
        c=cons.enterIntFromConsole("c >> ");
        System.out.print("z = "+calcul(a,b,c));
    }
    public static double calcul(double a,double b,double c){
        double result;
        result=((a-3)*b/2)+c;
        return result;
    }

}
