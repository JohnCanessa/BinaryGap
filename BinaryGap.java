import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Copyright 2009–2021 by Codility Limited. 
 * All Rights Reserved. 
 * Unauthorized copying, publication or disclosure prohibited.
 */
public class BinaryGap {


    /**
     * 
     */
    static int binaryGap(int N) {


        // ???? ????
        int[] arr = new int[3];
        System.out.println("<<< arr: " + Arrays.toString(arr));
        Arrays.sort(arr);


        // **** initialization ****
        int maxGap  = 0;
        int gap     = 0;
        int n       = N;

        // ????? ????
        System.out.println("<<< N: " + Integer.toBinaryString(N));

        // **** ****
        while (n > 0) {

            // **** look for starting 1 ****
            while (n > 0 && n % 2 == 0) {

                // ???? ????
                System.out.println("<<< n % 2: " + n % 2 + " n: " + n);

                // **** ****
                n /= 2;
            }

            // ???? ????
            System.out.println("<<< n: " + n + " gap: " + gap);

            // **** skip current 1 ****
            n /= 2;

            // ???? ????
            System.out.println("<<< n: " + n + " gap: " + gap);

            // **** look for ending 1 (count gap) ****
            while (n > 0 && n % 2 == 0) {

                // ???? ????
                System.out.println("<<< n % 2: " + n % 2 + " n: " + n);

                // **** ****
                gap++;

                // **** ****
                n /= 2;
            }

            // ???? ????
            System.out.println("<<< n: " + n + " gap: " + gap);

            // **** update max gap ****
            maxGap = Math.max(gap, maxGap);

            // **** reset gap ****
            gap = 0;
        }

        // **** ****
        return maxGap;
    }


    /**
     * Test scaffold
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read n ****
        int n = Integer.parseInt(br.readLine().trim());

        // **** close buffered reader ****
        br.close();

        // ???? ????
        System.out.println("main <<< n: " + n);

        // **** call function of interest ****
        System.out.println("main <<< output: " + binaryGap(n));
    }
}