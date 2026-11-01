//Source: https://oj.eiu.edu.vn/problem/eipainting
package Week1;

import java.util.HashMap;
import java.util.Scanner;

public class EIPAINTING {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int largestFrequency = 0;
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            int temp = frequency.getOrDefault(cur, 0);
            frequency.put(cur, ++temp);
            largestFrequency = Math.max(largestFrequency, temp);
        }
        int numberOfPairs = n - largestFrequency;
        System.out.println(numberOfPairs);
    }
}
