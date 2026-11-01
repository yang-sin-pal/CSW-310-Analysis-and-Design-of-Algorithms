//Source: https://oj.eiu.edu.vn/problem/eiugift1
package Week1;

import java.util.Arrays;
import java.util.Scanner;

public class EIUGIFT1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] gift = new int[n];
        int[] wrapPaper = new int[m];
        for (int i = 0; i < gift.length; i++) {
            gift[i] = sc.nextInt();
        }
        for (int i = 0; i < wrapPaper.length; i++) {
            wrapPaper[i] = sc.nextInt();  
        }

        Arrays.sort(gift);
        Arrays.sort(wrapPaper);
        int i = 0;
        int j = 0;
        int giftWrapped = 0;
        while (i < gift.length && j < wrapPaper.length) {
            if (wrapPaper[j] > gift[i] * 3) {
                i++;
            } else if (wrapPaper[j] < gift[i] * 2) {
                j++;
            } else {
                giftWrapped++;
                i++;
                j++;
            }
        }
        System.out.println(giftWrapped);

    }
}
