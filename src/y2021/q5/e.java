package y2021.q5;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        try{
            File file = new File("input.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "r");

            raf.seek(6);
            System.out.println(raf.readLine());

            raf.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
