package by.epam.student.khvesko.module1;

//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦 𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦 ∗ 𝑡𝑔 𝑥𝑦

public class LineProgram3 {
    public static void main(String[] args) {
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        int x;
        int y;
        x=cons.enterIntFromConsole("x >> ");
        y=cons.enterIntFromConsole("y >> ");
        System.out.print(calcul(x,y));
    }
    public static double calcul(double x,double y) {
        double result;
        result=((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        return result;
    }
}
