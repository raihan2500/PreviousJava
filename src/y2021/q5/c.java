package y2021.q5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("input.txt"));
            int value = in.nextInt();
            System.out.println(value);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
