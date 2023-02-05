package HackerRank;

import java.util.Scanner;

public class TestPrintf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================");
        try {
            for (int i = 0; i < 3; i++) {
                String name = scanner.next();
                int x = scanner.nextInt();
                System.out.printf(name + "%15s%n", x);
//                System.out.println(15-name.length());
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("=============================");

    }
}
