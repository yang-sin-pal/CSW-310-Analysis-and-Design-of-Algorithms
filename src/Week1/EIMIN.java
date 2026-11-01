//Source: https://oj.eiu.edu.vn/problem/eimin
package Week1;

import java.util.Arrays;
import java.util.Scanner;

public class EIMIN {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < array.length; i++){ 
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int count = 0;
        int curSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (curSmallest != array[i] && count < k) {
                int nextSmallest = array[i] - curSmallest;
                curSmallest = array[i];
                 count++;
                sb.append(nextSmallest).append("\n");
            }
        }
        for (int i = count; i < k; i++) {
            sb.append(0).append("\n");
        }
        System.out.println(sb);
    }
}