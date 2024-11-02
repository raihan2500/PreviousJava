package y2022.q7.q2;

import java.util.Random;

public class b {
    static void makeCombination(int[] values, int n){
        Random rn = new Random();
        for(int i = 0; i < n; i++){
            values[i] = rn.nextInt(0, 10);
        }

    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = i;
        }
        makeCombination(arr, 5);
        for(int i = 0; i < 5; i++){
            System.out.printf(arr[i] + " ");
        }
    }
}
