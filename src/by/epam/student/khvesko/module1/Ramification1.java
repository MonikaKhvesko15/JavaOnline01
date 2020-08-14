package by.epam.student.khvesko.module1;

//1. Даны два угла треугольника (в градусах).
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Ramification1 {
    public static void main(String[] args) {
        int firstAngle;
        int secondAngle;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        firstAngle=cons.enterIntFromConsole("first angle >> ");
        secondAngle=cons.enterIntFromConsole("second angle >> ");
        int thirdAngle=180-firstAngle-secondAngle;
        System.out.println("triangle "+check(thirdAngle));
        if(thirdAngle==90){
            System.out.println("rectangular");
        }
    }

    public static boolean check(int thirdAngle) {
        boolean triangle=false;
        if(thirdAngle>0){
            triangle=true;
        }
        return triangle;
    }

}
