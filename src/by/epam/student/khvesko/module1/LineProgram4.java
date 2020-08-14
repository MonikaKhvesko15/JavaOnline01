package by.epam.student.khvesko.module1;

//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class LineProgram4 {
    public static void main(String[] args) {
        double numb;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        numb=cons.enterDoubleFromConsole("Number (nnn.ddd) >> ");
        int beforeDotNumb=(int)numb;
        double afterDotNumb;
        afterDotNumb=numb-beforeDotNumb;
        System.out.print(convert(beforeDotNumb,afterDotNumb));
    }

    public static double convert(double beforeDotNumb,double afterDotNumb) {
double result;
result=afterDotNumb*1000 + beforeDotNumb/1000;
        return result;
    }
}
