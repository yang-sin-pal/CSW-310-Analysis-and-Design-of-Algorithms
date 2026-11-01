//Source: https://oj.eiu.edu.vn/problem/ei2122q1adam1
package Week1;

import java.util.HashMap;
import java.util.Scanner;

public class EI2122Q1ADAM1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int ans = 0;
        for (int cur : array) {
            frequency.put(cur, frequency.getOrDefault(cur, 0) + 1);
            int A = cur - X;
            if (frequency.get(A) == null) {
                ans += 0;
            } else {
                ans += frequency.get(A);
            }
        }
        System.out.println(ans);
    }
}
