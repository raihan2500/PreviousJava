package y2021.q1;

import java.awt.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 3, 3, 4);
        System.out.println(rectangle.getWidth());

//        Scanner in = new Scanner(System.in);
//        System.out.println("Unit price: ");
////        double unitPrice = in.nextDouble();
////        int quantity = in.nextInt();
//        System.out.println(unitPrice + "    " + quantity);

        int a = 5, b = 10;
        System.out.println("Sum = " + (a + b) );
        String str1 = "Raihan";
        str1 = str1.substring(1, str1.length());
        System.out.println(str1);
    }
}
