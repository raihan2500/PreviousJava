package y2021.q2;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while(i * i < n){
            System.out.printf(i * i + " ");
            i++;
        }
    }
}
