package by.epam.student.khvesko.module1;

//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.

public class Ramification4 {
    public static void main(String[] args) {
        int a;
        int b;
        int x;
        int y;
        int z;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        a= cons.enterIntFromConsole("a >> ");
        b= cons.enterIntFromConsole("b >> ");
        x=cons.enterIntFromConsole("x >> ");
        y=cons.enterIntFromConsole("y >> ");
        z=cons.enterIntFromConsole("z >> ");
if(check(a,b,x,y,z)){
    System.out.print("Кирпич пройдет в отверстие");
}else{
    System.out.print("Кирпич не пройдет в отверстие");
}
    }

    public static boolean check(int a,int b, int x,int y,int z) {
        boolean flag=false;
        if(a>x&&b>y){flag=true;}
        if(a>y&&b>x){flag=true;}
        if(a>z&&b>y){flag=true;}
        if(a>y&&b>z){flag=true;}
        if(a>x&&b>z){flag=true;}
        if(a>z&&b>x){flag=true;}
        return flag;
    }
}
