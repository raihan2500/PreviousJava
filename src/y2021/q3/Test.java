package y2021.q3;

import java.io.PrintStream;
import java.util.Scanner;

public class Test {
    public static void falseSwap(int a, int b){
        int temp = a;
        a = b;
        b = a;
    }

    public static void main(String[] args) {
        int a = 5, b = 3;
        falseSwap(a, b);
        System.out.println(a + "   " + b);


    }
}
