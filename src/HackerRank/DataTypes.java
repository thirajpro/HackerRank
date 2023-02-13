package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            long input = scanner.nextLong();
            if (input<(Math.pow(2,8)-1) && input> -Math.pow(2,7)){
                System.out.println(input + " can be fitted in :");
                System.out.println("* byte");
                System.out.println("*Short");
                System.out.println("*int");
                System.out.println("*long");
            } else if (input<(Math.pow(2,16)-1) && input> -Math.pow(2,16)){
                    System.out.println(input + " can be fitted in :");
                    System.out.println("*Short");
                    System.out.println("*int");
                    System.out.println("*long");
            }else if (input<(Math.pow(2,31)-1) && input> -Math.pow(2,31)) {
                System.out.println(input + " can be fitted in :");
                System.out.println("*int");
                System.out.println("*long");
            }else if (input<(Math.pow(2,63)-1) && input> -Math.pow(2,63)) {
                System.out.println(input + " can be fitted in :");
                System.out.println("*long");
            }
            else {
                System.out.println(input + " can't be fitted in anywhere");
            }
        }
    }
}

