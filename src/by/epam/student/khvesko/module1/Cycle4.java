package by.epam.student.khvesko.module1;

//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Cycle4 {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");
        BigInteger step = new BigInteger("1");
        BigInteger num = new BigInteger("0");
        BigInteger squareNum;

        for (int i = 0; i < 200; i++) {
            num = num.add(step);
            squareNum = num.multiply(num);
            result = result.multiply(squareNum);
        }
        System.out.print("result = " + result);
    }
}
