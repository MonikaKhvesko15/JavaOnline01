package by.epam.student.khvesko.module1;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Ramification3 {
    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        int y1;
        int y2;
        int y3;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        x1=cons.enterIntFromConsole("x1 >> ");
        x2=cons.enterIntFromConsole("x2 >> ");
        x3=cons.enterIntFromConsole("x3 >> ");
        y1=cons.enterIntFromConsole("y1 >> ");
        y2=cons.enterIntFromConsole("y2 >> ");
        y3=cons.enterIntFromConsole("y3 >> ");
        if(check(x1,x2,x3,y1,y2,y3)){
            System.out.print("Точки расположены на одной прямой");
        }else {
            System.out.print("Точки не расположены на одной прямой");
        }
    }
    public static boolean check(int x1,int x2, int x3, int y1, int y2,int y3) {
        boolean flag=false;
        if((y1==y2)&&(y2==y3)||(x1==x2)&&(x2==x3)||(y1/x1==y2/x2)&&(y2/x2==y3/x3)){
            flag=true;
        }
        return flag;
    }
}
