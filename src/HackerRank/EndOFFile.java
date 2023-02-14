package HackerRank;

import java.util.Scanner;

public class EndOFFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int count = 0;
        while(!input.equals("end of the file")){
             input = scanner.nextLine().toLowerCase();
             count++;
            System.out.println(count +" " + input);
        }
    }
}
