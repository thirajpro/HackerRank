package HackerRank;

import java.util.Scanner;

public class EndOFFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int count = 0;
        while(scanner.hasNext()){
             input = scanner.nextLine();
             count++;
            System.out.println(count +" " + input);
            if (input.equals("Read me until end-of-file")){
                break;
            } else {
                continue;
            }
        }
    }
}
