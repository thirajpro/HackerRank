package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String[] arr1 = input1.split("");
        String[] arr2 = input2.split("");
        System.out.println(input1.length() + input2.length());
        if(input1.compareTo(input2)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String replacedInput1 = input1.replace(arr1[0],arr1[0].toUpperCase());
        String replaceInput2 = input2.replace(arr2[0],arr2[0].toUpperCase());
        System.out.println(String.join(" ",replacedInput1,replaceInput2));


    }
}
