package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = 4;
        double[] input = new double[4];

        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(input));

    }
}

