package HackerRank;

import java.util.Scanner;

public class TestPrintf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String name = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-14s %03d %n",name,x);
        }
        System.out.println("================================");
    }
}
