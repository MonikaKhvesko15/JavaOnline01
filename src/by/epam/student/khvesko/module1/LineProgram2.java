package by.epam.student.khvesko.module1;

//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏 + √𝑏2 + 4𝑎𝑐 2𝑎 − 𝑎3𝑐 + 𝑏−2

public class LineProgram2 {
    public static void main(String[] args) {
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        int a;
        int b;
        int c;
        a=cons.enterIntFromConsole("a >> ");
        b=cons.enterIntFromConsole("b >> ");
        c=cons.enterIntFromConsole("c >> ");

        System.out.print(calcul(a,b,c));
    }

    public static double calcul(double a,double b,double c) {
double result;
result=((b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a-Math.pow(a,3)*c+Math.pow(b,-2));
return result;
    }
}
