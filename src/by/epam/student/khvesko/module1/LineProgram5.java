package by.epam.student.khvesko.module1;

//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

public class LineProgram5 {
    public static void main(String[] args) {
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        int T=cons.enterIntFromConsole("T >> ");
        int hours=T/60;
        int minutes=(T-hours*60)/60;
        int seconds=T-hours*60-minutes*60;
        System.out.println("Time: "+hours+"ч "+minutes+"мин "+seconds+"с");

    }
}
