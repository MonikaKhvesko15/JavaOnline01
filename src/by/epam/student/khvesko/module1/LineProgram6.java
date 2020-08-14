package by.epam.student.khvesko.module1;

//6. Для данной области составить линейную программу, которая печатает true,
// если точка с координатами (х, у) принадлежит закрашенной области,
// и false — в противном случае:  (рис.)

public class LineProgram6 {
    public static void main(String[] args) {
        boolean flag=false;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        int x=cons.enterIntFromConsole("x >> ");
        int y=cons.enterIntFromConsole("y >> ");
        if(x>-4&&x<4){
            if(y>-3&&y<0){
                flag=true;
            }
        }
        if (x>-2&&x<2){
            if(y>0&&y<4){
                flag=true;
            }
        }
        System.out.println(flag);
    }
}
