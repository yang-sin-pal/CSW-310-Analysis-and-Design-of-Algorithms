//Source: https://oj.eiu.edu.vn/problem/eiugifts
package Week1;

import java.util.Arrays;
import java.util.Scanner;

public class EIGIFTS {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] items = new int[n];
        for (int i = 0; i < items.length; i++) {
            items[i] = sc.nextInt();
        }
        Arrays.sort(items);
        int largest_price = Integer.MIN_VALUE;
        int smallest_diff = Integer.MAX_VALUE;
        int i = 0;
        int j = items.length - 1;
        while (i < j) {
            int price_temp = items[i] + items[j];
            if (price_temp > k) {
                j--;
            } else {
                int diff_temp = items[j] - items[i];
                if (price_temp > largest_price) {
                    largest_price = price_temp;
                    smallest_diff = diff_temp;
                } else if (price_temp == largest_price
                        && diff_temp < smallest_diff) {
                    smallest_diff = diff_temp;
                }

                i++;
            }
        }
        if (largest_price == Integer.MIN_VALUE) {
            System.out.println("-1 -1");
        } else {
            System.out.println(largest_price + " " + Math.abs(smallest_diff));
        }
    }
}