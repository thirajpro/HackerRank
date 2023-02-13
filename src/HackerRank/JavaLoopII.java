package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;


public class JavaLoopII {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int j = 1; j <= q; j++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int output = a;
            for (int i = 1; i <= n; i++) {
                int c = (int) Math.pow(2, i - 1);
                output = output + (c * b);
                System.out.print(output + " ");
            }
            System.out.println();
        }
    }
}
