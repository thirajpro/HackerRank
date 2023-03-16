package HackerRank;

import java.util.Scanner;

public class StaticInitializer {
    static int B;
    static int H;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if (B <=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else if (H <=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            int area = B*H;
            System.out.println(area);
        }

    }
}
