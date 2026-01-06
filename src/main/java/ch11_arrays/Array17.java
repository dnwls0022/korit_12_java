package ch11_arrays;

import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int[] lottoNums = new int[6]; //객체선언하고

        int round = 5;
        int temp = 0;
        boolean duplicate;
        int cnt = 1;

        for ( int j = 0 ; j < round ; j++ ) {
            for (int i = 0; i < lottoNums.length; i++) {
                duplicate = false;
                temp = (int) (Math.random() * 45) + 1;

                for (int k = 0; k < i; k++) {
                    if (lottoNums[k] == temp) duplicate = true;
                }
                if (!duplicate) lottoNums[i] = temp;
                else i--;
                cnt++;
            }
            System.out.println(Arrays.toString(lottoNums));
            System.out.println("보너스공 : " + cnt);
        }
    }
}