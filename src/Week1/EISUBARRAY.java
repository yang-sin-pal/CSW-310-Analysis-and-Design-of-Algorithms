//Source: https://oj.eiu.edu.vn/problem/eisubarray
package Week1;

import java.util.Scanner;

public class EISUBARRAY {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        int firstValue = array[0];
        int largestSum = firstValue;
        int smallestSum = firstValue;
        int largestSumTemp = firstValue;
        int smallestSumTemp = firstValue;

        for (int i = 1; i < array.length; i++) {
            int curNum = array[i];

            largestSumTemp = Math.max(largestSumTemp + curNum, curNum);
            smallestSumTemp = Math.min(smallestSumTemp + curNum, curNum);

            largestSum = Math.max(largestSum, largestSumTemp);
            smallestSum = Math.min(smallestSum, smallestSumTemp);
        }

        System.out.println(Math.max(largestSum, Math.abs(smallestSum)));
    }
}
