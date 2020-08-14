package by.epam.student.khvesko.module1;

//3. Найти сумму квадратов первых ста чисел.

public class Cycle3 {
    public static void main(String[] args) {
        int a=1;
        int b=100;
        long sum=0;
        while(a<=b){
            sum+=Math.pow(a,2);
            a++;
        }
        System.out.print(sum);
    }
}
