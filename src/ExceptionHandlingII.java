import java.util.Scanner;

public class ExceptionHandlingII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            if ((n == 0) && (p == 0)) {
                System.out.println("java.lang.Exception: n and p should not be zero");
            } else if ((n < 0) || (p < 0)) {
                System.out.println("java.lang.Exception: n or p should not be negative");
            } else {
                System.out.println(((int) Math.pow(n, p)));
            }
        }
    }
}
