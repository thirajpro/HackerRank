package HackerRank;

import java.util.Scanner;

public class ExceptionHandling extends Throwable{


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z= x/y;
            System.out.println(z);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
