package by.epam.student.khvesko.module1;

//5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
// модуль которых больше или равен заданному е. Общий член ряда имеет вид: (формула)

public class Cycle5 {
    public static void main(String[] args) {
        int n;
        double e;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        n=cons.enterIntFromConsole("n >> ");
        e=cons.enterDoubleFromConsole("e >> ");
        double sum=0;
        int i=1;
        double a;
        while(i<=n){
            a=1/Math.pow(2,n)+1/Math.pow(3,n);
            if(Math.abs(a)>=e){
                sum+=a;
            }
            i++;
        }
        System.out.println(sum);
    }
}
