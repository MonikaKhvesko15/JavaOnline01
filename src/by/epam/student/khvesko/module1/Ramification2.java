package by.epam.student.khvesko.module1;

//2. Найти max{min(a, b), min(c, d)}.

public class Ramification2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        a=cons.enterIntFromConsole("a >> ");
        b=cons.enterIntFromConsole("b >> ");
        c=cons.enterIntFromConsole("c >> ");
        d=cons.enterIntFromConsole("d >> ");
        System.out.print(max(min(a,b),min(c,d)));
    }

    public static int min(int x,int y) {
        int min;
        if(x>y){
            min=y;
        }else{
            min=x;
        }
        return min;
    }

    public static int max(int x,int y) {
        int max;
        if(x>y){
            max=x;
        }else{
            max=y;
        }
        return max;
    }
}
