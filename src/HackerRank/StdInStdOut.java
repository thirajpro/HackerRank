package HackerRank;
import java.util.*;

public class StdInStdOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        Double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println("String : " + s);
        System.out.println("Double : " + d);
        System.out.println("Int : " + i);
    }
}
