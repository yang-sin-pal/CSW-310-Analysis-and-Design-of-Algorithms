//Source: https://oj.eiu.edu.vn/problem/eiqueens
package Week1;

import java.util.Scanner;

public class EIQUEENS {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean[] rows = new boolean[8];
        boolean[] cols = new boolean[8];
        boolean[] diagonal1 = new boolean[15];
        boolean[] diagonal2 = new boolean[15];
        boolean valid = true;
        int queens = 0;
        for (int i = 0; i < rows.length; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < cols.length; j++) {
                if (s.charAt(j) == '*') {
                    if (rows[i] == true 
                        || cols[j] == true 
                        || diagonal1[i + j] == true
                        || diagonal2[i - j + 7] == true
                    ) {
                        valid = false;
                        break;
                    }
                    rows[i] = true;
                    cols[j] = true;
                    diagonal1[i + j] = true;
                    diagonal2[i - j + 7] = true;
                    queens++;
                }
            }
            if (!valid) {
                break;
            }
        }
        if (valid && queens == 8) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

    }
}
