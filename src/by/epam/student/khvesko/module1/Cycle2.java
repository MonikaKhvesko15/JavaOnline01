package by.epam.student.khvesko.module1;

//2. Вычислить значения функции на отрезке [а,b] c шагом h: (формула)

public class Cycle2 {
    public static void main(String[] args) {
        int a;
        int b;
        int h;
        int x;
        int y;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        a=cons.enterIntFromConsole("a >> ");
        b= cons.enterIntFromConsole("b >> ");
        h= cons.enterIntFromConsole("h >> ");

        x=a;
        while(x<=b){
            if(x>2){
                y=x;
                System.out.print(y+" ");
            }else{
                y=-x;
                System.out.print(y+" ");
            }
            x+=h;
        }
    }
    }

