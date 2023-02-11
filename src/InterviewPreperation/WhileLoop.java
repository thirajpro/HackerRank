package InterviewPreperation;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Input");
        input = scanner.nextLine();
        while(!input.equals("quit")){
            System.out.println("Input");
            input = scanner.nextLine().toLowerCase();
        }


    }
}
