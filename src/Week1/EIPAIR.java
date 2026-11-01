//Source: https://oj.eiu.edu.vn/problem/eipair
package Week1;

import java.util.HashMap;
import java.util.Scanner;

public class EIPAIR {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        byte T = sc.nextByte();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            HashMap<Long, Long> items_frequency = new HashMap<>();
            for (int j = 0; j < n; j++) {
                long input = sc.nextLong();
                items_frequency.put(input, items_frequency.getOrDefault(input, 0l) + 1);
            }
            long totalWays = 0;
            for (long frequency : items_frequency.values()) {
                totalWays += (frequency*(frequency - 1))/2;
            }
            System.out.println(totalWays);
        }
    }
}
