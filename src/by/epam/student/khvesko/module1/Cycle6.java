package by.epam.student.khvesko.module1;

//6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Cycle6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Код символа " + (char)i +" : "+ i);
        }
    }
}
