package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your input: ");
        String input = scanner.nextLine();
//        String name = "Pramodya";
        String[] splitter = input.split("");
        System.out.println(Arrays.toString(splitter));

        for (int i=0;i<splitter.length;i++){
            System.out.print(splitter[i]);
        try{    Thread.sleep(500);

        }catch (Exception e){
            System.out.println("An exception occured");
        }
            
            }
        System.out.println();
        if (splitter[0].equals("T")) {
            System.out.println("First letter is T");
        }else {
            System.out.println("First letter is not T");
            }
        }
    }

