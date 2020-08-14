package by.epam.student.khvesko.module1;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.(для трехзначного)

public class Cycle8 {
    public static void main(String[] args) {
        int numb1;
        int numb2;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        numb1=cons.enterIntFromConsole("numb1 >> ");
        numb2=cons.enterIntFromConsole("numb2 >> ");
        int a;
        int b;
        int c;
        while(numb1!=0){
            a=numb1%10;
            b=numb2;
            while(b!=0){
                c=b%10;
                if(a==c){
                    System.out.println(a);
                }
                b/=10;
            }
            numb1/=10;
        }
    }
}
