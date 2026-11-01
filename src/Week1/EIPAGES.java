//Source: https://oj.eiu.edu.vn/problem/eipages
package Week1;

import java.util.Arrays;
import java.util.Scanner;

public class EIPAGES {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] pages = new int[N];
        for (int i = 0; i < pages.length; i++) {
            pages[i] = sc.nextInt();
        } 
        Arrays.sort(pages);
        for (int i = 0; i < pages.length; i++) {
            int count = 0;
            int startPage = pages[i];
            for (int j = i + 1; j < pages.length; j++) {
                if (pages[j] - pages[j-1] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            if (count >= 2) { 
                sb.append(startPage).append("-").append(startPage + count);
                i += count;
            } else {
                sb.append(startPage);
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
    
}