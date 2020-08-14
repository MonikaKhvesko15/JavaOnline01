package by.epam.student.khvesko.module1;

//5. Вычислить значение функции: (формула)

public class Ramification5 {
    public static void main(String[] args) {
        int x;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        x=cons.enterIntFromConsole("x >> ");
        if(x<=3){
            System.out.println(function1(x));
        }else{
            System.out.println(function2(x));
        }

    }

    public static double function1(double x){
        double result;
        result=Math.pow(x,2)-3*x +9;
        return result;
    }

    public static double function2(double x){
        double result;
        result=1/(Math.pow(x,3)+6);
        return result;
    }


}
